package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.PayPalPaymentDetailsType;
import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import java.util.Map;

/**
 * Payment details about the invoice. 
 */
public class PaymentDetailsType{


	/**
	 * True if the invoice was paid using PayPal. 	  
	 *@Required	 
	 */ 
	private Boolean viaPayPal;

	/**
	 * PayPal payment details. 	 
	 */ 
	private PayPalPaymentDetailsType paypalPayment;

	/**
	 * Other payment details. 	 
	 */ 
	private OtherPaymentDetailsType otherPayment;

	

	/**
	 * Default Constructor
	 */
	public PaymentDetailsType (){
	}	

	/**
	 * Getter for viaPayPal
	 */
	 public Boolean getViaPayPal() {
	 	return viaPayPal;
	 }
	 
	/**
	 * Setter for viaPayPal
	 */
	 public void setViaPayPal(Boolean viaPayPal) {
	 	this.viaPayPal = viaPayPal;
	 }
	 
	/**
	 * Getter for paypalPayment
	 */
	 public PayPalPaymentDetailsType getPaypalPayment() {
	 	return paypalPayment;
	 }
	 
	/**
	 * Setter for paypalPayment
	 */
	 public void setPaypalPayment(PayPalPaymentDetailsType paypalPayment) {
	 	this.paypalPayment = paypalPayment;
	 }
	 
	/**
	 * Getter for otherPayment
	 */
	 public OtherPaymentDetailsType getOtherPayment() {
	 	return otherPayment;
	 }
	 
	/**
	 * Setter for otherPayment
	 */
	 public void setOtherPayment(OtherPaymentDetailsType otherPayment) {
	 	this.otherPayment = otherPayment;
	 }
	 


	public PaymentDetailsType(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "viaPayPal")){
			this.viaPayPal = Boolean.valueOf(map.get(prefix + "viaPayPal"));
		}
		if(map.containsKey(prefix + "paypalPayment" + ".transactionID")){
			String newPrefix = prefix + "paypalPayment" + ".";
			this.paypalPayment =  new PayPalPaymentDetailsType(map, newPrefix);
		}
		if(map.containsKey(prefix + "otherPayment")){
			String newPrefix = prefix + "otherPayment" + ".";
			this.otherPayment =  new OtherPaymentDetailsType(map, newPrefix);
		}
	}

}