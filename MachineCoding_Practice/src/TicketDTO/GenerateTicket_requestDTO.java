package TicketDTO;

import ParkingLot.Models.Vehicle;
import ParkingLot.Models.Enums.VehicleTypes;

public class GenerateTicket_requestDTO {
	
	private String vehicleNumber;
	private String ownerName;
	private VehicleTypes vehicleType;
	private long  gateNumber;
	
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(long gateNumber) {
		this.gateNumber = gateNumber;
	}
	public VehicleTypes getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleTypes vehicleType) {
		this.vehicleType = vehicleType;
	}
	

}
