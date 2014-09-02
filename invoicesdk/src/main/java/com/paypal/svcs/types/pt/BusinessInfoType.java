package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.BaseAddress;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * Contact information for a company participating in the
 * invoicing system. 
 */
public class BusinessInfoType{


	/**
	 * First name of the company contact. 	 
	 */ 
	private String firstName;

	/**
	 * Last name of the company contact. 	 
	 */ 
	private String lastName;

	/**
	 * Business name of the company. 	 
	 */ 
	private String businessName;

	/**
	 * Phone number for contacting the company. 	 
	 */ 
	private String phone;

	/**
	 * Fax number used by the company. 	 
	 */ 
	private String fax;

	/**
	 * Website used by the company. 	 
	 */ 
	private String website;

	/**
	 * Language of the participant. 	 
	 */ 
	private String language;

	/**
	 * Tax ID of the merchant. 	 
	 */ 
	private String taxId;

	/**
	 * Custom value to be displayed in the contact information
	 * details. 	 
	 */ 
	private String customValue;

	/**
	 * Street address of the company. 	 
	 */ 
	private BaseAddress address;

	

	/**
	 * Default Constructor
	 */
	public BusinessInfoType (){
	}	

	/**
	 * Getter for firstName
	 */
	 public String getFirstName() {
	 	return firstName;
	 }
	 
	/**
	 * Setter for firstName
	 */
	 public void setFirstName(String firstName) {
	 	this.firstName = firstName;
	 }
	 
	/**
	 * Getter for lastName
	 */
	 public String getLastName() {
	 	return lastName;
	 }
	 
	/**
	 * Setter for lastName
	 */
	 public void setLastName(String lastName) {
	 	this.lastName = lastName;
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
	 * Getter for phone
	 */
	 public String getPhone() {
	 	return phone;
	 }
	 
	/**
	 * Setter for phone
	 */
	 public void setPhone(String phone) {
	 	this.phone = phone;
	 }
	 
	/**
	 * Getter for fax
	 */
	 public String getFax() {
	 	return fax;
	 }
	 
	/**
	 * Setter for fax
	 */
	 public void setFax(String fax) {
	 	this.fax = fax;
	 }
	 
	/**
	 * Getter for website
	 */
	 public String getWebsite() {
	 	return website;
	 }
	 
	/**
	 * Setter for website
	 */
	 public void setWebsite(String website) {
	 	this.website = website;
	 }
	 
	/**
	 * Getter for language
	 */
	 public String getLanguage() {
	 	return language;
	 }
	 
	/**
	 * Setter for language
	 */
	 public void setLanguage(String language) {
	 	this.language = language;
	 }
	 
	/**
	 * Getter for taxId
	 */
	 public String getTaxId() {
	 	return taxId;
	 }
	 
	/**
	 * Setter for taxId
	 */
	 public void setTaxId(String taxId) {
	 	this.taxId = taxId;
	 }
	 
	/**
	 * Getter for customValue
	 */
	 public String getCustomValue() {
	 	return customValue;
	 }
	 
	/**
	 * Setter for customValue
	 */
	 public void setCustomValue(String customValue) {
	 	this.customValue = customValue;
	 }
	 
	/**
	 * Getter for address
	 */
	 public BaseAddress getAddress() {
	 	return address;
	 }
	 
	/**
	 * Setter for address
	 */
	 public void setAddress(BaseAddress address) {
	 	this.address = address;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.firstName != null) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(this.firstName));
			sb.append("&");
		}
		if (this.lastName != null) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(this.lastName));
			sb.append("&");
		}
		if (this.businessName != null) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(this.businessName));
			sb.append("&");
		}
		if (this.phone != null) {
			sb.append(prefix).append("phone=").append(NVPUtil.encodeUrl(this.phone));
			sb.append("&");
		}
		if (this.fax != null) {
			sb.append(prefix).append("fax=").append(NVPUtil.encodeUrl(this.fax));
			sb.append("&");
		}
		if (this.website != null) {
			sb.append(prefix).append("website=").append(NVPUtil.encodeUrl(this.website));
			sb.append("&");
		}
		if (this.language != null) {
			sb.append(prefix).append("language=").append(NVPUtil.encodeUrl(this.language));
			sb.append("&");
		}
		if (this.taxId != null) {
			sb.append(prefix).append("taxId=").append(NVPUtil.encodeUrl(this.taxId));
			sb.append("&");
		}
		if (this.customValue != null) {
			sb.append(prefix).append("customValue=").append(NVPUtil.encodeUrl(this.customValue));
			sb.append("&");
		}
		if (this.address != null) {
			String newPrefix = prefix + "address.";
			sb.append(this.address.toNVPString(newPrefix));
		}
		return sb.toString();
	}
	
	public static BusinessInfoType createInstance(Map<String, String> map, String prefix, int index) {
		BusinessInfoType businessInfoType = null;
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
			
		if (map.containsKey(prefix + "firstName")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setFirstName(map.get(prefix + "firstName"));
		}
		if (map.containsKey(prefix + "lastName")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setLastName(map.get(prefix + "lastName"));
		}
		if (map.containsKey(prefix + "businessName")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setBusinessName(map.get(prefix + "businessName"));
		}
		if (map.containsKey(prefix + "phone")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setPhone(map.get(prefix + "phone"));
		}
		if (map.containsKey(prefix + "fax")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setFax(map.get(prefix + "fax"));
		}
		if (map.containsKey(prefix + "website")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setWebsite(map.get(prefix + "website"));
		}
		if (map.containsKey(prefix + "language")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setLanguage(map.get(prefix + "language"));
		}
		if (map.containsKey(prefix + "taxId")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setTaxId(map.get(prefix + "taxId"));
		}
		if (map.containsKey(prefix + "customValue")) {
				businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
				businessInfoType.setCustomValue(map.get(prefix + "customValue"));
		}
		BaseAddress address =  BaseAddress.createInstance(map, prefix + "address", -1);
		if (address != null) {
			businessInfoType = (businessInfoType == null) ? new BusinessInfoType() : businessInfoType;
			businessInfoType.setAddress(address);
		}
		return businessInfoType;
	}
 
}