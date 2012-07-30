package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import com.paypal.svcs.types.pt.InvoiceSummaryListType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for SearchInvoices. 
 */
public class SearchInvoicesResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * Number of invoices that matched the search. 	  
	 *@Required	 
	 */ 
	private Integer count;

	/**
	 * Page of invoice summaries that matched the search. 	 
	 */ 
	private InvoiceSummaryListType invoiceList;

	/**
	 * Page number of result set. 	  
	 *@Required	 
	 */ 
	private Integer page;

	/**
	 * True if another page of invoice summary results exists. 	  
	 *@Required	 
	 */ 
	private Boolean hasNextPage;

	/**
	 * True if a previous page of invoice summary results exists. 	  
	 *@Required	 
	 */ 
	private Boolean hasPreviousPage;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public SearchInvoicesResponse (){
	}	

	/**
	 * Getter for responseEnvelope
	 */
	 public ResponseEnvelope getResponseEnvelope() {
	 	return responseEnvelope;
	 }
	 
	/**
	 * Setter for responseEnvelope
	 */
	 public void setResponseEnvelope(ResponseEnvelope responseEnvelope) {
	 	this.responseEnvelope = responseEnvelope;
	 }
	 
	/**
	 * Getter for count
	 */
	 public Integer getCount() {
	 	return count;
	 }
	 
	/**
	 * Setter for count
	 */
	 public void setCount(Integer count) {
	 	this.count = count;
	 }
	 
	/**
	 * Getter for invoiceList
	 */
	 public InvoiceSummaryListType getInvoiceList() {
	 	return invoiceList;
	 }
	 
	/**
	 * Setter for invoiceList
	 */
	 public void setInvoiceList(InvoiceSummaryListType invoiceList) {
	 	this.invoiceList = invoiceList;
	 }
	 
	/**
	 * Getter for page
	 */
	 public Integer getPage() {
	 	return page;
	 }
	 
	/**
	 * Setter for page
	 */
	 public void setPage(Integer page) {
	 	this.page = page;
	 }
	 
	/**
	 * Getter for hasNextPage
	 */
	 public Boolean getHasNextPage() {
	 	return hasNextPage;
	 }
	 
	/**
	 * Setter for hasNextPage
	 */
	 public void setHasNextPage(Boolean hasNextPage) {
	 	this.hasNextPage = hasNextPage;
	 }
	 
	/**
	 * Getter for hasPreviousPage
	 */
	 public Boolean getHasPreviousPage() {
	 	return hasPreviousPage;
	 }
	 
	/**
	 * Setter for hasPreviousPage
	 */
	 public void setHasPreviousPage(Boolean hasPreviousPage) {
	 	this.hasPreviousPage = hasPreviousPage;
	 }
	 
	/**
	 * Getter for error
	 */
	 public List<ErrorData> getError() {
	 	return error;
	 }
	 
	/**
	 * Setter for error
	 */
	 public void setError(List<ErrorData> error) {
	 	this.error = error;
	 }
	 


	public SearchInvoicesResponse(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "responseEnvelope" + ".timestamp")){
			String newPrefix = prefix + "responseEnvelope" + ".";
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if(map.containsKey(prefix + "count")){
			this.count = Integer.valueOf(map.get(prefix + "count"));
		}
		if(map.containsKey(prefix + "invoiceList" + ".invoice(0).invoiceID")){
			String newPrefix = prefix + "invoiceList" + ".";
			this.invoiceList =  new InvoiceSummaryListType(map, newPrefix);
		}
		if(map.containsKey(prefix + "page")){
			this.page = Integer.valueOf(map.get(prefix + "page"));
		}
		if(map.containsKey(prefix + "hasNextPage")){
			this.hasNextPage = Boolean.valueOf(map.get(prefix + "hasNextPage"));
		}
		if(map.containsKey(prefix + "hasPreviousPage")){
			this.hasPreviousPage = Boolean.valueOf(map.get(prefix + "hasPreviousPage"));
		}
		i = 0;
		while(true) {
			if(map.containsKey(prefix + "error" + "(" + i + ")" + ".errorId")){
				String newPrefix = prefix + "error" + "(" + i + ")" + ".";
				this.error.add(new ErrorData(map, newPrefix));
			} else {
				break;
			}
			i++;
		}
	}

}