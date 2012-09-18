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
	 


	
	public static PaymentDetailsType createInstance(Map<String, String> map, String prefix, int index) {
		PaymentDetailsType paymentDetailsType = null;
		int i = 0;
		if (index != -1) {
				if (!prefix.isEmpty() && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (!prefix.isEmpty() && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		if (map.containsKey(prefix + "viaPayPal")) {
				paymentDetailsType = (paymentDetailsType == null) ? new PaymentDetailsType() : paymentDetailsType;
				paymentDetailsType.setViaPayPal(Boolean.valueOf(map.get(prefix + "viaPayPal")));
		}
		PayPalPaymentDetailsType paypalPayment =  PayPalPaymentDetailsType.createInstance(map, prefix + "paypalPayment", -1);
		if (paypalPayment != null) {
			paymentDetailsType = (paymentDetailsType == null) ? new PaymentDetailsType() : paymentDetailsType;
			paymentDetailsType.setPaypalPayment(paypalPayment);
		}
		OtherPaymentDetailsType otherPayment =  OtherPaymentDetailsType.createInstance(map, prefix + "otherPayment", -1);
		if (otherPayment != null) {
			paymentDetailsType = (paymentDetailsType == null) ? new PaymentDetailsType() : paymentDetailsType;
			paymentDetailsType.setOtherPayment(otherPayment);
		}
		return paymentDetailsType;
	}
 
}