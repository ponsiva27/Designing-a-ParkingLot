package ParkingLot.Models;

import java.util.*;

import ParkingLot.Models.Enums.ParkingFloorStatus;
import ParkingLot.Models.Enums.VehicleTypes;


public class ParkingFloor extends BaseModel {
	
	private int floorNumber;
	
	private List<ParkingSlot> parkingslot;
	
	private List<VehicleTypes> vehicleTypes;
	private ParkingFloorStatus  parkingFloorStatus;
	
	public ParkingFloor(int floorNumber) {
		this.floorNumber = floorNumber;
		this.parkingslot = new ArrayList<>();
		this.vehicleTypes = new ArrayList<>();
		this.parkingFloorStatus = ParkingFloorStatus.OPEN;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public List<ParkingSlot> getParkingslot() {
		return parkingslot;
	}
	public void setParkingslot(List<ParkingSlot> parkingslot) {
		this.parkingslot = parkingslot;
	}
	public List<VehicleTypes> getVehicleTypes() {
		return vehicleTypes;
	}
	public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}
	public ParkingFloorStatus getFloorStatus() {
		return parkingFloorStatus;
	}
	public void setFloorStatus(ParkingFloorStatus floorStatus) {
		this.parkingFloorStatus = parkingFloorStatus;
	}
	
	

}
