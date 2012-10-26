package com.paypal.svcs.types.pt;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Determines an inclusive date range. 
 */
public class DateRangeType{


	/**
	 * Start of the date range. 	 
	 */ 
	private String startDate;

	/**
	 * End of the date range. 	 
	 */ 
	private String endDate;

	

	/**
	 * Default Constructor
	 */
	public DateRangeType (){
	}	

	/**
	 * Getter for startDate
	 */
	 public String getStartDate() {
	 	return startDate;
	 }
	 
	/**
	 * Setter for startDate
	 */
	 public void setStartDate(String startDate) {
	 	this.startDate = startDate;
	 }
	 
	/**
	 * Getter for endDate
	 */
	 public String getEndDate() {
	 	return endDate;
	 }
	 
	/**
	 * Setter for endDate
	 */
	 public void setEndDate(String endDate) {
	 	this.endDate = endDate;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (startDate != null) {
			sb.append(prefix).append("startDate=").append(NVPUtil.encodeUrl(startDate));
			sb.append("&");
		}
		if (endDate != null) {
			sb.append(prefix).append("endDate=").append(NVPUtil.encodeUrl(endDate));
			sb.append("&");
		}
		return sb.toString();
	}

}