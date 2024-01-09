package Client;

import ParkingLot.Models.Controllers.TicketController;
import ParkingLot.Models.Enums.VehicleTypes;
import TicketDTO.GenerateTicket_ResponseDTO;
import TicketDTO.GenerateTicket_requestDTO;

public class ClientRunning {
	
	TicketController ticketController;

    public ClientRunning(TicketController ticketController){
        this.ticketController = ticketController;
    }
    
    public void generateIncomingRequests(){
        testCase1();
        testCase2();
    }

	private void testCase1() {
		// TODO Auto-generated method stub
		
		GenerateTicket_requestDTO request = new GenerateTicket_requestDTO();
		request.setGateNumber(1L);
		request.setOwnerName("Ponsiva");
		request.setVehicleNumber("TN10 A1030");
		request.setVehicleType(VehicleTypes.BIKE);
		
		GenerateTicket_ResponseDTO responseDTO = ticketController.generateTicket(request);
		System.out.println("Status : " + responseDTO.getResponseStatus());
        System.out.println("TicketGenerated : " + responseDTO.getTicket().getVehicle().getVehicleNumber());
        System.out.println(responseDTO.getTicket().getTicketNumber());
        System.out.println();
		
		}
	
	private void testCase2() {
		GenerateTicket_requestDTO request = new GenerateTicket_requestDTO();
		request.setGateNumber(1L);
		request.setOwnerName("Ponsiva");
		request.setVehicleNumber("TN10 A1030");
		request.setVehicleType(VehicleTypes.BIKE);
		
		GenerateTicket_ResponseDTO responseDTO = ticketController.generateTicket(request);
		System.out.println("Status : " + responseDTO.getResponseStatus());
        System.out.println("TicketGenerated : " + responseDTO.getTicket().getVehicle().getVehicleNumber());
        System.out.println(responseDTO.getTicket().getTicketNumber());
		
	}


}
