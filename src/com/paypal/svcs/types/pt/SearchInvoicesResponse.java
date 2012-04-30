
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.ResponseEnvelope;
import com.paypal.svcs.types.pt.InvoiceSummaryListType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * The response object for SearchInvoices.
 */
public class SearchInvoicesResponse {

	/**
	 *
	 * @Required
	 */
	private ResponseEnvelope responseEnvelope;
	public ResponseEnvelope getResponseEnvelope() {
		return responseEnvelope;
	}
	public void setResponseEnvelope(ResponseEnvelope value) {
		this.responseEnvelope = value;
	}

	/**
	 * Number of invoices that matched the search.
	 *
	 * @Required
	 */
	private Integer count;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer value) {
		this.count = value;
	}

	/**
	 * Page of invoice summaries that matched the search.
	 */
	private InvoiceSummaryListType invoiceList;
	public InvoiceSummaryListType getInvoiceList() {
		return invoiceList;
	}
	public void setInvoiceList(InvoiceSummaryListType value) {
		this.invoiceList = value;
	}

	/**
	 * Page number of result set.
	 *
	 * @Required
	 */
	private Integer page;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer value) {
		this.page = value;
	}

	/**
	 * True if another page of invoice summary results exists.
	 *
	 * @Required
	 */
	private Boolean hasNextPage;
	public Boolean getHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(Boolean value) {
		this.hasNextPage = value;
	}

	/**
	 * True if a previous page of invoice summary results exists.
	 *
	 * @Required
	 */
	private Boolean hasPreviousPage;
	public Boolean getHasPreviousPage() {
		return hasPreviousPage;
	}
	public void setHasPreviousPage(Boolean value) {
		this.hasPreviousPage = value;
	}

	/**
	 */
	private List<ErrorData> error = new ArrayList<ErrorData>();
	public List<ErrorData> getError() {
		return error;
	}
	public void setError(List<ErrorData> value) {
		this.error = value;
	}


	public SearchInvoicesResponse() {
	}
	public SearchInvoicesResponse(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "responseEnvelope" + ".timestamp") ) {
			String newPrefix = prefix + "responseEnvelope" + '.';
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if( map.containsKey(prefix + "count") ) {
			this.count = Integer.valueOf(map.get(prefix + "count"));
		}
		if( map.containsKey(prefix + "invoiceList" + ".invoice(0).invoiceID") ) {
			String newPrefix = prefix + "invoiceList" + '.';
			this.invoiceList =  new InvoiceSummaryListType(map, newPrefix);
		}
		if( map.containsKey(prefix + "page") ) {
			this.page = Integer.valueOf(map.get(prefix + "page"));
		}
		if( map.containsKey(prefix + "hasNextPage") ) {
			this.hasNextPage = Boolean.valueOf(map.get(prefix + "hasNextPage"));
		}
		if( map.containsKey(prefix + "hasPreviousPage") ) {
			this.hasPreviousPage = Boolean.valueOf(map.get(prefix + "hasPreviousPage"));
		}
		 i=0; 
		 while(true) {
			if( map.containsKey(prefix + "error" + '(' + i + ')'+ ".errorId") ) {
				String newPrefix = prefix + "error" + '(' + i + ')' + '.';
				this.error.add(new ErrorData(map, newPrefix));
			}
			else break;
			i++;
		}
	}
}
