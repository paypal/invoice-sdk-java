package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.PayPalPaymentDetailsType;
import java.util.Map;

/**
 * A list of paypal paymentss. 
 */
public class PayPalPaymentDetailsListType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<PayPalPaymentDetailsType> payment = new ArrayList<PayPalPaymentDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public PayPalPaymentDetailsListType (){
	}	

	/**
	 * Getter for payment
	 */
	 public List<PayPalPaymentDetailsType> getPayment() {
	 	return payment;
	 }
	 
	/**
	 * Setter for payment
	 */
	 public void setPayment(List<PayPalPaymentDetailsType> payment) {
	 	this.payment = payment;
	 }
	 


	
	public static PayPalPaymentDetailsListType createInstance(Map<String, String> map, String prefix, int index) {
		PayPalPaymentDetailsListType payPalPaymentDetailsListType = null;
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
			
		i = 0;
		while(true) {
			PayPalPaymentDetailsType payment =  PayPalPaymentDetailsType.createInstance(map, prefix + "payment", i);
			if (payment != null) {
				payPalPaymentDetailsListType = (payPalPaymentDetailsListType == null) ? new PayPalPaymentDetailsListType() : payPalPaymentDetailsListType;
				payPalPaymentDetailsListType.getPayment().add(payment);
				i++;
			} else {
				break;
			}
		}
		return payPalPaymentDetailsListType;
	}
 
}