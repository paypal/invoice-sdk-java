
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.pt.BusinessInfoType;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.PaymentTermsType;
import java.io.UnsupportedEncodingException;
import java.util.Map;


/**
 * Invoice details about the merchant, payer, totals and terms.
 */
public class InvoiceType {

	/**
	 * Merchant's email.
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
	 */
	private String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String value) {
		this.number = value;
	}

	/**
	 * Company contact information of the merchant company sending the invoice.
	 */
	private BusinessInfoType merchantInfo;
	public BusinessInfoType getMerchantInfo() {
		return merchantInfo;
	}
	public void setMerchantInfo(BusinessInfoType value) {
		this.merchantInfo = value;
	}

	/**
	 * List of items included in this invoice.
	 *
	 * @Required
	 */
	private InvoiceItemListType itemList;
	public InvoiceItemListType getItemList() {
		return itemList;
	}
	public void setItemList(InvoiceItemListType value) {
		this.itemList = value;
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
	 */
	private String dueDate;
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String value) {
		this.dueDate = value;
	}

	/**
	 * Terms by which the invoice payment is due.
	 *
	 * @Required
	 */
	private PaymentTermsType paymentTerms;
	public PaymentTermsType getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(PaymentTermsType value) {
		this.paymentTerms = value;
	}

	/**
	 * A discount percent applied to the invoice, if any.
	 */
	private Double discountPercent;
	public Double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Double value) {
		this.discountPercent = value;
	}

	/**
	 * A discount amount applied to the invoice, if any.  If DiscountPercent is provided, DiscountAmount is ignored.
	 */
	private Double discountAmount;
	public Double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Double value) {
		this.discountAmount = value;
	}

	/**
	 * General terms for the invoice.
	 */
	private String terms;
	public String getTerms() {
		return terms;
	}
	public void setTerms(String value) {
		this.terms = value;
	}

	/**
	 * Note to the payer company.
	 */
	private String note;
	public String getNote() {
		return note;
	}
	public void setNote(String value) {
		this.note = value;
	}

	/**
	 * Memo for book keeping that is private to the Merchant.
	 */
	private String merchantMemo;
	public String getMerchantMemo() {
		return merchantMemo;
	}
	public void setMerchantMemo(String value) {
		this.merchantMemo = value;
	}

	/**
	 * Billing information for the payer.
	 */
	private BusinessInfoType billingInfo;
	public BusinessInfoType getBillingInfo() {
		return billingInfo;
	}
	public void setBillingInfo(BusinessInfoType value) {
		this.billingInfo = value;
	}

	/**
	 * Shipping information for the payer.
	 */
	private BusinessInfoType shippingInfo;
	public BusinessInfoType getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(BusinessInfoType value) {
		this.shippingInfo = value;
	}

	/**
	 * Cost of shipping.
	 */
	private Double shippingAmount;
	public Double getShippingAmount() {
		return shippingAmount;
	}
	public void setShippingAmount(Double value) {
		this.shippingAmount = value;
	}

	/**
	 * Name of the applicable tax on shipping cost, if any.
	 */
	private String shippingTaxName;
	public String getShippingTaxName() {
		return shippingTaxName;
	}
	public void setShippingTaxName(String value) {
		this.shippingTaxName = value;
	}

	/**
	 * Rate of the applicable tax on shipping cost, if any.
	 */
	private Double shippingTaxRate;
	public Double getShippingTaxRate() {
		return shippingTaxRate;
	}
	public void setShippingTaxRate(Double value) {
		this.shippingTaxRate = value;
	}

	/**
	 * The external image URL of the invoice's logo, if any
	 */
	private String logoUrl;
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String value) {
		this.logoUrl = value;
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

	/**
	 * Label used to display custom amount value.
	 * If a value is entered for customAmountLabel, then customAmountValue cannot be empty.
	 */
	private String customAmountLabel;
	public String getCustomAmountLabel() {
		return customAmountLabel;
	}
	public void setCustomAmountLabel(String value) {
		this.customAmountLabel = value;
	}

	/**
	 * Value of custom amount.
	 * If a value is entered for customAmountValue, then customAmountLabel cannot be empty.
	 */
	private Double customAmountValue;
	public Double getCustomAmountValue() {
		return customAmountValue;
	}
	public void setCustomAmountValue(Double value) {
		this.customAmountValue = value;
	}


	public InvoiceType(String merchantEmail, String payerEmail, InvoiceItemListType itemList, String currencyCode, PaymentTermsType paymentTerms) {
		this.merchantEmail = merchantEmail;
		this.payerEmail = payerEmail;
		this.itemList = itemList;
		this.currencyCode = currencyCode;
		this.paymentTerms = paymentTerms;
	}
	public InvoiceType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( merchantEmail != null ) {
			sb.append(prefix).append("merchantEmail=").append(NVPUtil.encodeUrl(merchantEmail));
			sb.append('&');
		}
		if( payerEmail != null ) {
			sb.append(prefix).append("payerEmail=").append(NVPUtil.encodeUrl(payerEmail));
			sb.append('&');
		}
		if( number != null ) {
			sb.append(prefix).append("number=").append(NVPUtil.encodeUrl(number));
			sb.append('&');
		}
		if( merchantInfo != null ) {
			String newPrefix = prefix + "merchantInfo.";
			sb.append(merchantInfo.toNVPString(newPrefix));
		}
		if( itemList != null ) {
			String newPrefix = prefix + "itemList.";
			sb.append(itemList.toNVPString(newPrefix));
		}
		if( currencyCode != null ) {
			sb.append(prefix).append("currencyCode=").append(NVPUtil.encodeUrl(currencyCode));
			sb.append('&');
		}
		if( invoiceDate != null ) {
			sb.append(prefix).append("invoiceDate=").append(NVPUtil.encodeUrl(invoiceDate));
			sb.append('&');
		}
		if( dueDate != null ) {
			sb.append(prefix).append("dueDate=").append(NVPUtil.encodeUrl(dueDate));
			sb.append('&');
		}
		if( paymentTerms != null ) {
			sb.append(prefix).append("paymentTerms=").append(paymentTerms.getValue());
			sb.append('&');
		}
		if( discountPercent != null ) {
			sb.append(prefix).append("discountPercent=").append(discountPercent);
			sb.append('&');
		}
		if( discountAmount != null ) {
			sb.append(prefix).append("discountAmount=").append(discountAmount);
			sb.append('&');
		}
		if( terms != null ) {
			sb.append(prefix).append("terms=").append(NVPUtil.encodeUrl(terms));
			sb.append('&');
		}
		if( note != null ) {
			sb.append(prefix).append("note=").append(NVPUtil.encodeUrl(note));
			sb.append('&');
		}
		if( merchantMemo != null ) {
			sb.append(prefix).append("merchantMemo=").append(NVPUtil.encodeUrl(merchantMemo));
			sb.append('&');
		}
		if( billingInfo != null ) {
			String newPrefix = prefix + "billingInfo.";
			sb.append(billingInfo.toNVPString(newPrefix));
		}
		if( shippingInfo != null ) {
			String newPrefix = prefix + "shippingInfo.";
			sb.append(shippingInfo.toNVPString(newPrefix));
		}
		if( shippingAmount != null ) {
			sb.append(prefix).append("shippingAmount=").append(shippingAmount);
			sb.append('&');
		}
		if( shippingTaxName != null ) {
			sb.append(prefix).append("shippingTaxName=").append(NVPUtil.encodeUrl(shippingTaxName));
			sb.append('&');
		}
		if( shippingTaxRate != null ) {
			sb.append(prefix).append("shippingTaxRate=").append(shippingTaxRate);
			sb.append('&');
		}
		if( logoUrl != null ) {
			sb.append(prefix).append("logoUrl=").append(NVPUtil.encodeUrl(logoUrl));
			sb.append('&');
		}
		if( referrerCode != null ) {
			sb.append(prefix).append("referrerCode=").append(NVPUtil.encodeUrl(referrerCode));
			sb.append('&');
		}
		if( customAmountLabel != null ) {
			sb.append(prefix).append("customAmountLabel=").append(NVPUtil.encodeUrl(customAmountLabel));
			sb.append('&');
		}
		if( customAmountValue != null ) {
			sb.append(prefix).append("customAmountValue=").append(customAmountValue);
			sb.append('&');
		}
		return sb.toString();
	}

	public InvoiceType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "merchantEmail") ) {
			this.merchantEmail = map.get(prefix + "merchantEmail");
		}
		if( map.containsKey(prefix + "payerEmail") ) {
			this.payerEmail = map.get(prefix + "payerEmail");
		}
		if( map.containsKey(prefix + "number") ) {
			this.number = map.get(prefix + "number");
		}
		if( map.containsKey(prefix + "merchantInfo" + ".firstName") ) {
			String newPrefix = prefix + "merchantInfo" + '.';
			this.merchantInfo =  new BusinessInfoType(map, newPrefix);
		}
		if( map.containsKey(prefix + "itemList" + ".item(0).name") ) {
			String newPrefix = prefix + "itemList" + '.';
			this.itemList =  new InvoiceItemListType(map, newPrefix);
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
		if( map.containsKey(prefix + "paymentTerms") ) {
			this.paymentTerms = PaymentTermsType.fromValue( map.get(prefix + "paymentTerms") );
		}
		if( map.containsKey(prefix + "discountPercent") ) {
			this.discountPercent = Double.valueOf(map.get(prefix + "discountPercent"));
		}
		if( map.containsKey(prefix + "discountAmount") ) {
			this.discountAmount = Double.valueOf(map.get(prefix + "discountAmount"));
		}
		if( map.containsKey(prefix + "terms") ) {
			this.terms = map.get(prefix + "terms");
		}
		if( map.containsKey(prefix + "note") ) {
			this.note = map.get(prefix + "note");
		}
		if( map.containsKey(prefix + "merchantMemo") ) {
			this.merchantMemo = map.get(prefix + "merchantMemo");
		}
		if( map.containsKey(prefix + "billingInfo" + ".firstName") ) {
			String newPrefix = prefix + "billingInfo" + '.';
			this.billingInfo =  new BusinessInfoType(map, newPrefix);
		}
		if( map.containsKey(prefix + "shippingInfo" + ".firstName") ) {
			String newPrefix = prefix + "shippingInfo" + '.';
			this.shippingInfo =  new BusinessInfoType(map, newPrefix);
		}
		if( map.containsKey(prefix + "shippingAmount") ) {
			this.shippingAmount = Double.valueOf(map.get(prefix + "shippingAmount"));
		}
		if( map.containsKey(prefix + "shippingTaxName") ) {
			this.shippingTaxName = map.get(prefix + "shippingTaxName");
		}
		if( map.containsKey(prefix + "shippingTaxRate") ) {
			this.shippingTaxRate = Double.valueOf(map.get(prefix + "shippingTaxRate"));
		}
		if( map.containsKey(prefix + "logoUrl") ) {
			this.logoUrl = map.get(prefix + "logoUrl");
		}
		if( map.containsKey(prefix + "referrerCode") ) {
			this.referrerCode = map.get(prefix + "referrerCode");
		}
		if( map.containsKey(prefix + "customAmountLabel") ) {
			this.customAmountLabel = map.get(prefix + "customAmountLabel");
		}
		if( map.containsKey(prefix + "customAmountValue") ) {
			this.customAmountValue = Double.valueOf(map.get(prefix + "customAmountValue"));
		}
	}
}
