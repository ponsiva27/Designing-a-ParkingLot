package ParkingLot.Models;

import ParkingLot.Models.Enums.GateStatus;
import ParkingLot.Models.Enums.GateType;

public class Gate extends BaseModel {
	
	private int gateNumber;
	private GateType gatetype;
	private Operator currentOperator;
	private GateStatus gateStatus;
	
	public Gate(int gateNumber, Operator currentOperator, GateType gatetype) {
		this.gateNumber =gateNumber;
		this.currentOperator = currentOperator;
		this.gatetype = gatetype;
	}
	
	
	public int getGateNumber() {
		return gateNumber;
		
	}
	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}
	public GateType getGatetype() {
		return gatetype;
	}
	public void setGatetype(GateType gatetype) {
		this.gatetype = gatetype;
	}
	public Operator getCurrentOperator() {
		return currentOperator;
	}
	public void setCurrentOperator(Operator currentOperator) {
		this.currentOperator = currentOperator;
	}
	public GateStatus getGateStatus() {
		return gateStatus;
	}
	public void setGateStatus(GateStatus gateStatus) {
		this.gateStatus = gateStatus;
	}
	
	
	

}
