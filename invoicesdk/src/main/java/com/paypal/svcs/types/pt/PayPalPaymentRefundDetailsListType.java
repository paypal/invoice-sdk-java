package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.PayPalPaymentRefundDetailsType;
import java.util.Map;

/**
 * A list of other paymentss. 
 */
public class PayPalPaymentRefundDetailsListType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<PayPalPaymentRefundDetailsType> payment = new ArrayList<PayPalPaymentRefundDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public PayPalPaymentRefundDetailsListType (){
	}	

	/**
	 * Getter for payment
	 */
	 public List<PayPalPaymentRefundDetailsType> getPayment() {
	 	return payment;
	 }
	 
	/**
	 * Setter for payment
	 */
	 public void setPayment(List<PayPalPaymentRefundDetailsType> payment) {
	 	this.payment = payment;
	 }
	 


	
	public static PayPalPaymentRefundDetailsListType createInstance(Map<String, String> map, String prefix, int index) {
		PayPalPaymentRefundDetailsListType payPalPaymentRefundDetailsListType = null;
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
			PayPalPaymentRefundDetailsType payment =  PayPalPaymentRefundDetailsType.createInstance(map, prefix + "payment", i);
			if (payment != null) {
				payPalPaymentRefundDetailsListType = (payPalPaymentRefundDetailsListType == null) ? new PayPalPaymentRefundDetailsListType() : payPalPaymentRefundDetailsListType;
				payPalPaymentRefundDetailsListType.getPayment().add(payment);
				i++;
			} else {
				break;
			}
		}
		return payPalPaymentRefundDetailsListType;
	}
 
}