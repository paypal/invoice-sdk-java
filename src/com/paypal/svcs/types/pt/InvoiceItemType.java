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
	 * Name of an applicable tax, if any. 	 
	 */ 
	private String taxName;

	/**
	 * Rate of an applicable tax, if any. 	 
	 */ 
	private Double taxRate;

	

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
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (name != null) {
			sb.append(prefix).append("name=").append(NVPUtil.encodeUrl(name));
			sb.append("&");
		}
		if (description != null) {
			sb.append(prefix).append("description=").append(NVPUtil.encodeUrl(description));
			sb.append("&");
		}
		if (date != null) {
			sb.append(prefix).append("date=").append(NVPUtil.encodeUrl(date));
			sb.append("&");
		}
		if (quantity != null) {
			sb.append(prefix).append("quantity=").append(quantity);
			sb.append("&");
		}
		if (unitPrice != null) {
			sb.append(prefix).append("unitPrice=").append(unitPrice);
			sb.append("&");
		}
		if (taxName != null) {
			sb.append(prefix).append("taxName=").append(NVPUtil.encodeUrl(taxName));
			sb.append("&");
		}
		if (taxRate != null) {
			sb.append(prefix).append("taxRate=").append(taxRate);
			sb.append("&");
		}
		return sb.toString();
	}
	public InvoiceItemType(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "name")){
			this.name = map.get(prefix + "name");
		}
		if(map.containsKey(prefix + "description")){
			this.description = map.get(prefix + "description");
		}
		if(map.containsKey(prefix + "date")){
			this.date = map.get(prefix + "date");
		}
		if(map.containsKey(prefix + "quantity")){
			this.quantity = Double.valueOf(map.get(prefix + "quantity"));
		}
		if(map.containsKey(prefix + "unitPrice")){
			this.unitPrice = Double.valueOf(map.get(prefix + "unitPrice"));
		}
		if(map.containsKey(prefix + "taxName")){
			this.taxName = map.get(prefix + "taxName");
		}
		if(map.containsKey(prefix + "taxRate")){
			this.taxRate = Double.valueOf(map.get(prefix + "taxRate"));
		}
	}

}