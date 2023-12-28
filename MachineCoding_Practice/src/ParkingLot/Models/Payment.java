package ParkingLot.Models;

import java.util.Date;

import ParkingLot.Models.Enums.PaymentMode;
import ParkingLot.Models.Enums.PaymentStatus;

public class Payment extends BaseModel{
	
	private PaymentMode paymentMode;
	private PaymentStatus paymentStatus;
	private int Amount;
	private String referenceNumber;
	private Date Timestamp;
	private Bill bill;
	
	
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public int getAmount() {
		return Amount;
	}
	
	public void setAmount(int amount) {
		Amount = amount;
	}
	
	public String getReferenceNumber() {
		return referenceNumber;
	}
	
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
	public Date getTimestamp() {
		return Timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}
	
	public Bill getBill() {
		return bill;
	}
	
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	

	
	

}
