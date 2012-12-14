package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.StatusType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.DateRangeType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Search parameters criteria. 
 */
public class SearchParametersType{


	/**
	 * Email search string. 	 
	 */ 
	private String email;

	/**
	 * Recipient search string. 	 
	 */ 
	private String recipientName;

	/**
	 * Company search string. 	 
	 */ 
	private String businessName;

	/**
	 * Invoice number search string. 	 
	 */ 
	private String invoiceNumber;

	/**
	 * Invoice status search. 	 
	 */ 
	private List<StatusType> status = new ArrayList<StatusType>();

	/**
	 * Invoice amount search. Specifies the smallest amount to be
	 * returned. 	 
	 */ 
	private Double lowerAmount;

	/**
	 * Invoice amount search. Specifies the largest amount to be
	 * returned. 	 
	 */ 
	private Double upperAmount;

	/**
	 * Currency used for lower and upper amounts. Required when
	 * lowerAmount or upperAmount is specified. 	 
	 */ 
	private String currencyCode;

	/**
	 * Invoice memo search string. 	 
	 */ 
	private String memo;

	/**
	 * Whether the invoice was created via the website or via an
	 * API call. 	 
	 */ 
	private OriginType origin;

	/**
	 * Invoice date range filter. 	 
	 */ 
	private DateRangeType invoiceDate;

	/**
	 * Invoice due date range filter. 	 
	 */ 
	private DateRangeType dueDate;

	/**
	 * Invoice payment date range filter. 	 
	 */ 
	private DateRangeType paymentDate;

	/**
	 * Invoice creation date range filter. 	 
	 */ 
	private DateRangeType creationDate;

	

	/**
	 * Default Constructor
	 */
	public SearchParametersType (){
	}	

	/**
	 * Getter for email
	 */
	 public String getEmail() {
	 	return email;
	 }
	 
	/**
	 * Setter for email
	 */
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 
	/**
	 * Getter for recipientName
	 */
	 public String getRecipientName() {
	 	return recipientName;
	 }
	 
	/**
	 * Setter for recipientName
	 */
	 public void setRecipientName(String recipientName) {
	 	this.recipientName = recipientName;
	 }
	 
	/**
	 * Getter for businessName
	 */
	 public String getBusinessName() {
	 	return businessName;
	 }
	 
	/**
	 * Setter for businessName
	 */
	 public void setBusinessName(String businessName) {
	 	this.businessName = businessName;
	 }
	 
	/**
	 * Getter for invoiceNumber
	 */
	 public String getInvoiceNumber() {
	 	return invoiceNumber;
	 }
	 
	/**
	 * Setter for invoiceNumber
	 */
	 public void setInvoiceNumber(String invoiceNumber) {
	 	this.invoiceNumber = invoiceNumber;
	 }
	 
