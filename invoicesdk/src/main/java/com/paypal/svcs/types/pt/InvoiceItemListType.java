package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.InvoiceItemType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * A list of invoice items. 
 */
public class InvoiceItemListType{

	private static final String nameSpace="com.paypal.svcs.types.pt";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<InvoiceItemType> item = new ArrayList<InvoiceItemType>();

	

	/**
	 * Constructor with arguments
	 */
	public InvoiceItemListType (List<InvoiceItemType> item){
		this.item = item;
	}	

	/**
	 * Default Constructor
	 */
	public InvoiceItemListType (){
	}	

	/**
	 * Getter for item
	 */
	 public List<InvoiceItemType> getItem() {
	 	return item;
	 }
	 
	/**
	 * Setter for item
	 */
	 public void setItem(List<InvoiceItemType> item) {
	 	this.item = item;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (item != null) {
			for(int i=0; i < item.size(); i++) {
				String newPrefix = prefix + "item" + "(" + i + ").";
				sb.append(item.get(i).toNVPString(newPrefix));
			}
		}
		return sb.toString();
	}
	
	public static InvoiceItemListType createInstance(Map<String, String> map, String prefix, int index) {
		InvoiceItemListType invoiceItemListType = null;
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
			
		i = 0;
		while(true) {
			InvoiceItemType item =  InvoiceItemType.createInstance(map, prefix + "item", i);
			if (item != null) {
				invoiceItemListType = (invoiceItemListType == null) ? new InvoiceItemListType() : invoiceItemListType;
				invoiceItemListType.getItem().add(item);
				i++;
			} else {
				break;
			}
		}
		return invoiceItemListType;
	}
 
}