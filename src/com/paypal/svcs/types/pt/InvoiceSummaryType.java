package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.StatusType;
import com.paypal.svcs.types.pt.OriginType;
import java.util.Map;

/**
 * Summary of invoice information. 
 */
public class InvoiceSummaryType{


	/**
	 * The created invoice's ID. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * Invoice creator's email. 	  
	 *@Required	 
	 */ 
	private String merchantEmail;

	/**
	 * Email to which the invoice will be sent. 	  
	 *@Required	 
	 */ 
	private String payerEmail;

	/**
	 * Unique identifier for the invoice. 	  
	 *@Required	 
	 */ 
	private String number;

	/**
	 * Business name of the billing info. 	 
	 */ 
	private String billingBusinessName;

	/**
	 * First name of the billing info. 	 
	 */ 
	private String billingFirstName;

	/**
	 * Last name of the billing info. 	 
	 */ 
	private String billingLastName;

	/**
	 * Business name of the shipping info. 	 
	 */ 
	private String shippingBusinessName;

	/**
	 * First name of the shipping info. 	 
	 */ 
	private String shippingFirstName;

	/**
	 * Last name of the shipping info. 	 
	 */ 
	private String shippingLastName;

	/**
	 * Total amount of the invoice. 	  
	 *@Required	 
	 */ 
	private Double totalAmount;

	/**
	 * Currency used for all invoice item amounts and totals. 	  
	 *@Required	 
	 */ 
	private String currencyCode;

	/**
	 * Date on which the invoice will be enabled. 	  
	 *@Required	 
	 */ 
	private String invoiceDate;

	/**
	 * Date on which the invoice payment is due. 	  
	 *@Required	 
	 */ 
	private String dueDate;

	/**
	 * Status of the invoice. 	  
	 *@Required	 
	 */ 
	private StatusType status;

	/**
	 * Whether the invoice was created via the website or via an
	 * API call. 	  
	 *@Required	 
	 */ 
	private OriginType origin;

	/**
	 * BN code for tracking transactions with a particular partner.
	 * 	 
	 */ 
	private String referrerCode;

	

	/**
	 * Default Constructor
	 */
	public InvoiceSummaryType (){
	}	

	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for merchantEmail
	 */
	 public String getMerchantEmail() {
	 	return merchantEmail;
	 }
	 
	/**
	 * Setter for merchantEmail
	 */
	 public void setMerchantEmail(String merchantEmail) {
	 	this.merchantEmail = merchantEmail;
	 }
	 
	/**
	 * Getter for payerEmail
	 */
	 public String getPayerEmail() {
	 	return payerEmail;
	 }
	 
	/**
	 * Setter for payerEmail
	 */
	 public void setPayerEmail(String payerEmail) {
	 	this.payerEmail = payerEmail;
	 }
	 
	/**
	 * Getter for number
	 */
	 public String getNumber() {
	 	return number;
	 }
	 
	/**
	 * Setter for number
	 */
	 public void setNumber(String number) {
	 	this.number = number;
	 }
	 
	/**
	 * Getter for billingBusinessName
	 */
	 public String getBillingBusinessName() {
	 	return billingBusinessName;
	 }
	 
	/**
	 * Setter for billingBusinessName
	 */
	 public void setBillingBusinessName(String billingBusinessName) {
	 	this.billingBusinessName = billingBusinessName;
	 }
	 
	/**
	 * Getter for billingFirstName
	 */
	 public String getBillingFirstName() {
	 	return billingFirstName;
	 }
	 
	/**
	 * Setter for billingFirstName
	 */
	 public void setBillingFirstName(String billingFirstName) {
	 	this.billingFirstName = billingFirstName;
	 }
	 
	/**
	 * Getter for billingLastName
	 */
	 public String getBillingLastName() {
	 	return billingLastName;
	 }
	 
	/**
	 * Setter for billingLastName
	 */
	 public void setBillingLastName(String billingLastName) {
	 	this.billingLastName = billingLastName;
	 }
	 
	/**
	 * Getter for shippingBusinessName
	 */
	 public String getShippingBusinessName() {
	 	return shippingBusinessName;
	 }
	 
	/**
	 * Setter for shippingBusinessName
	 */
	 public void setShippingBusinessName(String shippingBusinessName) {
	 	this.shippingBusinessName = shippingBusinessName;
	 }
	 
	/**
	 * Getter for shippingFirstName
	 */
	 public String getShippingFirstName() {
	 	return shippingFirstName;
	 }
	 
