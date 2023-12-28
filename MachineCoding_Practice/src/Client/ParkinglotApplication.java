package Client;

import ParkingLot.Models.Repository.GateRepository;
import ParkingLot.Models.Repository.ParkinglotRepository;
import ParkingLot.Models.Repository.TicketRepository;
import ParkingLot.Models.Repository.VehicleRepository;
import TicketService.TicketService;
import ParkingLot.Models.Controllers.*;

public class ParkinglotApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GateRepository gate = new GateRepository();
		VehicleRepository vehicle = new VehicleRepository();
		TicketRepository ticket = new TicketRepository();
		ParkinglotRepository parking = new ParkinglotRepository();
		
		TicketService service = new TicketService(gate, vehicle, parking, ticket);
		
		TicketController controller = new TicketController(service);
		
		System.out.println("check my code is working");
	}

}
