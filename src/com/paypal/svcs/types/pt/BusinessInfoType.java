
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.BaseAddress;
import java.io.UnsupportedEncodingException;
import java.util.Map;


/**
 * Contact information for a company participating in the invoicing system.
 */
public class BusinessInfoType {

	/**
	 * First name of the company contact.
	 */
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Last name of the company contact.
	 */
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Business name of the company.
	 */
	private String businessName;
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String value) {
		this.businessName = value;
	}

	/**
	 * Phone number for contacting the company.
	 */
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String value) {
		this.phone = value;
	}

	/**
	 * Fax number used by the company.
	 */
	private String fax;
	public String getFax() {
		return fax;
	}
	public void setFax(String value) {
		this.fax = value;
	}

	/**
	 * Website used by the company.
	 */
	private String website;
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String value) {
		this.website = value;
	}

	/**
	 * Custom value to be displayed in the contact information details.
	 */
	private String customValue;
	public String getCustomValue() {
		return customValue;
	}
	public void setCustomValue(String value) {
		this.customValue = value;
	}

	/**
	 * Street address of the company.
	 */
	private BaseAddress address;
	public BaseAddress getAddress() {
		return address;
	}
	public void setAddress(BaseAddress value) {
		this.address = value;
	}


	public BusinessInfoType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( firstName != null ) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(firstName));
			sb.append('&');
		}
		if( lastName != null ) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(lastName));
			sb.append('&');
		}
		if( businessName != null ) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(businessName));
			sb.append('&');
		}
		if( phone != null ) {
			sb.append(prefix).append("phone=").append(NVPUtil.encodeUrl(phone));
			sb.append('&');
		}
		if( fax != null ) {
			sb.append(prefix).append("fax=").append(NVPUtil.encodeUrl(fax));
			sb.append('&');
		}
		if( website != null ) {
			sb.append(prefix).append("website=").append(NVPUtil.encodeUrl(website));
			sb.append('&');
		}
		if( customValue != null ) {
			sb.append(prefix).append("customValue=").append(NVPUtil.encodeUrl(customValue));
			sb.append('&');
		}
		if( address != null ) {
			String newPrefix = prefix + "address.";
			sb.append(address.toNVPString(newPrefix));
		}
		return sb.toString();
	}

	public BusinessInfoType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "firstName") ) {
			this.firstName = map.get(prefix + "firstName");
		}
		if( map.containsKey(prefix + "lastName") ) {
			this.lastName = map.get(prefix + "lastName");
		}
		if( map.containsKey(prefix + "businessName") ) {
			this.businessName = map.get(prefix + "businessName");
		}
		if( map.containsKey(prefix + "phone") ) {
			this.phone = map.get(prefix + "phone");
		}
		if( map.containsKey(prefix + "fax") ) {
			this.fax = map.get(prefix + "fax");
		}
		if( map.containsKey(prefix + "website") ) {
			this.website = map.get(prefix + "website");
		}
		if( map.containsKey(prefix + "customValue") ) {
			this.customValue = map.get(prefix + "customValue");
		}
		if( map.containsKey(prefix + "address" + ".line1") ) {
			String newPrefix = prefix + "address" + '.';
			this.address =  new BaseAddress(map, newPrefix);
		}
	}
}
