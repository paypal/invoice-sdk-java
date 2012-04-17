
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.pt.DateRangeType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.StatusType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * Search parameters criteria.
 */
public class SearchParametersType {

	/**
	 * Email search string.
	 */
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Recipient search string.
	 */
	private String recipientName;
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String value) {
		this.recipientName = value;
	}

	/**
	 * Company search string.
	 */
	private String businessName;
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String value) {
		this.businessName = value;
	}

	/**
	 * Invoice number search string.
	 */
	private String invoiceNumber;
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	/**
	 * Invoice status search.
	 */
	private List<StatusType> status = new ArrayList<StatusType>();
	public List<StatusType> getStatus() {
		return status;
	}
	public void setStatus(List<StatusType> value) {
		this.status = value;
	}

	/**
	 * Invoice amount search.  Specifies the smallest amount to be returned.
	 */
	private Double lowerAmount;
	public Double getLowerAmount() {
		return lowerAmount;
	}
	public void setLowerAmount(Double value) {
		this.lowerAmount = value;
	}

	/**
	 * Invoice amount search.  Specifies the largest amount to be returned.
	 */
	private Double upperAmount;
	public Double getUpperAmount() {
		return upperAmount;
	}
	public void setUpperAmount(Double value) {
		this.upperAmount = value;
	}

	/**
	 * Currency used for lower and upper amounts.  Required when lowerAmount or upperAmount is specified.
	 */
	private String currencyCode;
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	/**
	 * Invoice memo search string.
	 */
	private String memo;
	public String getMemo() {
		return memo;
	}
	public void setMemo(String value) {
		this.memo = value;
	}

	/**
	 * Whether the invoice was created via the website or via an API call.
	 */
	private OriginType origin;
	public OriginType getOrigin() {
		return origin;
	}
	public void setOrigin(OriginType value) {
		this.origin = value;
	}

	/**
	 * Invoice date range filter.
	 */
	private DateRangeType invoiceDate;
	public DateRangeType getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(DateRangeType value) {
		this.invoiceDate = value;
	}

	/**
	 * Invoice due date range filter.
	 */
	private DateRangeType dueDate;
	public DateRangeType getDueDate() {
		return dueDate;
	}
	public void setDueDate(DateRangeType value) {
		this.dueDate = value;
	}

	/**
	 * Invoice payment date range filter.
	 */
	private DateRangeType paymentDate;
	public DateRangeType getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(DateRangeType value) {
		this.paymentDate = value;
	}

	/**
	 * Invoice creation date range filter.
	 */
	private DateRangeType creationDate;
	public DateRangeType getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(DateRangeType value) {
		this.creationDate = value;
	}



	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( email != null ) {
			sb.append(prefix).append("email=").append(NVPUtil.encodeUrl(email));
			sb.append('&');
		}
		if( recipientName != null ) {
			sb.append(prefix).append("recipientName=").append(NVPUtil.encodeUrl(recipientName));
			sb.append('&');
		}
		if( businessName != null ) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(businessName));
			sb.append('&');
		}
		if( invoiceNumber != null ) {
			sb.append(prefix).append("invoiceNumber=").append(NVPUtil.encodeUrl(invoiceNumber));
			sb.append('&');
		}
		if( status != null ) {
			for(int i=0; i<status.size(); i++) {
				sb.append(prefix).append("status(").append(i).append(")=").append(status.get(i).getValue());
				sb.append('&');
			}
		}
		if( lowerAmount != null ) {
			sb.append(prefix).append("lowerAmount=").append(lowerAmount);
			sb.append('&');
		}
		if( upperAmount != null ) {
			sb.append(prefix).append("upperAmount=").append(upperAmount);
			sb.append('&');
		}
		if( currencyCode != null ) {
			sb.append(prefix).append("currencyCode=").append(NVPUtil.encodeUrl(currencyCode));
			sb.append('&');
		}
		if( memo != null ) {
			sb.append(prefix).append("memo=").append(NVPUtil.encodeUrl(memo));
			sb.append('&');
		}
		if( origin != null ) {
			sb.append(prefix).append("origin=").append(origin.getValue());
			sb.append('&');
		}
		if( invoiceDate != null ) {
			String newPrefix = prefix + "invoiceDate.";
			sb.append(invoiceDate.toNVPString(newPrefix));
		}
		if( dueDate != null ) {
			String newPrefix = prefix + "dueDate.";
			sb.append(dueDate.toNVPString(newPrefix));
		}
		if( paymentDate != null ) {
			String newPrefix = prefix + "paymentDate.";
			sb.append(paymentDate.toNVPString(newPrefix));
		}
		if( creationDate != null ) {
			String newPrefix = prefix + "creationDate.";
			sb.append(creationDate.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
