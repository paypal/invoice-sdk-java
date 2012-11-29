package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.pt.BusinessInfoType;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.PaymentTermsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * Invoice details about the merchant, payer, totals and terms.
 * 
 */
public class InvoiceType{


	/**
	 * Merchant's email. 	  
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
	 */ 
	private String number;

	/**
	 * Company contact information of the merchant company sending
	 * the invoice. 	 
	 */ 
	private BusinessInfoType merchantInfo;

	/**
	 * List of items included in this invoice. 	  
	 *@Required	 
	 */ 
	private InvoiceItemListType itemList;

	/**
	 * Currency used for all invoice item amounts and totals. 	  
	 *@Required	 
	 */ 
	private String currencyCode;

	/**
	 * Date on which the invoice will be enabled. 	 
	 */ 
	private String invoiceDate;

	/**
	 * Date on which the invoice payment is due. 	 
	 */ 
	private String dueDate;

	/**
	 * Terms by which the invoice payment is due. 	  
	 *@Required	 
	 */ 
	private PaymentTermsType paymentTerms;

	/**
	 * A discount percent applied to the invoice, if any. 	 
	 */ 
	private Double discountPercent;

	/**
	 * A discount amount applied to the invoice, if any. If
	 * DiscountPercent is provided, DiscountAmount is ignored. 	 
	 */ 
	private Double discountAmount;

	/**
	 * General terms for the invoice. 	 
	 */ 
	private String terms;

	/**
	 * Note to the payer company. 	 
	 */ 
	private String note;

	/**
	 * Memo for book keeping that is private to the Merchant. 	 
	 */ 
	private String merchantMemo;

	/**
	 * Billing information for the payer. 	 
	 */ 
	private BusinessInfoType billingInfo;

	/**
	 * Shipping information for the payer. 	 
	 */ 
	private BusinessInfoType shippingInfo;

	/**
	 * Cost of shipping. 	 
	 */ 
	private Double shippingAmount;

	/**
	 * Name of the applicable tax on shipping cost, if any. 	 
	 */ 
	private String shippingTaxName;

	/**
	 * Rate of the applicable tax on shipping cost, if any. 	 
	 */ 
	private Double shippingTaxRate;

	/**
	 * The external image URL of the invoice's logo, if any 	 
	 */ 
	private String logoUrl;

	/**
	 * BN code for tracking transactions with a particular partner.
	 * 	 
	 */ 
	private String referrerCode;

	/**
	 * Label used to display custom amount value. If a value is
	 * entered for customAmountLabel, then customAmountValue cannot
	 * be empty. 	 
	 */ 
	private String customAmountLabel;

	/**
	 * Value of custom amount. If a value is entered for
	 * customAmountValue, then customAmountLabel cannot be empty. 	 
	 */ 
	private Double customAmountValue;

	

	/**
	 * Constructor with arguments
	 */
	public InvoiceType (String merchantEmail, String payerEmail, InvoiceItemListType itemList, String currencyCode, PaymentTermsType paymentTerms){
		this.merchantEmail = merchantEmail;
		this.payerEmail = payerEmail;
		this.itemList = itemList;
		this.currencyCode = currencyCode;
		this.paymentTerms = paymentTerms;
	}	

