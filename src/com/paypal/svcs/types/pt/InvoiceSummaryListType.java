
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.pt.InvoiceSummaryType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * A list of invoice summaries.
 */
public class InvoiceSummaryListType {

	/**
	 */
	private List<InvoiceSummaryType> invoice = new ArrayList<InvoiceSummaryType>();
	public List<InvoiceSummaryType> getInvoice() {
		return invoice;
	}
	public void setInvoice(List<InvoiceSummaryType> value) {
		this.invoice = value;
	}


	public InvoiceSummaryListType() {
	}
	public InvoiceSummaryListType(Map<String, String> map, String prefix) {
		int i=0; 
		 i=0; 
		 while(true) {
			if( map.containsKey(prefix + "invoice" + '(' + i + ')'+ ".invoiceID") ) {
				String newPrefix = prefix + "invoice" + '(' + i + ')' + '.';
				this.invoice.add(new InvoiceSummaryType(map, newPrefix));
			}
			else break;
			i++;
		}
	}
}
