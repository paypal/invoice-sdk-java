package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import java.util.Map;

/**
 * A list of other paymentss. 
 */
public class OtherPaymentDetailsListType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<OtherPaymentDetailsType> payment = new ArrayList<OtherPaymentDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public OtherPaymentDetailsListType (){
	}	

	/**
	 * Getter for payment
	 */
	 public List<OtherPaymentDetailsType> getPayment() {
	 	return payment;
	 }
	 
	/**
	 * Setter for payment
	 */
	 public void setPayment(List<OtherPaymentDetailsType> payment) {
	 	this.payment = payment;
	 }
	 


	
	public static OtherPaymentDetailsListType createInstance(Map<String, String> map, String prefix, int index) {
		OtherPaymentDetailsListType otherPaymentDetailsListType = null;
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
			OtherPaymentDetailsType payment =  OtherPaymentDetailsType.createInstance(map, prefix + "payment", i);
			if (payment != null) {
				otherPaymentDetailsListType = (otherPaymentDetailsListType == null) ? new OtherPaymentDetailsListType() : otherPaymentDetailsListType;
				otherPaymentDetailsListType.getPayment().add(payment);
				i++;
			} else {
				break;
			}
		}
		return otherPaymentDetailsListType;
	}
 
}