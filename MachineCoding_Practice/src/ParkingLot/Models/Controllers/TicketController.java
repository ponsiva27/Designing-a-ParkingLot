package ParkingLot.Models.Controllers;

import ParkingLot.Models.Ticket;
import ParkingLot.Models.Enums.ResponseStatus;
import TicketDTO.GenerateTicket_ResponseDTO;
import TicketDTO.GenerateTicket_requestDTO;
import TicketService.TicketService;

public class TicketController {
	
	TicketService service;
	
	/*
	 * When we use TicketService service = new TicketService(); //we are basically
	 * interacting the controller directly with the service. //this can leads to
	 * tight coupling so we are taking the reference of ticketservice (Service) and passing to the controller
	 * whenever it's required the service.
	 */
	
	
	//Dependency Injection
	public TicketController(TicketService service) {
		this.service =service;
		
	}
	
	public GenerateTicket_ResponseDTO generateTicket(GenerateTicket_requestDTO requestDTO) {
	
		GenerateTicket_ResponseDTO responseDTO = new GenerateTicket_ResponseDTO();
		
		try {
			Ticket ticket = service.generateTicket(requestDTO.getVehicleNumber(), 
														 requestDTO.getOwnerName(),
														 requestDTO.getVehicleType(),
														 requestDTO.getGateNumber()
														 );
			
			responseDTO.setTicket(ticket);
			responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block

			responseDTO.setResponseStatus(ResponseStatus.FAIL);
			responseDTO.setMessage(e.getMessage());
			
		}
		
			return responseDTO;
			
		
		
	}

}
