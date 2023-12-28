package ParkingLot.Models;

import java.util.List;

import ParkingLot.Models.Enums.ParkingSlotStatus;
import ParkingLot.Models.Enums.VehicleTypes;

public class ParkingSlot  extends BaseModel{
	
	private VehicleTypes vehicletypes;
	
	private Vehicle Vehicle;
	private List<ParkingFloor> parkingfloor;
	private ParkingSlotStatus parkingslotStatus;
	
	
	public VehicleTypes getVehicletypes() {
		return vehicletypes;
	}
	
	public void setVehicletypes(VehicleTypes vehicletypes) {
		this.vehicletypes = vehicletypes;
	}
	
	public Vehicle getVehicle() {
		return Vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}
	
	public List<ParkingFloor> getParkingfloor() {
		return parkingfloor;
	}
	
	public void setParkingfloor(List<ParkingFloor> parkingfloor) {
		this.parkingfloor = parkingfloor;
	}
	
	public ParkingSlotStatus getParkingslotStatus() {
		return parkingslotStatus;
	}
	
	public void setParkingslotStatus(ParkingSlotStatus parkingslotStatus) {
		this.parkingslotStatus = parkingslotStatus;
	}
	

}
