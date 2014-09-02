package com.paypal.svcs.types.pt;
import java.util.Map;

/**
 * Details of the paypal refund made against this invoice. 
 */
public class PayPalPaymentRefundDetailsType{


	/**
	 * Transaction ID of the PayPal refund. 	  
	 *@Required	 
	 */ 
	private String transactionID;

	/**
	 * Date when the invoice was marked as refunded by PayPal. 	 
	 */ 
	private String date;

	/**
	 * Refund amount, if empty, it means a full refund. 	 
	 */ 
	private Double amount;

	

	/**
	 * Default Constructor
	 */
	public PayPalPaymentRefundDetailsType (){
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
	 
	/**
	 * Getter for amount
	 */
	 public Double getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(Double amount) {
	 	this.amount = amount;
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
			
		if (map.containsKey(prefix + "transactionID")) {
				payPalPaymentRefundDetailsType = (payPalPaymentRefundDetailsType == null) ? new PayPalPaymentRefundDetailsType() : payPalPaymentRefundDetailsType;
				payPalPaymentRefundDetailsType.setTransactionID(map.get(prefix + "transactionID"));
		}
		if (map.containsKey(prefix + "date")) {
				payPalPaymentRefundDetailsType = (payPalPaymentRefundDetailsType == null) ? new PayPalPaymentRefundDetailsType() : payPalPaymentRefundDetailsType;
				payPalPaymentRefundDetailsType.setDate(map.get(prefix + "date"));
		}
		if (map.containsKey(prefix + "amount")) {
				payPalPaymentRefundDetailsType = (payPalPaymentRefundDetailsType == null) ? new PayPalPaymentRefundDetailsType() : payPalPaymentRefundDetailsType;
				payPalPaymentRefundDetailsType.setAmount(Double.valueOf(map.get(prefix + "amount")));
		}
		return payPalPaymentRefundDetailsType;
	}
 
}