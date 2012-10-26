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
	 


	
	public static PayPalPaymentRefundDetailsType createInstance(Map<String, String> map, String prefix, int index) {
		PayPalPaymentRefundDetailsType payPalPaymentRefundDetailsType = null;
		int i = 0;
		if (index != -1) {
				if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		if (map.containsKey(prefix + "date")) {
				payPalPaymentRefundDetailsType = (payPalPaymentRefundDetailsType == null) ? new PayPalPaymentRefundDetailsType() : payPalPaymentRefundDetailsType;
				payPalPaymentRefundDetailsType.setDate(map.get(prefix + "date"));
		}
		return payPalPaymentRefundDetailsType;
	}
 
}