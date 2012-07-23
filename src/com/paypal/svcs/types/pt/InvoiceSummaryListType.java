package com.paypal.svcs.types.pt;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.pt.InvoiceSummaryType;
import java.util.Map;

/**
 * A list of invoice summaries. 
 */
public class InvoiceSummaryListType{


	/**
	 * No Document Comments	 
	 */ 
	private List<InvoiceSummaryType> invoice = new ArrayList<InvoiceSummaryType>();

	

	/**
	 * Default Constructor
	 */
	public InvoiceSummaryListType (){
	}	

	/**
	 * Getter for invoice
	 */
	 public List<InvoiceSummaryType> getInvoice() {
	 	return invoice;
	 }
	 
	/**
	 * Setter for invoice
	 */
	 public void setInvoice(List<InvoiceSummaryType> invoice) {
	 	this.invoice = invoice;
	 }
	 


	public InvoiceSummaryListType(Map<String, String> map, String prefix) {
		int i = 0;
		i = 0;
		while(true) {
			if(map.containsKey(prefix + "invoice" + "(" + i + ")" + ".invoiceID")){
				String newPrefix = prefix + "invoice" + "(" + i + ")" + ".";
				this.invoice.add(new InvoiceSummaryType(map, newPrefix));
			} else {
				break;
			}
			i++;
		}
	}

}