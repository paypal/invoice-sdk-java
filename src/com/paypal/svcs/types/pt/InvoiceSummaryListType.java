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
	 * 	 
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
	 


	
	public static InvoiceSummaryListType createInstance(Map<String, String> map, String prefix, int index) {
		InvoiceSummaryListType invoiceSummaryListType = null;
		int i = 0;
		if (index != -1) {
				if (!prefix.isEmpty() && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (!prefix.isEmpty() && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		i = 0;
		while(true) {
			InvoiceSummaryType invoice =  InvoiceSummaryType.createInstance(map, prefix + "invoice", i);
			if (invoice != null) {
				invoiceSummaryListType = (invoiceSummaryListType == null) ? new InvoiceSummaryListType() : invoiceSummaryListType;
				invoiceSummaryListType.getInvoice().add(invoice);
				i++;
			} else {
				break;
			}
		}
		return invoiceSummaryListType;
	}
 
}