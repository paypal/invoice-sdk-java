package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.PaymentTransactionType;
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
	 * Payment amount. If empty, it means a full payment. 	 
	 */ 
	private Double amount;

	/**
	 * Payment Transaction Type. 	  
	 *@Required	 
	 */ 
	private PaymentTransactionType transactionType;

	

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
	 
	/**
	 * Getter for transactionType
	 */
	 public PaymentTransactionType getTransactionType() {
	 	return transactionType;
	 }
	 
	/**
	 * Setter for transactionType
	 */
	 public void setTransactionType(PaymentTransactionType transactionType) {
	 	this.transactionType = transactionType;
	 }
	 


	
	public static PayPalPaymentDetailsType createInstance(Map<String, String> map, String prefix, int index) {
		PayPalPaymentDetailsType payPalPaymentDetailsType = null;
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
				payPalPaymentDetailsType = (payPalPaymentDetailsType == null) ? new PayPalPaymentDetailsType() : payPalPaymentDetailsType;
				payPalPaymentDetailsType.setTransactionID(map.get(prefix + "transactionID"));
		}
		if (map.containsKey(prefix + "date")) {
				payPalPaymentDetailsType = (payPalPaymentDetailsType == null) ? new PayPalPaymentDetailsType() : payPalPaymentDetailsType;
				payPalPaymentDetailsType.setDate(map.get(prefix + "date"));
		}
		if (map.containsKey(prefix + "amount")) {
				payPalPaymentDetailsType = (payPalPaymentDetailsType == null) ? new PayPalPaymentDetailsType() : payPalPaymentDetailsType;
				payPalPaymentDetailsType.setAmount(Double.valueOf(map.get(prefix + "amount")));
		}
		if (map.containsKey(prefix + "transactionType")) {
				payPalPaymentDetailsType = (payPalPaymentDetailsType == null) ? new PayPalPaymentDetailsType() : payPalPaymentDetailsType;
				payPalPaymentDetailsType.setTransactionType(PaymentTransactionType.fromValue(map.get(prefix + "transactionType")));
		}
		return payPalPaymentDetailsType;
	}
 
}