	/**
	 * Setter for shippingFirstName
	 */
	 public void setShippingFirstName(String shippingFirstName) {
	 	this.shippingFirstName = shippingFirstName;
	 }
	 
	/**
	 * Getter for shippingLastName
	 */
	 public String getShippingLastName() {
	 	return shippingLastName;
	 }
	 
	/**
	 * Setter for shippingLastName
	 */
	 public void setShippingLastName(String shippingLastName) {
	 	this.shippingLastName = shippingLastName;
	 }
	 
	/**
	 * Getter for totalAmount
	 */
	 public Double getTotalAmount() {
	 	return totalAmount;
	 }
	 
	/**
	 * Setter for totalAmount
	 */
	 public void setTotalAmount(Double totalAmount) {
	 	this.totalAmount = totalAmount;
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
	 * Getter for invoiceDate
	 */
	 public String getInvoiceDate() {
	 	return invoiceDate;
	 }
	 
	/**
	 * Setter for invoiceDate
	 */
	 public void setInvoiceDate(String invoiceDate) {
	 	this.invoiceDate = invoiceDate;
	 }
	 
	/**
	 * Getter for dueDate
	 */
	 public String getDueDate() {
	 	return dueDate;
	 }
	 
	/**
	 * Setter for dueDate
	 */
	 public void setDueDate(String dueDate) {
	 	this.dueDate = dueDate;
	 }
	 
	/**
	 * Getter for status
	 */
	 public StatusType getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(StatusType status) {
	 	this.status = status;
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
	 * Getter for referrerCode
	 */
	 public String getReferrerCode() {
	 	return referrerCode;
	 }
	 
	/**
	 * Setter for referrerCode
	 */
	 public void setReferrerCode(String referrerCode) {
	 	this.referrerCode = referrerCode;
	 }
	 


	
	public static InvoiceSummaryType createInstance(Map<String, String> map, String prefix, int index) {
		InvoiceSummaryType invoiceSummaryType = null;
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
			
		if (map.containsKey(prefix + "invoiceID")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setInvoiceID(map.get(prefix + "invoiceID"));
		}
		if (map.containsKey(prefix + "merchantEmail")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setMerchantEmail(map.get(prefix + "merchantEmail"));
		}
		if (map.containsKey(prefix + "payerEmail")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setPayerEmail(map.get(prefix + "payerEmail"));
		}
		if (map.containsKey(prefix + "number")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setNumber(map.get(prefix + "number"));
		}
		if (map.containsKey(prefix + "billingBusinessName")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setBillingBusinessName(map.get(prefix + "billingBusinessName"));
		}
		if (map.containsKey(prefix + "billingFirstName")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setBillingFirstName(map.get(prefix + "billingFirstName"));
		}
		if (map.containsKey(prefix + "billingLastName")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setBillingLastName(map.get(prefix + "billingLastName"));
		}
		if (map.containsKey(prefix + "shippingBusinessName")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setShippingBusinessName(map.get(prefix + "shippingBusinessName"));
		}
		if (map.containsKey(prefix + "shippingFirstName")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setShippingFirstName(map.get(prefix + "shippingFirstName"));
		}
		if (map.containsKey(prefix + "shippingLastName")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setShippingLastName(map.get(prefix + "shippingLastName"));
		}
		if (map.containsKey(prefix + "totalAmount")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setTotalAmount(Double.valueOf(map.get(prefix + "totalAmount")));
		}
		if (map.containsKey(prefix + "currencyCode")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setCurrencyCode(map.get(prefix + "currencyCode"));
		}
		if (map.containsKey(prefix + "invoiceDate")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setInvoiceDate(map.get(prefix + "invoiceDate"));
		}
		if (map.containsKey(prefix + "dueDate")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setDueDate(map.get(prefix + "dueDate"));
		}
		if (map.containsKey(prefix + "status")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setStatus(StatusType.fromValue(map.get(prefix + "status")));
		}
		if (map.containsKey(prefix + "origin")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setOrigin(OriginType.fromValue(map.get(prefix + "origin")));
		}
		if (map.containsKey(prefix + "referrerCode")) {
				invoiceSummaryType = (invoiceSummaryType == null) ? new InvoiceSummaryType() : invoiceSummaryType;
				invoiceSummaryType.setReferrerCode(map.get(prefix + "referrerCode"));
		}
		return invoiceSummaryType;
	}
 
}