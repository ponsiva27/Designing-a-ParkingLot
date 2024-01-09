package ParkingLot.Models.Repository;

import java.util.Optional;
import java.util.TreeMap;
import java.util.Map;

import ParkingLot.Models.Gate;

public class GateRepository {
	
	public static  Map<Long, Gate> gatetable = new TreeMap<>();
	
	public Optional<Gate> getGateNumber(long gateNumber) {
		// String response = db.exuecte("START * FROM GATE WHERE gateNumber = gateNumber");
		//Gate gateObject = stringToGateObject(response);
		//if(gateObject!=null){
		 //  optional.of(gateobject);
		//}
		
		if(gatetable.containsKey(gateNumber)) {
			return Optional.of(gatetable.get(gateNumber));
		}
		
		return Optional.empty();
	}

}
