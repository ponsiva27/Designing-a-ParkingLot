package TicketService;

import java.util.Date;
import java.util.Optional;

import ParkingLot.Models.Ticket;
import ParkingLot.Models.Vehicle;
import ParkingLot.Models.Enums.SloatAllocationStrategyType;
import ParkingLot.Models.Enums.VehicleTypes;
import ParkingLot.Models.Repository.GateRepository;
import ParkingLot.Models.Repository.ParkinglotRepository;
import ParkingLot.Models.Repository.TicketRepository;
import ParkingLot.Models.Repository.VehicleRepository;
import ParkingLot.Models.Strategy.SlotAllocationStrategy;
import TicketDTO.GenerateTicket_requestDTO;
import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Models.Parkinglot;
import ParkingLot.Models.SlotAllocationFactory;

public class TicketService {
	
	private GateRepository gateRepository;
	private VehicleRepository vehicleRepository;
	private ParkinglotRepository parkinglotRepository;
	private TicketRepository ticketRepository;
	
	
	public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkinglotRepository parkinglotRepository, TicketRepository ticketRepository) {
		this.gateRepository = gateRepository;
		this.vehicleRepository = vehicleRepository;
		this.parkinglotRepository = parkinglotRepository;
		this.ticketRepository = ticketRepository;
	}
	

	public Ticket generateTicket(String vehicleNumber, String ownerName, VehicleTypes vehicleType, long gateNumber) {
		// TODO Auto-generated method stub
		
		//1. Create a ticket.
		Ticket ticket = new Ticket();
		
		
		//2. Fill the attributes of ticket.
		

		//3.a ticket Entry time
		ticket.setEntryTime(new Date());
		
		//4. set Gate
			Optional<Gate> gateOptioanl = gateRepository.getGateNumber(gateNumber);
			
			if(!gateOptioanl.isPresent()) {
				throw  new IllegalArgumentException ("Invalid Gate Number !!"+ "Please Enter a valid Gate Number");
			} 
		
			Gate gate = gateOptioanl.get();
			ticket.setGeneratedAt(gate);
		
		//5. set operator
			ticket.setGeneratedBy(gate.getCurrentOperator());
		
		//6. set vehicle
			// 1. get the vehicle number from the table if the customer visits often.
			//2. if the vehicle not found in the table add to the table and retrieve it from there.
			Optional<Vehicle> vehicleOptional = vehicleRepository.getVehiclenumber(vehicleNumber);
			Vehicle savedVehicle;
			
			 if(!vehicleOptional.isPresent()) {   //if the vehicle is not present then we are adding to the DB table
				 Vehicle vehicle = new Vehicle();
				 vehicle.setVehicleNumber(vehicleNumber);
				 vehicle.setOwnerName(ownerName);
				 vehicle.setVehicleType(vehicleType);
				 
				 //save this data to the DB
			savedVehicle = vehicleRepository.saveVehicle(vehicle);
			System.out.println("DB Saved Vehicle "+ savedVehicle);
			
				
				 
			 } else {
				 savedVehicle = vehicleOptional.get();
				 System.out.println("vehicle already exist");
				 
			 }
			 
			 ticket.setVehicle(savedVehicle);
		
		//7. assigned slot number
			 Optional<Parkinglot> parking = parkinglotRepository.getParkinglotBygateNumber(gate);
			 if(!parking.isPresent()) {
				 throw new IllegalArgumentException("No parking slot found");
			 }
			 Parkinglot parkinglot = parking.get();
			 SloatAllocationStrategyType strategyType = parkinglot.getSlotAllocationStrategyType();
			 SlotAllocationStrategy  allocationStrategy = SlotAllocationFactory.getSlotAllocationStrategyType(strategyType);
			 ParkingSlot assignedSlot = allocationStrategy.getParkingSlot(gate, vehicleType);
			 ticket.setParkingSlot(assignedSlot);
			
		// 7a. save the ticket to the DB.
			ticket = ticketRepository.saveTicket(ticket);
			
			
			
			ticket.setTicketNumber("TicketNumber"+ ticket.getId());
			
			  
			
			
		//8. return to the response DTO at last these are the task for the service.
		return ticket;
	}

}
