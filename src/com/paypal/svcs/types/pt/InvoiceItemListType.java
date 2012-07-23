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


	/**
	 * No Document Comments	  
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
	public InvoiceItemListType(Map<String, String> map, String prefix) {
		int i = 0;
		i = 0;
		while(true) {
			if(map.containsKey(prefix + "item" + "(" + i + ")" + ".name")){
				String newPrefix = prefix + "item" + "(" + i + ")" + ".";
				this.item.add(new InvoiceItemType(map, newPrefix));
			} else {
				break;
			}
			i++;
		}
	}

}