	/**
	 * Default Constructor
	 */
	public InvoiceType (){
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
	 * Getter for merchantInfo
	 */
	 public BusinessInfoType getMerchantInfo() {
	 	return merchantInfo;
	 }
	 
	/**
	 * Setter for merchantInfo
	 */
	 public void setMerchantInfo(BusinessInfoType merchantInfo) {
	 	this.merchantInfo = merchantInfo;
	 }
	 
	/**
	 * Getter for itemList
	 */
	 public InvoiceItemListType getItemList() {
	 	return itemList;
	 }
	 
	/**
	 * Setter for itemList
	 */
	 public void setItemList(InvoiceItemListType itemList) {
	 	this.itemList = itemList;
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
	 * Getter for paymentTerms
	 */
	 public PaymentTermsType getPaymentTerms() {
	 	return paymentTerms;
	 }
	 
	/**
	 * Setter for paymentTerms
	 */
	 public void setPaymentTerms(PaymentTermsType paymentTerms) {
	 	this.paymentTerms = paymentTerms;
	 }
	 
	/**
	 * Getter for discountPercent
	 */
	 public Double getDiscountPercent() {
	 	return discountPercent;
	 }
	 
	/**
	 * Setter for discountPercent
	 */
	 public void setDiscountPercent(Double discountPercent) {
	 	this.discountPercent = discountPercent;
	 }
	 
	/**
	 * Getter for discountAmount
	 */
	 public Double getDiscountAmount() {
	 	return discountAmount;
	 }
	 
	/**
	 * Setter for discountAmount
	 */
	 public void setDiscountAmount(Double discountAmount) {
	 	this.discountAmount = discountAmount;
	 }
	 
	/**
	 * Getter for terms
	 */
	 public String getTerms() {
	 	return terms;
	 }
	 
	/**
	 * Setter for terms
	 */
	 public void setTerms(String terms) {
	 	this.terms = terms;
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
	 * Getter for merchantMemo
	 */
	 public String getMerchantMemo() {
	 	return merchantMemo;
	 }
	 
	/**
	 * Setter for merchantMemo
	 */
	 public void setMerchantMemo(String merchantMemo) {
	 	this.merchantMemo = merchantMemo;
	 }
	 
	/**
	 * Getter for billingInfo
	 */
	 public BusinessInfoType getBillingInfo() {
	 	return billingInfo;
	 }
	 
	/**
	 * Setter for billingInfo
	 */
	 public void setBillingInfo(BusinessInfoType billingInfo) {
	 	this.billingInfo = billingInfo;
	 }
	 
	/**
	 * Getter for shippingInfo
	 */
	 public BusinessInfoType getShippingInfo() {
	 	return shippingInfo;
	 }
	 
	/**
	 * Setter for shippingInfo
	 */
	 public void setShippingInfo(BusinessInfoType shippingInfo) {
	 	this.shippingInfo = shippingInfo;
	 }
	 
	/**
	 * Getter for shippingAmount
	 */
	 public Double getShippingAmount() {
	 	return shippingAmount;
	 }
	 
	/**
	 * Setter for shippingAmount
	 */
	 public void setShippingAmount(Double shippingAmount) {
	 	this.shippingAmount = shippingAmount;
	 }
	 
	/**
	 * Getter for shippingTaxName
	 */
	 public String getShippingTaxName() {
	 	return shippingTaxName;
	 }
	 
	/**
	 * Setter for shippingTaxName
	 */
	 public void setShippingTaxName(String shippingTaxName) {
	 	this.shippingTaxName = shippingTaxName;
	 }
	 
	/**
	 * Getter for shippingTaxRate
	 */
	 public Double getShippingTaxRate() {
	 	return shippingTaxRate;
	 }
	 
	/**
	 * Setter for shippingTaxRate
	 */
	 public void setShippingTaxRate(Double shippingTaxRate) {
	 	this.shippingTaxRate = shippingTaxRate;
	 }
	 
	/**
	 * Getter for logoUrl
	 */
	 public String getLogoUrl() {
	 	return logoUrl;
	 }
	 
	/**
	 * Setter for logoUrl
	 */
	 public void setLogoUrl(String logoUrl) {
	 	this.logoUrl = logoUrl;
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
	 
	/**
	 * Getter for customAmountLabel
	 */
	 public String getCustomAmountLabel() {
	 	return customAmountLabel;
	 }
	 
	/**
	 * Setter for customAmountLabel
	 */
	 public void setCustomAmountLabel(String customAmountLabel) {
	 	this.customAmountLabel = customAmountLabel;
	 }
	 
	/**
	 * Getter for customAmountValue
	 */
	 public Double getCustomAmountValue() {
	 	return customAmountValue;
	 }
	 
	/**
	 * Setter for customAmountValue
	 */
	 public void setCustomAmountValue(Double customAmountValue) {
	 	this.customAmountValue = customAmountValue;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (merchantEmail != null) {
			sb.append(prefix).append("merchantEmail=").append(NVPUtil.encodeUrl(merchantEmail));
			sb.append("&");
		}
		if (payerEmail != null) {
			sb.append(prefix).append("payerEmail=").append(NVPUtil.encodeUrl(payerEmail));
			sb.append("&");
		}
		if (number != null) {
			sb.append(prefix).append("number=").append(NVPUtil.encodeUrl(number));
			sb.append("&");
		}
		if (merchantInfo != null) {
			String newPrefix = prefix + "merchantInfo.";
			sb.append(merchantInfo.toNVPString(newPrefix));
		}
		if (itemList != null) {
			String newPrefix = prefix + "itemList.";
			sb.append(itemList.toNVPString(newPrefix));
		}
		if (currencyCode != null) {
			sb.append(prefix).append("currencyCode=").append(NVPUtil.encodeUrl(currencyCode));
			sb.append("&");
		}
		if (invoiceDate != null) {
			sb.append(prefix).append("invoiceDate=").append(NVPUtil.encodeUrl(invoiceDate));
			sb.append("&");
		}
		if (dueDate != null) {
			sb.append(prefix).append("dueDate=").append(NVPUtil.encodeUrl(dueDate));
			sb.append("&");
		}
		if (paymentTerms != null) {
			sb.append(prefix).append("paymentTerms=").append(paymentTerms.getValue());
			sb.append("&");
		}
		if (discountPercent != null) {
			sb.append(prefix).append("discountPercent=").append(discountPercent);
			sb.append("&");
		}
		if (discountAmount != null) {
			sb.append(prefix).append("discountAmount=").append(discountAmount);
			sb.append("&");
		}
		if (terms != null) {
			sb.append(prefix).append("terms=").append(NVPUtil.encodeUrl(terms));
			sb.append("&");
		}
		if (note != null) {
			sb.append(prefix).append("note=").append(NVPUtil.encodeUrl(note));
			sb.append("&");
		}
		if (merchantMemo != null) {
			sb.append(prefix).append("merchantMemo=").append(NVPUtil.encodeUrl(merchantMemo));
			sb.append("&");
		}
		if (billingInfo != null) {
			String newPrefix = prefix + "billingInfo.";
			sb.append(billingInfo.toNVPString(newPrefix));
		}
		if (shippingInfo != null) {
			String newPrefix = prefix + "shippingInfo.";
			sb.append(shippingInfo.toNVPString(newPrefix));
		}
		if (shippingAmount != null) {
			sb.append(prefix).append("shippingAmount=").append(shippingAmount);
			sb.append("&");
		}
		if (shippingTaxName != null) {
			sb.append(prefix).append("shippingTaxName=").append(NVPUtil.encodeUrl(shippingTaxName));
			sb.append("&");
		}
		if (shippingTaxRate != null) {
			sb.append(prefix).append("shippingTaxRate=").append(shippingTaxRate);
			sb.append("&");
		}
		if (logoUrl != null) {
			sb.append(prefix).append("logoUrl=").append(NVPUtil.encodeUrl(logoUrl));
			sb.append("&");
		}
		if (referrerCode != null) {
			sb.append(prefix).append("referrerCode=").append(NVPUtil.encodeUrl(referrerCode));
			sb.append("&");
		}
		if (customAmountLabel != null) {
			sb.append(prefix).append("customAmountLabel=").append(NVPUtil.encodeUrl(customAmountLabel));
			sb.append("&");
		}
		if (customAmountValue != null) {
			sb.append(prefix).append("customAmountValue=").append(customAmountValue);
			sb.append("&");
		}
		return sb.toString();
	}
	
	public static InvoiceType createInstance(Map<String, String> map, String prefix, int index) {
		InvoiceType invoiceType = null;
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
			
		if (map.containsKey(prefix + "merchantEmail")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setMerchantEmail(map.get(prefix + "merchantEmail"));
		}
		if (map.containsKey(prefix + "payerEmail")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setPayerEmail(map.get(prefix + "payerEmail"));
		}
		if (map.containsKey(prefix + "number")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setNumber(map.get(prefix + "number"));
		}
		BusinessInfoType merchantInfo =  BusinessInfoType.createInstance(map, prefix + "merchantInfo", -1);
		if (merchantInfo != null) {
			invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
			invoiceType.setMerchantInfo(merchantInfo);
		}
		InvoiceItemListType itemList =  InvoiceItemListType.createInstance(map, prefix + "itemList", -1);
		if (itemList != null) {
			invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
			invoiceType.setItemList(itemList);
		}
		if (map.containsKey(prefix + "currencyCode")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setCurrencyCode(map.get(prefix + "currencyCode"));
		}
		if (map.containsKey(prefix + "invoiceDate")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setInvoiceDate(map.get(prefix + "invoiceDate"));
		}
		if (map.containsKey(prefix + "dueDate")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setDueDate(map.get(prefix + "dueDate"));
		}
		if (map.containsKey(prefix + "paymentTerms")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setPaymentTerms(PaymentTermsType.fromValue(map.get(prefix + "paymentTerms")));
		}
		if (map.containsKey(prefix + "discountPercent")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setDiscountPercent(Double.valueOf(map.get(prefix + "discountPercent")));
		}
		if (map.containsKey(prefix + "discountAmount")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setDiscountAmount(Double.valueOf(map.get(prefix + "discountAmount")));
		}
		if (map.containsKey(prefix + "terms")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setTerms(map.get(prefix + "terms"));
		}
		if (map.containsKey(prefix + "note")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setNote(map.get(prefix + "note"));
		}
		if (map.containsKey(prefix + "merchantMemo")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setMerchantMemo(map.get(prefix + "merchantMemo"));
		}
		BusinessInfoType billingInfo =  BusinessInfoType.createInstance(map, prefix + "billingInfo", -1);
		if (billingInfo != null) {
			invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
			invoiceType.setBillingInfo(billingInfo);
		}
		BusinessInfoType shippingInfo =  BusinessInfoType.createInstance(map, prefix + "shippingInfo", -1);
		if (shippingInfo != null) {
			invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
			invoiceType.setShippingInfo(shippingInfo);
		}
		if (map.containsKey(prefix + "shippingAmount")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setShippingAmount(Double.valueOf(map.get(prefix + "shippingAmount")));
		}
		if (map.containsKey(prefix + "shippingTaxName")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setShippingTaxName(map.get(prefix + "shippingTaxName"));
		}
		if (map.containsKey(prefix + "shippingTaxRate")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setShippingTaxRate(Double.valueOf(map.get(prefix + "shippingTaxRate")));
		}
		if (map.containsKey(prefix + "logoUrl")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setLogoUrl(map.get(prefix + "logoUrl"));
		}
		if (map.containsKey(prefix + "referrerCode")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setReferrerCode(map.get(prefix + "referrerCode"));
		}
		if (map.containsKey(prefix + "customAmountLabel")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setCustomAmountLabel(map.get(prefix + "customAmountLabel"));
		}
		if (map.containsKey(prefix + "customAmountValue")) {
				invoiceType = (invoiceType == null) ? new InvoiceType() : invoiceType;
				invoiceType.setCustomAmountValue(Double.valueOf(map.get(prefix + "customAmountValue")));
		}
		return invoiceType;
	}
 
}