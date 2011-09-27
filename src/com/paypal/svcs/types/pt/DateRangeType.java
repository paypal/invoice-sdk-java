
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import java.io.UnsupportedEncodingException;


/**
 * Determines an inclusive date range.
 */
public class DateRangeType {

	/**
	 * Start of the date range.
	 */
	private String startDate;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String value) {
		this.startDate = value;
	}

	/**
	 * End of the date range.
	 */
	private String endDate;
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String value) {
		this.endDate = value;
	}



	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( startDate != null ) {
			sb.append(prefix).append("startDate=").append(NVPUtil.encodeUrl(startDate));
			sb.append('&');
		}
		if( endDate != null ) {
			sb.append(prefix).append("endDate=").append(NVPUtil.encodeUrl(endDate));
			sb.append('&');
		}
		return sb.toString();
	}

}
