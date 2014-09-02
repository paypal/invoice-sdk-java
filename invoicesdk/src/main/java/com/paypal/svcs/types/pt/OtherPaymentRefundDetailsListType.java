package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
import java.util.Map;

/**
 * A list of other paymentss. 
 */
public class OtherPaymentRefundDetailsListType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<OtherPaymentRefundDetailsType> payment = new ArrayList<OtherPaymentRefundDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public OtherPaymentRefundDetailsListType (){
	}	

	/**
	 * Getter for payment
	 */
	 public List<OtherPaymentRefundDetailsType> getPayment() {
	 	return payment;
	 }
	 
	/**
	 * Setter for payment
	 */
	 public void setPayment(List<OtherPaymentRefundDetailsType> payment) {
	 	this.payment = payment;
	 }
	 


	
	public static OtherPaymentRefundDetailsListType createInstance(Map<String, String> map, String prefix, int index) {
		OtherPaymentRefundDetailsListType otherPaymentRefundDetailsListType = null;
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
			OtherPaymentRefundDetailsType payment =  OtherPaymentRefundDetailsType.createInstance(map, prefix + "payment", i);
			if (payment != null) {
				otherPaymentRefundDetailsListType = (otherPaymentRefundDetailsListType == null) ? new OtherPaymentRefundDetailsListType() : otherPaymentRefundDetailsListType;
				otherPaymentRefundDetailsListType.getPayment().add(payment);
				i++;
			} else {
				break;
			}
		}
		return otherPaymentRefundDetailsListType;
	}
 
}