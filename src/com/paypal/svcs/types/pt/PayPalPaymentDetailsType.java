package com.paypal.svcs.types.pt;
import java.util.Map;

/**
 * PayPal payment details about the invoice. 
 */
public class PayPalPaymentDetailsType{


	/**
	 * Transaction ID of the PayPal payment. 	  
	 *@Required	 
	 */ 
	private String transactionID;

	/**
	 * Date when the invoice was paid. 	 
	 */ 
	private String date;

	

	/**
	 * Default Constructor
	 */
	public PayPalPaymentDetailsType (){
	}	

	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
	 }
	 
	/**
	 * Getter for date
	 */
	 public String getDate() {
	 	return date;
	 }
	 
	/**
	 * Setter for date
	 */
	 public void setDate(String date) {
	 	this.date = date;
	 }
	 


	public PayPalPaymentDetailsType(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "transactionID")){
			this.transactionID = map.get(prefix + "transactionID");
		}
		if(map.containsKey(prefix + "date")){
			this.date = map.get(prefix + "date");
		}
	}

}