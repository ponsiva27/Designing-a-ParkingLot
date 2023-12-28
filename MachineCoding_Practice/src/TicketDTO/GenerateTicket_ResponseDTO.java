package TicketDTO;

import ParkingLot.Models.Ticket;
import ParkingLot.Models.Enums.ResponseStatus;

public class GenerateTicket_ResponseDTO {
	
	private Ticket ticket;
	
	private String message;
	
	private ResponseStatus responseStatus;
	
	

	public Ticket getTicket() {
		return ticket;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	
	
}
