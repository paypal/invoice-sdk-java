package com.paypal.svcs.types.pt;
import java.util.Map;

/**
 * Details of the paypal refund made against this invoice. 
 */
public class PayPalPaymentRefundDetailsType{


	/**
	 * Date when the invoice was marked as refunded by PayPal. 	 
	 */ 
	private String date;

	

	/**
	 * Default Constructor
	 */
	public PayPalPaymentRefundDetailsType (){
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
	 


	public PayPalPaymentRefundDetailsType(Map<String, String> map, String prefix) {
		prefix = prefix.substring(0, prefix.length() - 1);
		this.date = map.get(prefix + "date");
	}

}