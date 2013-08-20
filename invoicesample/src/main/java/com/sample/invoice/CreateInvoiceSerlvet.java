package com.sample.invoice;

import java.io.IOException;
import java.util.ArrayList;
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
import com.paypal.svcs.types.pt.CreateAndSendInvoiceRequest;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceResponse;
import com.paypal.svcs.types.pt.CreateInvoiceRequest;
import com.paypal.svcs.types.pt.CreateInvoiceResponse;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.InvoiceItemType;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.PaymentTermsType;

/**
 * Servlet implementation class CreateInvoiceSerlvet
 */
public class CreateInvoiceSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateInvoiceSerlvet() {
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
				.getRequestDispatcher("/CreateInvoice.jsp")
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
		// InvoiceType which takes mandatory params:
		//
		// * `Merchant Email` - Merchant email address.
		// * `Personal Email` - Payer email address.
		// * `InvoiceItemList` - List of items included in this invoice.
		// * `CurrencyCode` - Currency used for all invoice item amounts and
		// totals.
		// * `PaymentTerms` - Terms by which the invoice payment is due. It is
		// one of the following values:
		// * DueOnReceipt - Payment is due when the payer receives the invoice.
		// * DueOnDateSpecified - Payment is due on the date specified in the
		// invoice.
		// * Net10 - Payment is due 10 days from the invoice date.
		// * Net15 - Payment is due 15 days from the invoice date.
		// * Net30 - Payment is due 30 days from the invoice date.
		// * Net45 - Payment is due 45 days from the invoice date.
		InvoiceType invoiceType = new InvoiceType();
		invoiceType.setMerchantEmail(request.getParameter("merchantEmail"));
		invoiceType.setPayerEmail(request.getParameter("payerEmail"));

		// InvoiceItemType which takes mandatory params:
		//
		// * `Item Name` - SKU or name of the item.
		// * `Quantity` - Item count.
		// * `Amount` - Price of the item, in the currency specified by the
		// invoice.
		List<InvoiceItemType> items = new ArrayList<InvoiceItemType>();
		InvoiceItemListType invoiceItem = new InvoiceItemListType();
		// Individual Item [name, quantity, price]
		items.add(new InvoiceItemType(request.getParameter("item_name1"),
				Double.valueOf(request.getParameter("item_quantity1")), Double
						.valueOf(request.getParameter("item_unitPrice1"))));
		// Individual Item [name, quantity, price]
		items.add(new InvoiceItemType(request.getParameter("item_name2"),
				Double.valueOf(request.getParameter("item_quantity2")), Double
						.valueOf(request.getParameter("item_unitPrice2"))));
		invoiceItem.setItem(items);
		invoiceType.setItemList(invoiceItem);
		// PayPal uses 3-character ISO-4217 codes for specifying currencies in
		// fields and variables.
		invoiceType.setCurrencyCode(request.getParameter("currencyCode"));
		/*
		 * (Required) Terms by which the invoice payment is due. It is one of
		 * the following values: 1. DueOnReceipt – Payment is due when the payer
		 * receives the invoice. 2. DueOnDateSpecified – Payment is due on the
		 * date specified in the invoice. 3. Net10 – Payment is due 10 days from
		 * the invoice date. 4. Net15 – Payment is due 15 days from the invoice
		 * date. 5. Net30 – Payment is due 30 days from the invoice date. 6.
		 * Net45 – Payment is due 45 days from the invoice date.
		 */
		invoiceType.setPaymentTerms(PaymentTermsType.fromValue(request
				.getParameter("paymentTerms")));

		RequestEnvelope env = new RequestEnvelope();

