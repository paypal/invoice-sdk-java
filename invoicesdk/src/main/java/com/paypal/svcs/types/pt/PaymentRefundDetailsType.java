package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.PayPalPaymentRefundDetailsType;
import com.paypal.svcs.types.pt.PayPalPaymentRefundDetailsListType;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsListType;
import java.util.Map;

/**
 * Payment refund details about the invoice.  
 */
public class PaymentRefundDetailsType{


	/**
	 * True if the invoice was refunded using PayPal.  	  
	 *@Required	 
	 */ 
	private Boolean viaPayPal;

	/**
	 * Other payment refund details.  	 
	 */ 
	private PayPalPaymentRefundDetailsType paypalPayment;

	/**
	 * Other payment refund details.  	 
	 */ 
	private PayPalPaymentRefundDetailsListType paypalPayments;

	/**
	 * details.  	 
	 */ 
	private OtherPaymentRefundDetailsType otherPayment;

	/**
	 * details.  	 
	 */ 
	private OtherPaymentRefundDetailsListType otherPayments;

	

	/**
	 * Default Constructor
	 */
	public PaymentRefundDetailsType (){
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
	 public PayPalPaymentRefundDetailsType getPaypalPayment() {
	 	return paypalPayment;
	 }
	 
	/**
	 * Setter for paypalPayment
	 */
	 public void setPaypalPayment(PayPalPaymentRefundDetailsType paypalPayment) {
	 	this.paypalPayment = paypalPayment;
	 }
	 
	/**
	 * Getter for paypalPayments
	 */
	 public PayPalPaymentRefundDetailsListType getPaypalPayments() {
	 	return paypalPayments;
	 }
	 
	/**
	 * Setter for paypalPayments
	 */
	 public void setPaypalPayments(PayPalPaymentRefundDetailsListType paypalPayments) {
	 	this.paypalPayments = paypalPayments;
	 }
	 
	/**
	 * Getter for otherPayment
	 */
	 public OtherPaymentRefundDetailsType getOtherPayment() {
	 	return otherPayment;
	 }
	 
	/**
	 * Setter for otherPayment
	 */
	 public void setOtherPayment(OtherPaymentRefundDetailsType otherPayment) {
	 	this.otherPayment = otherPayment;
	 }
	 
	/**
	 * Getter for otherPayments
	 */
	 public OtherPaymentRefundDetailsListType getOtherPayments() {
	 	return otherPayments;
	 }
	 
	/**
	 * Setter for otherPayments
	 */
	 public void setOtherPayments(OtherPaymentRefundDetailsListType otherPayments) {
	 	this.otherPayments = otherPayments;
	 }
	 


	
	public static PaymentRefundDetailsType createInstance(Map<String, String> map, String prefix, int index) {
		PaymentRefundDetailsType paymentRefundDetailsType = null;
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
			
		if (map.containsKey(prefix + "viaPayPal")) {
				paymentRefundDetailsType = (paymentRefundDetailsType == null) ? new PaymentRefundDetailsType() : paymentRefundDetailsType;
				paymentRefundDetailsType.setViaPayPal(Boolean.valueOf(map.get(prefix + "viaPayPal")));
		}
		PayPalPaymentRefundDetailsType paypalPayment =  PayPalPaymentRefundDetailsType.createInstance(map, prefix + "paypalPayment", -1);
		if (paypalPayment != null) {
			paymentRefundDetailsType = (paymentRefundDetailsType == null) ? new PaymentRefundDetailsType() : paymentRefundDetailsType;
			paymentRefundDetailsType.setPaypalPayment(paypalPayment);
		}
		PayPalPaymentRefundDetailsListType paypalPayments =  PayPalPaymentRefundDetailsListType.createInstance(map, prefix + "paypalPayments", -1);
		if (paypalPayments != null) {
			paymentRefundDetailsType = (paymentRefundDetailsType == null) ? new PaymentRefundDetailsType() : paymentRefundDetailsType;
			paymentRefundDetailsType.setPaypalPayments(paypalPayments);
		}
		OtherPaymentRefundDetailsType otherPayment =  OtherPaymentRefundDetailsType.createInstance(map, prefix + "otherPayment", -1);
		if (otherPayment != null) {
			paymentRefundDetailsType = (paymentRefundDetailsType == null) ? new PaymentRefundDetailsType() : paymentRefundDetailsType;
			paymentRefundDetailsType.setOtherPayment(otherPayment);
		}
		OtherPaymentRefundDetailsListType otherPayments =  OtherPaymentRefundDetailsListType.createInstance(map, prefix + "otherPayments", -1);
		if (otherPayments != null) {
			paymentRefundDetailsType = (paymentRefundDetailsType == null) ? new PaymentRefundDetailsType() : paymentRefundDetailsType;
			paymentRefundDetailsType.setOtherPayments(otherPayments);
		}
		return paymentRefundDetailsType;
	}
 
}