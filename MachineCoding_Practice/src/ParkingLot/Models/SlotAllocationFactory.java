package ParkingLot.Models;

import ParkingLot.Models.Enums.SloatAllocationStrategyType;
import ParkingLot.Models.Strategy.FarestSlotAllocationStrategy;
import ParkingLot.Models.Strategy.NearestSlotAllocationStrategy;
import ParkingLot.Models.Strategy.RandomSlotAllocationStrategy;
import ParkingLot.Models.Strategy.SlotAllocationStrategy;

public class SlotAllocationFactory  {
	
	
	public static SlotAllocationStrategy getSlotAllocationStrategyType (SloatAllocationStrategyType type) {
		switch(type) {
			
		case RANDOM :  return new RandomSlotAllocationStrategy();
		case NEAR_TO_GATE :  return new NearestSlotAllocationStrategy();
		case FAR_FROM_GATE : return new FarestSlotAllocationStrategy();
		default :  throw new IllegalArgumentException ("Invalid Slot Allocation Strategy Type");
		}
	}

}
