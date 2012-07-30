package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.PayPalPaymentRefundDetailsType;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
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
	 * details.  	 
	 */ 
	private OtherPaymentRefundDetailsType otherPayment;

	

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
	 


	public PaymentRefundDetailsType(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "viaPayPal")){
			this.viaPayPal = Boolean.valueOf(map.get(prefix + "viaPayPal"));
		}
		if(map.containsKey(prefix + "paypalPayment")){
			String newPrefix = prefix + "paypalPayment" + ".";
			this.paypalPayment =  new PayPalPaymentRefundDetailsType(map, newPrefix);
		}
		if(map.containsKey(prefix + "otherPayment.note") || map.containsKey(prefix + "otherPayment.date")){
			String newPrefix = prefix + "otherPayment" + ".";
			this.otherPayment =  new OtherPaymentRefundDetailsType(map, newPrefix);
		}
       
	}

}