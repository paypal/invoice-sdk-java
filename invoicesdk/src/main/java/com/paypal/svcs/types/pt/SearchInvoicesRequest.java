package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.SearchParametersType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 *  The request object for SearchInvoices. 
 */
public class SearchInvoicesRequest{


	/**
	*  	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	*  Invoice creator's email. 	  
	 *@Required	 
	 */ 
	private String merchantEmail;

	/**
	*  Parameters constraining the search. 	  
	 *@Required	 
	 */ 
	private SearchParametersType parameters;

	/**
	*  Page number of result set, starting with 1. 	  
	 *@Required	 
	 */ 
	private Integer page;

	/**
	*  Number of results per page, between 1 and 100. 	  
	 *@Required	 
	 */ 
	private Integer pageSize;

	

	/**
	 * Constructor with arguments
	 */
	public SearchInvoicesRequest (RequestEnvelope requestEnvelope, String merchantEmail, SearchParametersType parameters, Integer page, Integer pageSize){
		this.requestEnvelope = requestEnvelope;
		this.merchantEmail = merchantEmail;
		this.parameters = parameters;
		this.page = page;
		this.pageSize = pageSize;
	}	

	/**
	 * Default Constructor
	 */
	public SearchInvoicesRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
	 }
	 
	/**
	 * Getter for merchantEmail
	 */
	 public String getMerchantEmail() {
	 	return merchantEmail;
	 }
	 
	/**
	 * Setter for merchantEmail
	 */
	 public void setMerchantEmail(String merchantEmail) {
	 	this.merchantEmail = merchantEmail;
	 }
	 
	/**
	 * Getter for parameters
	 */
	 public SearchParametersType getParameters() {
	 	return parameters;
	 }
	 
	/**
	 * Setter for parameters
	 */
	 public void setParameters(SearchParametersType parameters) {
	 	this.parameters = parameters;
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
	 * Getter for pageSize
	 */
	 public Integer getPageSize() {
	 	return pageSize;
	 }
	 
	/**
	 * Setter for pageSize
	 */
	 public void setPageSize(Integer pageSize) {
	 	this.pageSize = pageSize;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.merchantEmail != null) {
			sb.append(prefix).append("merchantEmail=").append(NVPUtil.encodeUrl(this.merchantEmail));
			sb.append("&");
		}
		if (this.parameters != null) {
			String newPrefix = prefix + "parameters.";
			sb.append(this.parameters.toNVPString(newPrefix));
		}
		if (this.page != null) {
			sb.append(prefix).append("page=").append(this.page);
			sb.append("&");
		}
		if (this.pageSize != null) {
			sb.append(prefix).append("pageSize=").append(this.pageSize);
			sb.append("&");
		}
		return sb.toString();
	}

}