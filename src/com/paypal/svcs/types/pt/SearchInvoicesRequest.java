
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.SearchParametersType;
import java.io.UnsupportedEncodingException;


/**
 * The request object for SearchInvoices.
 */
public class SearchInvoicesRequest {

	/**
	 *
	 * @Required
	 */
	private RequestEnvelope requestEnvelope;
	public RequestEnvelope getRequestEnvelope() {
		return requestEnvelope;
	}
	public void setRequestEnvelope(RequestEnvelope value) {
		this.requestEnvelope = value;
	}

	/**
	 * Invoice creator's email.
	 *
	 * @Required
	 */
	private String merchantEmail;
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String value) {
		this.merchantEmail = value;
	}

	/**
	 * Parameters constraining the search.
	 *
	 * @Required
	 */
	private SearchParametersType parameters;
	public SearchParametersType getParameters() {
		return parameters;
	}
	public void setParameters(SearchParametersType value) {
		this.parameters = value;
	}

	/**
	 * Page number of result set, starting with 1.
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
	 * Number of results per page, between 1 and 100.
	 *
	 * @Required
	 */
	private Integer pageSize;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer value) {
		this.pageSize = value;
	}


	public SearchInvoicesRequest(RequestEnvelope requestEnvelope, String merchantEmail, SearchParametersType parameters, Integer page, Integer pageSize) {
		this.requestEnvelope = requestEnvelope;
		this.merchantEmail = merchantEmail;
		this.parameters = parameters;
		this.page = page;
		this.pageSize = pageSize;
	}
	public SearchInvoicesRequest() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( requestEnvelope != null ) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if( merchantEmail != null ) {
			sb.append(prefix).append("merchantEmail=").append(NVPUtil.encodeUrl(merchantEmail));
			sb.append('&');
		}
		if( parameters != null ) {
			String newPrefix = prefix + "parameters.";
			sb.append(parameters.toNVPString(newPrefix));
		}
		if( page != null ) {
			sb.append(prefix).append("page=").append(page);
			sb.append('&');
		}
		if( pageSize != null ) {
			sb.append(prefix).append("pageSize=").append(pageSize);
			sb.append('&');
		}
		return sb.toString();
	}

}
