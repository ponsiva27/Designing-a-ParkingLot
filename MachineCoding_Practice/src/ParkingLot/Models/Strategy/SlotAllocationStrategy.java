package ParkingLot.Models.Strategy;

import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Models.Parkinglot;
import ParkingLot.Models.Enums.VehicleTypes;

public interface SlotAllocationStrategy {
	
	public ParkingSlot getParkingSlot(Gate gate, VehicleTypes vehicleType);

}