		// The code for the language in which errors are returned, which must be
		// en_US.
		env.setErrorLanguage("en_US");
		try {
			response.setContentType("text/html");
			if (request.getParameter("CreateBtn") != null) {
				if (request.getParameter("CreateBtn").equals("CreateInvoice")) {
					// ##CreateInvoiceRequest
					// Use the CreateInvoiceRequest message to create a new
					// invoice. The
					// merchant issuing the invoice, and the partner, if any,
					// making the
					// call, must have a PayPal account in good standing.
					CreateInvoiceRequest createRequest = new CreateInvoiceRequest(
							env, invoiceType);

					// Configuration map containing signature credentials and
					// other required configuration.
					// For a full list of configuration parameters refer in wiki page.
					// (https://github.com/paypal/sdk-core-java/wiki/SDK-Configuration-Parameters)
					Map<String, String> configurationMap = Configuration
							.getAcctAndConfig();

					// Creating service wrapper object to make an API call by
					// loading configuration map.
					InvoiceService invoiceSrvc = new InvoiceService(
							configurationMap);

					/*
					 * AccessToken and TokenSecret for third party
					 * authentication. PayPal Permission api provides these
					 * tokens.Please refer Permission SDK at
					 * (https://github.com/paypal/permissions-sdk-java).
					 */
					SignatureCredential cred = null;
					if (request.getParameter("accessToken") != null
							&& request.getParameter("tokenSecret") != null) {
						ThirdPartyAuthorization thirdPartyAuth = new TokenAuthorization(
								request.getParameter("accessToken"),
								request.getParameter("tokenSecret"));

						cred = new SignatureCredential(
								"jb-us-seller_api1.paypal.com",
								"WX4WTU3S8MY44S7F",
								"AFcWxV21C7fd0v3bYYYRCpSSRl31A7yDhhsPUU2XhtMoZXsWHFxu-RWy");

						cred.setApplicationId("APP-80W284485P519543T");
						cred.setThirdPartyAuthorization(thirdPartyAuth);
					}

					// ## Making API call
					// Invoke the appropriate method corresponding to API in
					// service
					// wrapper object
					CreateInvoiceResponse resp = invoiceSrvc.createInvoice(
							createRequest, cred);

					if (resp != null) {
						session.setAttribute("RESPONSE_OBJECT", resp);
						session.setAttribute("lastReq",
								invoiceSrvc.getLastRequest());
						session.setAttribute("lastResp",
								invoiceSrvc.getLastResponse());
						if (resp.getResponseEnvelope().getAck().toString()
								.equalsIgnoreCase("SUCCESS")) {
							Map<Object, Object> map = new LinkedHashMap<Object, Object>();
							/*
							 * common:AckCode Acknowledgement code. It is one of
							 * the following values: Success – The operation
							 * completed successfully. Failure – The operation
							 * failed. SuccessWithWarning – The operation
							 * completed successfully; however, there is a
							 * warning message. FailureWithWarning – The
							 * operation failed with a warning message.
							 */
							map.put("Ack", resp.getResponseEnvelope().getAck());
							// ID of the created invoice.
							map.put("Invoice ID", resp.getInvoiceID());
							// Invoice number of the created invoice.
							map.put("Invoice Number", resp.getInvoiceNumber());
							// URL location where merchants view the invoice
							// details
							map.put("Invoice URL", resp.getInvoiceURL());
							session.setAttribute("map", map);
							response.sendRedirect("Response.jsp");
						} else {
							session.setAttribute("Error", resp.getError());
							response.sendRedirect("Error.jsp");
						}
					}
				} else if (request.getParameter("CreateBtn").equals(
						"CreateAndSendInvoice")) {
					// CreateAndSendInvoiceRequest which takes mandatory params:
					//
					// * `Request Envelope` - Information common to each API
					// operation, such
					// as the language in which an error message is returned.
					// * `Invoice` - Merchant, payer, and invoice information.
					CreateAndSendInvoiceRequest createRequest = new CreateAndSendInvoiceRequest(
							env, invoiceType);

					/*
					 * ## Creating service wrapper object Creating service
					 * wrapper object to make API call and loading configuration
					 * file for your credentials and endpoint
					 */
					InvoiceService invoiceSrvc = new InvoiceService(
							Configuration.getAcctAndConfig());

					/*
					 * AccessToken and TokenSecret for third party
					 * authentication. PayPal Permission api provides these
					 * tokens.Please refer Permission SDK at
					 * (https://github.com/paypal/permissions-sdk-java).
					 */
					SignatureCredential cred = null;
					if (request.getParameter("accessToken") != null
							&& request.getParameter("tokenSecret") != null) {
						ThirdPartyAuthorization thirdPartyAuth = new TokenAuthorization(
								request.getParameter("accessToken"),
								request.getParameter("tokenSecret"));

						cred = new SignatureCredential(
								"jb-us-seller_api1.paypal.com",
								"WX4WTU3S8MY44S7F",
								"AFcWxV21C7fd0v3bYYYRCpSSRl31A7yDhhsPUU2XhtMoZXsWHFxu-RWy");

						cred.setApplicationId("APP-80W284485P519543T");
						cred.setThirdPartyAuthorization(thirdPartyAuth);
					}

					/*
					 * ## Making API call Invoke the appropriate method
					 * corresponding to API in service wrapper object
					 */
					CreateAndSendInvoiceResponse resp = invoiceSrvc
							.createAndSendInvoice(createRequest, cred);

					if (resp != null) {
						session.setAttribute("RESPONSE_OBJECT", resp);
						session.setAttribute("lastReq",
								invoiceSrvc.getLastRequest());
						session.setAttribute("lastResp",
								invoiceSrvc.getLastResponse());
						if (resp.getResponseEnvelope().getAck().toString()
								.equalsIgnoreCase("SUCCESS")) {
							Map<Object, Object> map = new LinkedHashMap<Object, Object>();
							/*
							 * common:AckCode Acknowledgement code. It is one of
							 * the following values: Success – The operation
							 * completed successfully. Failure – The operation
							 * failed. SuccessWithWarning – The operation
							 * completed successfully; however, there is a
							 * warning message. FailureWithWarning – The
							 * operation failed with a warning message.
							 */
							map.put("Ack", resp.getResponseEnvelope().getAck());
							// ID of the created invoice.
							map.put("Invoice ID", resp.getInvoiceID());
							// Invoice number of the created invoice.
							map.put("Invoice Number", resp.getInvoiceNumber());
							// URL location where merchants view the invoice
							// details
							map.put("Invoice URL", resp.getInvoiceURL());
							session.setAttribute("map", map);
							response.sendRedirect("Response.jsp");
						} else {
							session.setAttribute("Error", resp.getError());
							response.sendRedirect("Error.jsp");
						}
					}
				} else {
					response.getWriter().println(
							"Unknown request - click one of the buttons");
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
