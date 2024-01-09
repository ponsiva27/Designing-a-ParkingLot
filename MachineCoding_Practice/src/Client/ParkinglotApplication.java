package Client;

import ParkingLot.Models.Repository.GateRepository;

import ParkingLot.Models.Repository.ParkinglotRepository;
import ParkingLot.Models.Repository.TicketRepository;
import ParkingLot.Models.Repository.VehicleRepository;
import TicketService.TicketService;
import ParkingLot.Models.Controllers.*;
import ParkingLot.Models.Enums.GateType;
import ParkingLot.Models.Enums.SloatAllocationStrategyType;
import ParkingLot.Models.*;
import java.util.*;


public class ParkinglotApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GateRepository gate = new GateRepository();
		VehicleRepository vehicle = new VehicleRepository();
		TicketRepository ticket = new TicketRepository();
		ParkinglotRepository parking = new ParkinglotRepository();
		
		TicketService service = new TicketService(gate, vehicle, parking, ticket);
		
		  //System.out.println(service.generateTicket("TN 10 A1030", "Ponsiva", 2));
	
		TicketController controller = new TicketController(service);
		
		initialiseDatabase();
		
		ClientRunning run = new ClientRunning(controller);
		run.generateIncomingRequests();
		
		//System.out.println("check my code is working");
	}
	
	private static void initialiseDatabase(){
        Operator entryGateOperator = new Operator("111", "op1");
        Operator exitGateOperator = new Operator("222", "op2");

        Gate gate1 = new Gate(1, entryGateOperator, GateType.ENTRY);
        Gate gate2 = new Gate(2, exitGateOperator, GateType.EXIT);

        List<Gate> gateList = new ArrayList<>();
        gateList.add(gate1);
        gateList.add(gate2);

        ParkingFloor floor1 = new ParkingFloor(1);      

        List<ParkingFloor> parkingFloorsList = new ArrayList<>();
        parkingFloorsList.add(floor1);   // parking floor with floor 1

        Parkinglot parkingLot = new Parkinglot();
        parkingLot.setGates(gateList);   
        parkingLot.setSlotAllocationStrategyType(SloatAllocationStrategyType.RANDOM);
        parkingLot.setParkingfloors(parkingFloorsList);

        GateRepository.gatetable.put(1L, gate1);
        GateRepository.gatetable.put(2L, gate2);

        ParkinglotRepository.parkinglotTable.put(1L, parkingLot);
    }

}
