package com.sample.invoice;

import java.io.IOException;
import java.util.LinkedHashMap;
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
import com.paypal.svcs.types.pt.GetInvoiceDetailsRequest;
import com.paypal.svcs.types.pt.GetInvoiceDetailsResponse;

/**
 * Servlet implementation class CreateInvoiceSerlvet
 */
public class GetInvoiceDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetInvoiceDetailsServlet() {
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
				.getRequestDispatcher("/GetInvoiceDetails.jsp")
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
		// The code for the language in which errors are returned, which must be
		// en_US.
		env.setErrorLanguage("en_US");
		GetInvoiceDetailsRequest req = new GetInvoiceDetailsRequest();
		req.setRequestEnvelope(env);
		// ID of the invoice.
		req.setInvoiceID(request.getParameter("invoiceId"));
		try {
			// Configuration map containing signature credentials and other
			// required configuration.
			// For a full list of configuration parameters refer in wiki page
			// (https://github.com/paypal/sdk-core-java/wiki/SDK-Configuration-Parameters)
			Map<String, String> configurationMap = Configuration
					.getAcctAndConfig();

			// Creating service wrapper object to make an API call by loading
			// configuration map.
			InvoiceService invoiceSrvc = new InvoiceService(configurationMap);

			/*
			 * AccessToken and TokenSecret for third party authentication.
			 * PayPal Permission api provides these tokens.Please refer
			 * Permission SDK at
			 * (https://github.com/paypal/permissions-sdk-java).
			 */
			SignatureCredential cred = null;
			if (request.getParameter("accessToken") != null
					&& request.getParameter("accessToken").length() > 0
					&& request.getParameter("tokenSecret") != null
					&& request.getParameter("tokenSecret").length() > 0) {
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
			GetInvoiceDetailsResponse resp = null;
			if (cred != null) {
				resp = invoiceSrvc.getInvoiceDetails(req, cred);
			} else {
				resp = invoiceSrvc.getInvoiceDetails(req);
			}
			if (resp != null) {
				session.setAttribute("RESPONSE_OBJECT", resp);
				session.setAttribute("lastReq", invoiceSrvc.getLastRequest());
				session.setAttribute("lastResp", invoiceSrvc.getLastResponse());
				if (resp.getResponseEnvelope().getAck().toString()
						.equalsIgnoreCase("SUCCESS")) {
					Map<Object, Object> map = new LinkedHashMap<Object, Object>();
					/*
					 * common:AckCode Acknowledgement code. It is one of the
					 * following values: Success � The operation completed
					 * successfully. Failure � The operation failed.
					 * SuccessWithWarning � The operation completed
					 * successfully; however, there is a warning message.
					 * FailureWithWarning � The operation failed with a warning
					 * message.
					 */
					map.put("Ack", resp.getResponseEnvelope().getAck());

					// Account that created the invoice.
					map.put("Created By", resp.getInvoiceDetails()
							.getCreatedBy());
					if (resp.getPaymentDetails() != null) {
						// Returns True if the invoice was paid by PayPal.
						map.put("ViaPayPal", resp.getPaymentDetails()
								.getViaPayPal());
					}

					// URL location where merchants view the invoice details.
					map.put("Invoice URL", resp.getInvoiceURL());
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