	/**
	 * Getter for status
	 */
	 public List<StatusType> getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(List<StatusType> status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for lowerAmount
	 */
	 public Double getLowerAmount() {
	 	return lowerAmount;
	 }
	 
	/**
	 * Setter for lowerAmount
	 */
	 public void setLowerAmount(Double lowerAmount) {
	 	this.lowerAmount = lowerAmount;
	 }
	 
	/**
	 * Getter for upperAmount
	 */
	 public Double getUpperAmount() {
	 	return upperAmount;
	 }
	 
	/**
	 * Setter for upperAmount
	 */
	 public void setUpperAmount(Double upperAmount) {
	 	this.upperAmount = upperAmount;
	 }
	 
	/**
	 * Getter for currencyCode
	 */
	 public String getCurrencyCode() {
	 	return currencyCode;
	 }
	 
	/**
	 * Setter for currencyCode
	 */
	 public void setCurrencyCode(String currencyCode) {
	 	this.currencyCode = currencyCode;
	 }
	 
	/**
	 * Getter for memo
	 */
	 public String getMemo() {
	 	return memo;
	 }
	 
	/**
	 * Setter for memo
	 */
	 public void setMemo(String memo) {
	 	this.memo = memo;
	 }
	 
	/**
	 * Getter for origin
	 */
	 public OriginType getOrigin() {
	 	return origin;
	 }
	 
	/**
	 * Setter for origin
	 */
	 public void setOrigin(OriginType origin) {
	 	this.origin = origin;
	 }
	 
	/**
	 * Getter for invoiceDate
	 */
	 public DateRangeType getInvoiceDate() {
	 	return invoiceDate;
	 }
	 
	/**
	 * Setter for invoiceDate
	 */
	 public void setInvoiceDate(DateRangeType invoiceDate) {
	 	this.invoiceDate = invoiceDate;
	 }
	 
	/**
	 * Getter for dueDate
	 */
	 public DateRangeType getDueDate() {
	 	return dueDate;
	 }
	 
	/**
	 * Setter for dueDate
	 */
	 public void setDueDate(DateRangeType dueDate) {
	 	this.dueDate = dueDate;
	 }
	 
	/**
	 * Getter for paymentDate
	 */
	 public DateRangeType getPaymentDate() {
	 	return paymentDate;
	 }
	 
	/**
	 * Setter for paymentDate
	 */
	 public void setPaymentDate(DateRangeType paymentDate) {
	 	this.paymentDate = paymentDate;
	 }
	 
	/**
	 * Getter for creationDate
	 */
	 public DateRangeType getCreationDate() {
	 	return creationDate;
	 }
	 
	/**
	 * Setter for creationDate
	 */
	 public void setCreationDate(DateRangeType creationDate) {
	 	this.creationDate = creationDate;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.email != null) {
			sb.append(prefix).append("email=").append(NVPUtil.encodeUrl(this.email));
			sb.append("&");
		}
		if (this.recipientName != null) {
			sb.append(prefix).append("recipientName=").append(NVPUtil.encodeUrl(this.recipientName));
			sb.append("&");
		}
		if (this.businessName != null) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(this.businessName));
			sb.append("&");
		}
		if (this.invoiceNumber != null) {
			sb.append(prefix).append("invoiceNumber=").append(NVPUtil.encodeUrl(this.invoiceNumber));
			sb.append("&");
		}
		if (this.status != null) {
			for(int i=0; i < this.status.size(); i++) {
				sb.append(prefix).append("status(").append(i).append(")=").append(this.status.get(i).getValue());
				sb.append("&");
			}
		}
		if (this.lowerAmount != null) {
			sb.append(prefix).append("lowerAmount=").append(this.lowerAmount);
			sb.append("&");
		}
		if (this.upperAmount != null) {
			sb.append(prefix).append("upperAmount=").append(this.upperAmount);
			sb.append("&");
		}
		if (this.currencyCode != null) {
			sb.append(prefix).append("currencyCode=").append(NVPUtil.encodeUrl(this.currencyCode));
			sb.append("&");
		}
		if (this.memo != null) {
			sb.append(prefix).append("memo=").append(NVPUtil.encodeUrl(this.memo));
			sb.append("&");
		}
		if (this.origin != null) {
			sb.append(prefix).append("origin=").append(this.origin.getValue());
			sb.append("&");
		}
		if (this.invoiceDate != null) {
			String newPrefix = prefix + "invoiceDate.";
			sb.append(this.invoiceDate.toNVPString(newPrefix));
		}
		if (this.dueDate != null) {
			String newPrefix = prefix + "dueDate.";
			sb.append(this.dueDate.toNVPString(newPrefix));
		}
		if (this.paymentDate != null) {
			String newPrefix = prefix + "paymentDate.";
			sb.append(this.paymentDate.toNVPString(newPrefix));
		}
		if (this.creationDate != null) {
			String newPrefix = prefix + "creationDate.";
			sb.append(this.creationDate.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}