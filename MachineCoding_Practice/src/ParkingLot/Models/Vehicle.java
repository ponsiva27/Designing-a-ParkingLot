package ParkingLot.Models;

import ParkingLot.Models.Enums.VehicleTypes;

public class Vehicle extends BaseModel {
	
	private String VehicleNumber;
	private VehicleTypes vehicleType;
	private String ownerName;
	public String getVehicleNumber() {
		return VehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}
	public VehicleTypes getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleTypes vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	

}
