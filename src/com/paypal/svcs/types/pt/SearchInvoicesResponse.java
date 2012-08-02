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
	 


	
	public static SearchInvoicesResponse createInstance(Map<String, String> map, String prefix, int index) {
		SearchInvoicesResponse searchInvoicesResponse = null;
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
			
		ResponseEnvelope responseEnvelope =  ResponseEnvelope.createInstance(map, prefix + "responseEnvelope", -1);
		if (responseEnvelope != null) {
			searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
			searchInvoicesResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "count")) {
				searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
				searchInvoicesResponse.setCount(Integer.valueOf(map.get(prefix + "count")));
		}
		InvoiceSummaryListType invoiceList =  InvoiceSummaryListType.createInstance(map, prefix + "invoiceList", -1);
		if (invoiceList != null) {
			searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
			searchInvoicesResponse.setInvoiceList(invoiceList);
		}
		if (map.containsKey(prefix + "page")) {
				searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
				searchInvoicesResponse.setPage(Integer.valueOf(map.get(prefix + "page")));
		}
		if (map.containsKey(prefix + "hasNextPage")) {
				searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
				searchInvoicesResponse.setHasNextPage(Boolean.valueOf(map.get(prefix + "hasNextPage")));
		}
		if (map.containsKey(prefix + "hasPreviousPage")) {
				searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
				searchInvoicesResponse.setHasPreviousPage(Boolean.valueOf(map.get(prefix + "hasPreviousPage")));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				searchInvoicesResponse = (searchInvoicesResponse == null) ? new SearchInvoicesResponse() : searchInvoicesResponse;
				searchInvoicesResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return searchInvoicesResponse;
	}
 
}