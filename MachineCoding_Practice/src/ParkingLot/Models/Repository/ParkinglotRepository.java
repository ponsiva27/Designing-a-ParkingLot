package ParkingLot.Models.Repository;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Optional;

import ParkingLot.Models.Gate;
import ParkingLot.Models.Parkinglot;

public class ParkinglotRepository {
	
	
	public static Map<Long, Parkinglot> parkinglotTable = new HashMap<>();
	
	
	public Optional<Parkinglot> getParkinglotBygateNumber(Gate gate) {
		 
		        // write a for loop over all parkingLot and nested loop for gate.
		        // easiest would be, the client also gives the parkingLot id, the machine will give the parkingLot id.

//		        String response = db.execute("select * from parking_lots");
//		        List<Parkinglot> parkingLots = convertToParkingLotList(response);
		
		        List<Parkinglot> parkinglotList = new ArrayList(parkinglotTable.values());
		        
		        for(Parkinglot parkinglots : parkinglotList) {
		        	List <Gate> gateList = parkinglots.getGates();  
		        		  for(Gate gates : gateList) {          // this gate matches with the given gate number then that's the answer for parking lot
		        			   if(gates.getGateNumber()== gate.getGateNumber()) { 
		        				   return Optional.of(parkinglots);
		        			   }
		        		 }
		        }
		        
		
		    
		 return  Optional.empty();
	}

}
