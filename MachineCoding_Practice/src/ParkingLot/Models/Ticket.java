package ParkingLot.Models;

import java.util.Date;

public class Ticket extends BaseModel {
	
	private Date entryTime;
	private String TicketNumber;
	private Vehicle vehicle;
	private Gate generatedAt;
	private Operator generatedBy;
	private ParkingSlot parkingSlot;
	
	
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public String getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		TicketNumber = ticketNumber;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Gate getGeneratedAt() {
		return generatedAt;
	}
	public void setGeneratedAt(Gate generatedAt) {
		this.generatedAt = generatedAt;
	}
	public Operator getGeneratedBy() {
		return generatedBy;
	}
	public void setGeneratedBy(Operator generatedBy) {
		this.generatedBy = generatedBy;
	}
	public ParkingSlot getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(ParkingSlot parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
	
	

}
