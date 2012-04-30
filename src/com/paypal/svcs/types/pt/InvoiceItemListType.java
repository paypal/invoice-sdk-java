
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.pt.InvoiceItemType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * A list of invoice items.
 */
public class InvoiceItemListType {

	/**
	 *
	 * @Required
	 */
	private List<InvoiceItemType> item = new ArrayList<InvoiceItemType>();
	public List<InvoiceItemType> getItem() {
		return item;
	}
	public void setItem(List<InvoiceItemType> value) {
		this.item = value;
	}


	public InvoiceItemListType(List<InvoiceItemType> item) {
		this.item = item;
	}
	public InvoiceItemListType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( item != null ) {
			for(int i=0; i<item.size(); i++) {
				String newPrefix = prefix + "item" + '(' + i + ").";
				sb.append(item.get(i).toNVPString(newPrefix));
			}
		}
		return sb.toString();
	}

	public InvoiceItemListType(Map<String, String> map, String prefix) {
		int i=0; 
		 i=0; 
		 while(true) {
			if( map.containsKey(prefix + "item" + '(' + i + ')'+ ".name") ) {
				String newPrefix = prefix + "item" + '(' + i + ')' + '.';
				this.item.add(new InvoiceItemType(map, newPrefix));
			}
			else break;
			i++;
		}
	}
}
