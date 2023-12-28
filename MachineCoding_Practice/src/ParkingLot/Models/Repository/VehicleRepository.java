package ParkingLot.Models.Repository;

import java.util.*;
import java.util.Optional;

import ParkingLot.Models.Vehicle;

public class VehicleRepository {
	
	private Map<String, Vehicle> vehicletable = new TreeMap<>();
	
	
	public Optional<Vehicle> getVehiclenumber(String VehicleNumber) {
		//String response = db.execute("SELECT * FROM Vehicle WHERE VehicleNumber = VehicleNumber");
			
		 //Vehicle vehicleOption =  stringToVehicleObject(response);
		
//		 if(vehicleOption!=null) {
//			 return Optional.of(vehicleOption);
		
			if(vehicletable.containsKey(VehicleNumber)) {
				return Optional.of(vehicletable.get(VehicleNumber));
			}
//		 }
		 
		 return Optional.empty();
		 
	}
	
	public Vehicle saveVehicle(Vehicle vehicle) {
		//db.execute ("INSERT INTO Vehicle (Vehicle_number, ownerName, VehicleType) VALUES  (vehicle.getVehicleNumber, vehicle.getOwnerName, vehicle.getVehicleTypes)");
		//String response = db.execute("SELECT * FROM Vehicle WHERE VehicleNumber = VehicleNumber");
		// Vehicle VehicleOption = ConvertToVehicleObject(response);
		
		vehicletable.put(vehicle.getVehicleNumber(), vehicle);
		
		return vehicle;
	}

}
