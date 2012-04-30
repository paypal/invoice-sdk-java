
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * The response object for CreateAndSendInvoice.
 */
public class CreateAndSendInvoiceResponse {

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
	 * The created invoice's ID.
	 *
	 * @Required
	 */
	private String invoiceID;
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String value) {
		this.invoiceID = value;
	}

	/**
	 * The created invoice's number.
	 *
	 * @Required
	 */
	private String invoiceNumber;
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	/**
	 * The URL which lead merchant to view the invoice details on web.
	 *
	 * @Required
	 */
	private String invoiceURL;
	public String getInvoiceURL() {
		return invoiceURL;
	}
	public void setInvoiceURL(String value) {
		this.invoiceURL = value;
	}

	/**
	 * The total amount of the invoice (cost of items, shipping and tax, less any discount).
	 *
	 * @Required
	 */
	private Integer totalAmount;
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer value) {
		this.totalAmount = value;
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


	public CreateAndSendInvoiceResponse() {
	}
	public CreateAndSendInvoiceResponse(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "responseEnvelope" + ".timestamp") ) {
			String newPrefix = prefix + "responseEnvelope" + '.';
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if( map.containsKey(prefix + "invoiceID") ) {
			this.invoiceID = map.get(prefix + "invoiceID");
		}
		if( map.containsKey(prefix + "invoiceNumber") ) {
			this.invoiceNumber = map.get(prefix + "invoiceNumber");
		}
		if( map.containsKey(prefix + "invoiceURL") ) {
			this.invoiceURL = map.get(prefix + "invoiceURL");
		}
		if( map.containsKey(prefix + "totalAmount") ) {
			this.totalAmount = Integer.valueOf(map.get(prefix + "totalAmount"));
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
