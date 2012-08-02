package com.paypal.svcs.types.pt;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * Details of the refund made against this invoice. 
 */
public class OtherPaymentRefundDetailsType{


	/**
	 * Optional note associated with the refund. 	 
	 */ 
	private String note;

	/**
	 * Date when the invoice was marked as refunded. If the date is
	 * not specified, the current date and time is used as a
	 * default. In addition, the date must be after the payment
	 * date of the invoice. 	 
	 */ 
	private String date;

	

	/**
	 * Default Constructor
	 */
	public OtherPaymentRefundDetailsType (){
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
	
	public static OtherPaymentRefundDetailsType createInstance(Map<String, String> map, String prefix, int index) {
		OtherPaymentRefundDetailsType otherPaymentRefundDetailsType = null;
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
			
		if (map.containsKey(prefix + "note")) {
				otherPaymentRefundDetailsType = (otherPaymentRefundDetailsType == null) ? new OtherPaymentRefundDetailsType() : otherPaymentRefundDetailsType;
				otherPaymentRefundDetailsType.setNote(map.get(prefix + "note"));
		}
		if (map.containsKey(prefix + "date")) {
				otherPaymentRefundDetailsType = (otherPaymentRefundDetailsType == null) ? new OtherPaymentRefundDetailsType() : otherPaymentRefundDetailsType;
				otherPaymentRefundDetailsType.setDate(map.get(prefix + "date"));
		}
		return otherPaymentRefundDetailsType;
	}
 
}