package ParkingLot.Models;

import java.util.List;

import ParkingLot.Models.Enums.FeesCalculatingStraretyTypes;
import ParkingLot.Models.Enums.ParkingLotStatus;
import ParkingLot.Models.Enums.SloatAllocationStrategyType;
import ParkingLot.Models.Enums.VehicleTypes;
import ParkingLot.Models.Strategy.FeesCalculatingStrategy;


import java.util.*;


public class Parkinglot extends BaseModel {
	
 	private List<ParkingFloor> parkingfloors;
 	private  List<Gate> gates;
 	private List<VehicleTypes> vehicleTypes;
 	private  ParkingLotStatus status;
 	public FeesCalculatingStraretyTypes getFeesCalculatingStrategyType() {
		return feesCalculatingStrategyType;
	}

	public void setFeesCalculatingStrategyType(FeesCalculatingStraretyTypes feesCalculatingStrategyType) {
		this.feesCalculatingStrategyType = feesCalculatingStrategyType;
	}

	public SloatAllocationStrategyType getSlotAllocationStrategyType() {
		return slotAllocationStrategyType;
	}

	public void setSlotAllocationStrategyType(SloatAllocationStrategyType slotAllocationStrategyType) {
		this.slotAllocationStrategyType = slotAllocationStrategyType;
	}

	private FeesCalculatingStraretyTypes feesCalculatingStrategyType;
 	private SloatAllocationStrategyType slotAllocationStrategyType;
 	
 	public Parkinglot() {
 		this.parkingfloors = new ArrayList<>();
 		this.gates = new ArrayList<>();
 		this.vehicleTypes = new ArrayList<>();
 		this.status = ParkingLotStatus.OPEN;
 		this.feesCalculatingStrategyType = feesCalculatingStrategyType.Hourly;
 		this.slotAllocationStrategyType = slotAllocationStrategyType.RANDOM;
 	}
 	
	public List<ParkingFloor> getParkingfloors() {
		return parkingfloors;
	}
	
	public void setParkingfloors(List<ParkingFloor> parkingfloors) {
		this.parkingfloors = parkingfloors;
	}
	
	public List<Gate> getGates() {
		return gates;
	}
	
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	
	public List<VehicleTypes> getVehicleTypes() {
		return vehicleTypes;
	}
	
	public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}
	
	public ParkingLotStatus getStatus() {
		return status;
	}
	
	public void setStatus(ParkingLotStatus status) {
		this.status = status;
	}


}
