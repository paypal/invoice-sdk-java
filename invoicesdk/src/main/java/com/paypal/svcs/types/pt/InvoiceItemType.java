package com.paypal.svcs.types.pt;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * Item information about a service or product listed in the
 * invoice. 
 */
public class InvoiceItemType{


	/**
	 * SKU or item name. 	  
	 *@Required	 
	 */ 
	private String name;

	/**
	 * Description of the item. 	 
	 */ 
	private String description;

	/**
	 * Date on which the product or service was provided. 	 
	 */ 
	private String date;

	/**
	 * Item count. 	  
	 *@Required	 
	 */ 
	private Double quantity;

	/**
	 * Price of the item, in the currency specified by the invoice.
	 * 	  
	 *@Required	 
	 */ 
	private Double unitPrice;

	/**
	 * A discount percent applied to the item, if any. 	 
	 */ 
	private Double discountPercent;

	/**
	 * A discount amount applied to the item, if any. If
	 * DiscountPercent is provided, DiscountAmount is ignored. 	 
	 */ 
	private Double discountAmount;

	/**
	 * Name of an applicable tax, if any. 	 
	 */ 
	private String taxName;

	/**
	 * Rate of an applicable tax, if any. 	 
	 */ 
	private Double taxRate;

	/**
	 * The tax amount on the item, either included or on top of it.
	 * 	 
	 */ 
	private Double taxAmount;

	/**
	 * Image URL of the item, if any. 	 
	 */ 
	private String imageUrl;

	

	/**
	 * Constructor with arguments
	 */
	public InvoiceItemType (String name, Double quantity, Double unitPrice){
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}	

	/**
	 * Default Constructor
	 */
	public InvoiceItemType (){
	}	

	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for description
	 */
	 public String getDescription() {
	 	return description;
	 }
	 
	/**
	 * Setter for description
	 */
	 public void setDescription(String description) {
	 	this.description = description;
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
	 
	/**
	 * Getter for quantity
	 */
	 public Double getQuantity() {
	 	return quantity;
	 }
	 
	/**
	 * Setter for quantity
	 */
	 public void setQuantity(Double quantity) {
	 	this.quantity = quantity;
	 }
	 
	/**
	 * Getter for unitPrice
	 */
	 public Double getUnitPrice() {
	 	return unitPrice;
	 }
	 
	/**
	 * Setter for unitPrice
	 */
	 public void setUnitPrice(Double unitPrice) {
	 	this.unitPrice = unitPrice;
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
	 * Getter for taxName
	 */
	 public String getTaxName() {
	 	return taxName;
	 }
	 
	/**
	 * Setter for taxName
	 */
	 public void setTaxName(String taxName) {
	 	this.taxName = taxName;
	 }
	 
	/**
	 * Getter for taxRate
	 */
	 public Double getTaxRate() {
	 	return taxRate;
	 }
	 
	/**
	 * Setter for taxRate
	 */
	 public void setTaxRate(Double taxRate) {
	 	this.taxRate = taxRate;
	 }
	 
	/**
	 * Getter for taxAmount
	 */
	 public Double getTaxAmount() {
	 	return taxAmount;
	 }
	 
	/**
	 * Setter for taxAmount
	 */
	 public void setTaxAmount(Double taxAmount) {
	 	this.taxAmount = taxAmount;
	 }
	 
	/**
	 * Getter for imageUrl
	 */
	 public String getImageUrl() {
	 	return imageUrl;
	 }
	 
	/**
	 * Setter for imageUrl
	 */
	 public void setImageUrl(String imageUrl) {
	 	this.imageUrl = imageUrl;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.name != null) {
			sb.append(prefix).append("name=").append(NVPUtil.encodeUrl(this.name));
			sb.append("&");
		}
		if (this.description != null) {
			sb.append(prefix).append("description=").append(NVPUtil.encodeUrl(this.description));
			sb.append("&");
		}
		if (this.date != null) {
			sb.append(prefix).append("date=").append(NVPUtil.encodeUrl(this.date));
			sb.append("&");
		}
		if (this.quantity != null) {
			sb.append(prefix).append("quantity=").append(this.quantity);
			sb.append("&");
		}
		if (this.unitPrice != null) {
			sb.append(prefix).append("unitPrice=").append(this.unitPrice);
			sb.append("&");
		}
		if (this.discountPercent != null) {
			sb.append(prefix).append("discountPercent=").append(this.discountPercent);
			sb.append("&");
		}
		if (this.discountAmount != null) {
			sb.append(prefix).append("discountAmount=").append(this.discountAmount);
			sb.append("&");
		}
		if (this.taxName != null) {
			sb.append(prefix).append("taxName=").append(NVPUtil.encodeUrl(this.taxName));
			sb.append("&");
		}
		if (this.taxRate != null) {
			sb.append(prefix).append("taxRate=").append(this.taxRate);
			sb.append("&");
		}
		if (this.taxAmount != null) {
			sb.append(prefix).append("taxAmount=").append(this.taxAmount);
			sb.append("&");
		}
		if (this.imageUrl != null) {
			sb.append(prefix).append("imageUrl=").append(NVPUtil.encodeUrl(this.imageUrl));
			sb.append("&");
		}
		return sb.toString();
	}
	
	public static InvoiceItemType createInstance(Map<String, String> map, String prefix, int index) {
		InvoiceItemType invoiceItemType = null;
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
			
		if (map.containsKey(prefix + "name")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setName(map.get(prefix + "name"));
		}
		if (map.containsKey(prefix + "description")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setDescription(map.get(prefix + "description"));
		}
		if (map.containsKey(prefix + "date")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setDate(map.get(prefix + "date"));
		}
		if (map.containsKey(prefix + "quantity")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setQuantity(Double.valueOf(map.get(prefix + "quantity")));
		}
		if (map.containsKey(prefix + "unitPrice")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setUnitPrice(Double.valueOf(map.get(prefix + "unitPrice")));
		}
		if (map.containsKey(prefix + "discountPercent")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setDiscountPercent(Double.valueOf(map.get(prefix + "discountPercent")));
		}
		if (map.containsKey(prefix + "discountAmount")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setDiscountAmount(Double.valueOf(map.get(prefix + "discountAmount")));
		}
		if (map.containsKey(prefix + "taxName")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setTaxName(map.get(prefix + "taxName"));
		}
		if (map.containsKey(prefix + "taxRate")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setTaxRate(Double.valueOf(map.get(prefix + "taxRate")));
		}
		if (map.containsKey(prefix + "taxAmount")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setTaxAmount(Double.valueOf(map.get(prefix + "taxAmount")));
		}
		if (map.containsKey(prefix + "imageUrl")) {
				invoiceItemType = (invoiceItemType == null) ? new InvoiceItemType() : invoiceItemType;
				invoiceItemType.setImageUrl(map.get(prefix + "imageUrl"));
		}
		return invoiceItemType;
	}
 
}