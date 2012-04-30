
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.StatusType;
import java.util.Map;


/**
 * Summary of invoice information.
 */
public class InvoiceSummaryType {

	/**
	 * The created invoice's ID.
	 *
	 * @Required
	 */
	private String invoiceID;
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String value) {
		this.invoiceID = value;
	}

	/**
	 * Invoice creator's email.
	 *
	 * @Required
	 */
	private String merchantEmail;
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String value) {
		this.merchantEmail = value;
	}

	/**
	 * Email to which the invoice will be sent.
	 *
	 * @Required
	 */
	private String payerEmail;
	public String getPayerEmail() {
		return payerEmail;
	}
	public void setPayerEmail(String value) {
		this.payerEmail = value;
	}

	/**
	 * Unique identifier for the invoice.
	 *
	 * @Required
	 */
	private String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String value) {
		this.number = value;
	}

	/**
	 * Business name of the billing info.
	 */
	private String billingBusinessName;
	public String getBillingBusinessName() {
		return billingBusinessName;
	}
	public void setBillingBusinessName(String value) {
		this.billingBusinessName = value;
	}

	/**
	 * First name of the billing info.
	 */
	private String billingFirstName;
	public String getBillingFirstName() {
		return billingFirstName;
	}
	public void setBillingFirstName(String value) {
		this.billingFirstName = value;
	}

	/**
	 * Last name of the billing info.
	 */
	private String billingLastName;
	public String getBillingLastName() {
		return billingLastName;
	}
	public void setBillingLastName(String value) {
		this.billingLastName = value;
	}

	/**
	 * Business name of the shipping info.
	 */
	private String shippingBusinessName;
	public String getShippingBusinessName() {
		return shippingBusinessName;
	}
	public void setShippingBusinessName(String value) {
		this.shippingBusinessName = value;
	}

	/**
	 * First name of the shipping info.
	 */
	private String shippingFirstName;
	public String getShippingFirstName() {
		return shippingFirstName;
	}
	public void setShippingFirstName(String value) {
		this.shippingFirstName = value;
	}

	/**
	 * Last name of the shipping info.
	 */
	private String shippingLastName;
	public String getShippingLastName() {
		return shippingLastName;
	}
	public void setShippingLastName(String value) {
		this.shippingLastName = value;
	}

	/**
	 * Total amount of the invoice.
	 *
	 * @Required
	 */
	private Double totalAmount;
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double value) {
		this.totalAmount = value;
	}

	/**
	 * Currency used for all invoice item amounts and totals.
	 *
	 * @Required
	 */
	private String currencyCode;
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	/**
	 * Date on which the invoice will be enabled.
	 *
	 * @Required
	 */
	private String invoiceDate;
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String value) {
		this.invoiceDate = value;
	}

	/**
	 * Date on which the invoice payment is due.
	 *
	 * @Required
	 */
	private String dueDate;
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String value) {
		this.dueDate = value;
	}

	/**
	 * Status of the invoice.
	 *
	 * @Required
	 */
	private StatusType status;
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType value) {
		this.status = value;
	}

	/**
	 * Whether the invoice was created via the website or via an API call.
	 *
	 * @Required
	 */
	private OriginType origin;
	public OriginType getOrigin() {
		return origin;
	}
	public void setOrigin(OriginType value) {
		this.origin = value;
	}

	/**
	 * BN code for tracking transactions with a particular partner. 
	 */
	private String referrerCode;
	public String getReferrerCode() {
		return referrerCode;
	}
	public void setReferrerCode(String value) {
		this.referrerCode = value;
	}


	public InvoiceSummaryType() {
	}
	public InvoiceSummaryType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "invoiceID") ) {
			this.invoiceID = map.get(prefix + "invoiceID");
		}
		if( map.containsKey(prefix + "merchantEmail") ) {
			this.merchantEmail = map.get(prefix + "merchantEmail");
		}
		if( map.containsKey(prefix + "payerEmail") ) {
			this.payerEmail = map.get(prefix + "payerEmail");
		}
		if( map.containsKey(prefix + "number") ) {
			this.number = map.get(prefix + "number");
		}
		if( map.containsKey(prefix + "billingBusinessName") ) {
			this.billingBusinessName = map.get(prefix + "billingBusinessName");
		}
		if( map.containsKey(prefix + "billingFirstName") ) {
			this.billingFirstName = map.get(prefix + "billingFirstName");
		}
		if( map.containsKey(prefix + "billingLastName") ) {
			this.billingLastName = map.get(prefix + "billingLastName");
		}
		if( map.containsKey(prefix + "shippingBusinessName") ) {
			this.shippingBusinessName = map.get(prefix + "shippingBusinessName");
		}
		if( map.containsKey(prefix + "shippingFirstName") ) {
			this.shippingFirstName = map.get(prefix + "shippingFirstName");
		}
		if( map.containsKey(prefix + "shippingLastName") ) {
			this.shippingLastName = map.get(prefix + "shippingLastName");
		}
		if( map.containsKey(prefix + "totalAmount") ) {
			this.totalAmount = Double.valueOf(map.get(prefix + "totalAmount"));
		}
		if( map.containsKey(prefix + "currencyCode") ) {
			this.currencyCode = map.get(prefix + "currencyCode");
		}
		if( map.containsKey(prefix + "invoiceDate") ) {
			this.invoiceDate = map.get(prefix + "invoiceDate");
		}
		if( map.containsKey(prefix + "dueDate") ) {
			this.dueDate = map.get(prefix + "dueDate");
		}
		if( map.containsKey(prefix + "status") ) {
			this.status = StatusType.fromValue( map.get(prefix + "status") );
		}
		if( map.containsKey(prefix + "origin") ) {
			this.origin = OriginType.fromValue( map.get(prefix + "origin") );
		}
		if( map.containsKey(prefix + "referrerCode") ) {
			this.referrerCode = map.get(prefix + "referrerCode");
		}
	}
}
