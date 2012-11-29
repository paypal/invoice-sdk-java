package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.PaymentMethodsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * Offline payment details about the invoice. 
 */
public class OtherPaymentDetailsType{


	/**
	 * Method used for the offline payment. 	 
	 */ 
	private PaymentMethodsType method;

	/**
	 * Optional note associated with the payment. 	 
	 */ 
	private String note;

	/**
	 * Date when the invoice was paid. 	 
	 */ 
	private String date;

	

	/**
	 * Default Constructor
	 */
	public OtherPaymentDetailsType (){
	}	

	/**
	 * Getter for method
	 */
	 public PaymentMethodsType getMethod() {
	 	return method;
	 }
	 
	/**
	 * Setter for method
	 */
	 public void setMethod(PaymentMethodsType method) {
	 	this.method = method;
	 }
	 
	/**
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
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
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (method != null) {
			sb.append(prefix).append("method=").append(method.getValue());
			sb.append("&");
		}
		if (note != null) {
			sb.append(prefix).append("note=").append(NVPUtil.encodeUrl(note));
			sb.append("&");
		}
		if (date != null) {
			sb.append(prefix).append("date=").append(NVPUtil.encodeUrl(date));
			sb.append("&");
		}
		return sb.toString();
	}
	
	public static OtherPaymentDetailsType createInstance(Map<String, String> map, String prefix, int index) {
		OtherPaymentDetailsType otherPaymentDetailsType = null;
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
			
		if (map.containsKey(prefix + "method")) {
				otherPaymentDetailsType = (otherPaymentDetailsType == null) ? new OtherPaymentDetailsType() : otherPaymentDetailsType;
				otherPaymentDetailsType.setMethod(PaymentMethodsType.fromValue(map.get(prefix + "method")));
		}
		if (map.containsKey(prefix + "note")) {
				otherPaymentDetailsType = (otherPaymentDetailsType == null) ? new OtherPaymentDetailsType() : otherPaymentDetailsType;
				otherPaymentDetailsType.setNote(map.get(prefix + "note"));
		}
		if (map.containsKey(prefix + "date")) {
				otherPaymentDetailsType = (otherPaymentDetailsType == null) ? new OtherPaymentDetailsType() : otherPaymentDetailsType;
				otherPaymentDetailsType.setDate(map.get(prefix + "date"));
		}
		return otherPaymentDetailsType;
	}
 
}