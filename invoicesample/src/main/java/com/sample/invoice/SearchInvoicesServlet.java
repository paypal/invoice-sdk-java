package com.sample.invoice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paypal.core.credential.SignatureCredential;
import com.paypal.core.credential.ThirdPartyAuthorization;
import com.paypal.core.credential.TokenAuthorization;
import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.svcs.services.InvoiceService;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.DateRangeType;
import com.paypal.svcs.types.pt.InvoiceSummaryType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.SearchInvoicesRequest;
import com.paypal.svcs.types.pt.SearchInvoicesResponse;
import com.paypal.svcs.types.pt.SearchParametersType;
import com.paypal.svcs.types.pt.StatusType;

/**
 * Servlet implementation class UpdateInvoiceSerlvet
 */
public class SearchInvoicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchInvoicesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		getServletConfig().getServletContext()
				.getRequestDispatcher("/SearchInvoices.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("url", request.getRequestURI());
		RequestEnvelope env = new RequestEnvelope();
		
		/*
		 *  (Required) RFC 3066 language in which error messages are returned; 
		 *  by default it is en_US, which is the only language currently supported. 
		 */
		env.setErrorLanguage("en_US");
		
		/* SearchInvoicesRequest which takes mandatory params:
		 # `Request Envelope` - Information common to each API operation, such
		 as the language in which an error message is returned.
		 # `Merchant Email` - Email address of invoice creator.
		 # `SearchParameters` - Parameters constraining the search.
		 # `Page` - Page number of result set, starting with 1.
		 # `Page Size` - Number of results per page, between 1 and 100.
		*/
		SearchInvoicesRequest req = new SearchInvoicesRequest();
		req.setRequestEnvelope(env);
		
		//(Required) Email address of invoice creator. 
		req.setMerchantEmail(request.getParameter("merchantEmail"));
		
		// (Required) Page number of result set, starting with 1. 
		req.setPage(Integer.parseInt(request.getParameter("page")));
		
		//(Required) Number of results per page, between 1 and 100. 
		req.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		
		SearchParametersType parameters = new SearchParametersType();
		
		// (Optional) Company search string. 
		if (request.getParameter("businessName") != "")
			parameters.setBusinessName(request.getParameter("businessName"));
		
		if (request.getParameter("startDate") != ""
				|| request.getParameter("endDate") != "") {

			DateRangeType dateRangeType = new DateRangeType();
			//(Optional) Start of the date range
			if(request.getParameter("startDate") != "")
				dateRangeType.setStartDate(request.getParameter("startDate")
					+ "T00:00:00.000Z");
			//(Optional) End of the date range. 
			if(request.getParameter("endDate") != "")
				dateRangeType.setEndDate(request.getParameter("endDate")
					+ "T23:59:59.000Z");
			parameters.setCreationDate(dateRangeType);
		}
		
		/*
		 * (Optional) Currency used for lower and upper amounts. 
		 * It is required when you specify lowerAmount or upperAmount. 
		 */
		if (request.getParameter("currencyCode") != "")
			parameters.setCurrencyCode(request.getParameter("currencyCode"));
		
		
		if (request.getParameter("dueStartDate") != ""
				|| request.getParameter("dueEndDate") != "") {
			DateRangeType dueDate = new DateRangeType();
			//(Optional) Start of the due date range
			if(request.getParameter("dueStartDate") != "")
				dueDate.setStartDate(request.getParameter("dueStartDate")
					+ "T00:00:00.000Z");
			
			//(Optional) End of the due date range. 
			if(request.getParameter("dueEndDate") != "")
				dueDate.setEndDate(request.getParameter("dueEndDate")
					+ "T23:59:59.000Z");
			
			//(Optional) Invoice due date range filter. 
			parameters.setDueDate(dueDate);
		}
		
		//(Optional) Email search string. 
		parameters.setEmail(request.getParameter("email"));
		
		if (request.getParameter("invoiceStartDate") != ""
				|| request.getParameter("invoiceEndDate") != "") {
			DateRangeType invoiceDate = new DateRangeType();
			//(Optional) Start of the invoice date range
			if(request.getParameter("invoiceStartDate") != "")
				invoiceDate.setStartDate(request.getParameter("invoiceStartDate")
					+ "T00:00:00.000Z");
			//(Optional) End of the invoice date range.
			if(request.getParameter("invoiceEndDate") != "")
				invoiceDate.setEndDate(request.getParameter("invoiceEndDate")
					+ "T23:59:59.000Z");
			//(Optional) Invoice date range filter. 
			parameters.setInvoiceDate(invoiceDate);
		}
		
		//(Optional) Invoice number search string. 
		parameters.setInvoiceNumber(request.getParameter("invoiceNum"));
		
		/*
		 * (Optional) Invoice amount search. It specifies the smallest amount to be returned. 
		 * If you pass a value for this field, you must also pass a currencyCode value.
		 */
		if (request.getParameter("lowerAmount") != "")
			parameters.setLowerAmount(Double.parseDouble(request
					.getParameter("lowerAmount")));
		
		//(Optional) Invoice memo search string. 
		parameters.setMemo(request.getParameter("memo"));
		
		/*
		 *  (Optional) Indicates whether the invoice was created by the website or by an API call. 
		 *  It is one of the following values:

		    Web – The invoice was created on paypal.com.
		    API – The invoice was created by an Invoicing Service API call.

		 */
		if(request.getParameter("originType") != "") {
			parameters.setOrigin(OriginType.fromValue(request.getParameter("originType")));
		}
		
		
		if (request.getParameter("paymentStartDate") != ""
				|| request.getParameter("paymentEndDate") != "") {
			DateRangeType paymentDate = new DateRangeType();
			//(Optional) Start of the payment date range
			if(request.getParameter("paymentEndDate") != "")
				paymentDate.setEndDate(request.getParameter("paymentEndDate")
					+ "T23:59:59.000Z");
			//(Optional) End of the payment date range.
			if(request.getParameter("paymentStartDate") != "")
				paymentDate.setStartDate(request.getParameter("paymentStartDate")
					+ "T00:00:00.000Z");
			
			//(Optional) Invoice payment date range filter. 	
			parameters.setPaymentDate(paymentDate);
		}// if (request.getParameter("recipientName") != "")
		
		//(Optional) Recipient search string. 
		parameters.setRecipientName(request.getParameter("recipientName"));
		
		//(Optional) Invoice status search. 
		List<StatusType> statusList = new ArrayList<StatusType>();
		if (request.getParameterValues("status") != null) {
			String[] statusLst = request.getParameterValues("status");
			for (int i = 0; i < statusLst.length; i++)
				statusList.add(StatusType.fromValue(statusLst[i]));
			parameters.setStatus(statusList);
		}
		
		/*
		 * (Optional) Invoice amount search. It specifies the largest amount to be returned. 
		 * If you pass a value for this field, you must also pass a currencyCode value.
		 */
		if (request.getParameter("upperAmount") != "")
			parameters.setUpperAmount(Double.parseDouble(request.getParameter("upperAmount")));
		
		req.setParameters(parameters);
		try {
			
			// Configuration map containing signature credentials and other required configuration.
			// For a full list of configuration parameters refer at 
			// [https://github.com/paypal/invoice-sdk-java/wiki/SDK-Configuration-Parameters]
			Map<String,String> configurationMap =  Configuration.getAcctAndConfig();
			
			// Creating service wrapper object to make an API call by loading configuration map.
			InvoiceService invoiceSrvc = new InvoiceService(configurationMap);
			
			/* AccessToken and TokenSecret for third party authentication.
			   PayPal Permission api provides these tokens.Please refer Permission SDK 
			   at (https://github.com/paypal/permissions-sdk-java). 	
			*/
			SignatureCredential cred = null;
			if (request.getParameter("accessToken") != null
					&& request.getParameter("tokenSecret") != null) {
				ThirdPartyAuthorization thirdPartyAuth = new TokenAuthorization(
						request.getParameter("accessToken"),
						request.getParameter("tokenSecret"));

				cred = new SignatureCredential("jb-us-seller_api1.paypal.com",
						"WX4WTU3S8MY44S7F",
						"AFcWxV21C7fd0v3bYYYRCpSSRl31A7yDhhsPUU2XhtMoZXsWHFxu-RWy");

				cred.setApplicationId("APP-80W284485P519543T");
				cred.setThirdPartyAuthorization(thirdPartyAuth);
			}
			response.setContentType("text/html");
			// ## Making API call
			// Invoke the appropriate method corresponding to API in service
			// wrapper object
			SearchInvoicesResponse resp = invoiceSrvc.searchInvoices(req, cred);
			String lastReq = null;
			if (resp != null) {
				session.setAttribute("RESPONSE_OBJECT", resp);
				if (invoiceSrvc.getLastRequest().contains("&")) {
					lastReq = invoiceSrvc.getLastRequest()
							.replace("&", "&amp;");
				}
				session.setAttribute("lastReq", lastReq);
				session.setAttribute("lastResp", invoiceSrvc.getLastResponse());
				if (resp.getResponseEnvelope().getAck().toString()
						.equalsIgnoreCase("SUCCESS")) {
					Map<Object, Object> map = new LinkedHashMap<Object, Object>();
					
					/*
					 * common:AckCode Acknowledgement code. It is one of the following 
					 * values:
					    Success – The operation completed successfully.
					    Failure – The operation failed.
					    SuccessWithWarning – The operation completed successfully; however, there is a warning message.
					    FailureWithWarning – The operation failed with a warning message.
					 */
					map.put("Ack", resp.getResponseEnvelope().getAck());
					
					// URL location where the merchant views invoice details. 
					map.put("Page", resp.getPage());
					
					// Number of invoices that matched the request. 
					map.put("Match count", resp.getCount());
					if (resp.getInvoiceList() != null) {
						Iterator<InvoiceSummaryType> iterator = resp.getInvoiceList().getInvoice().iterator();
						int index = 1;
						while (iterator.hasNext()) {
							InvoiceSummaryType invSummaryType = iterator.next();
							//ID of the invoice. 
							map.put("Invoice ID" + index,invSummaryType.getInvoiceID());
							//Merchant email address. 
							map.put("Merchant Email" + index,invSummaryType.getMerchantEmail());
							index++;
						}
					}
					session.setAttribute("map", map);
					response.sendRedirect("Response.jsp");
				} else {
					session.setAttribute("Error", resp.getError());
					response.sendRedirect("Error.jsp");
				}
			}

		} catch (SSLConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidCredentialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HttpErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidResponseDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientActionRequiredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingCredentialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
