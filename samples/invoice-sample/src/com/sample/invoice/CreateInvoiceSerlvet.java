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
		session.setAttribute(
				"relatedUrl",
				"<ul><li><a href='CreateInvoice'>CreateInvoice</a></li><li><a href='CreateInvoice'>CreateAndSendInvoice</a></li><li><a href='SendInvoice'>SendInvoice</a></li><li><a href='CancelInvoice'>CancelInvoice</a></li><li><a href='UpdateInvoice'>UpdateInvoice</a></li><li><a href='MarkInvoiceAsPaid'>MarkInvoiceAsPaid</a></li><li><a href='GetInvoiceDetails'>GetInvoiceDetails</a></li><li><a href='SearchInvoices'>SearchInvoices</a></li></ul>");
		InvoiceType invoiceType = new InvoiceType();
		invoiceType.setMerchantEmail(request.getParameter("merchantEmail"));
		invoiceType.setPayerEmail(request.getParameter("payerEmail"));
		List<InvoiceItemType> items = new ArrayList<InvoiceItemType>();
		InvoiceItemListType invoiceItem = new InvoiceItemListType();
		items.add(new InvoiceItemType(request.getParameter("item_name1"),
				Double.valueOf(request.getParameter("item_quantity1")), Double
						.valueOf(request.getParameter("item_unitPrice1"))));
		items.add(new InvoiceItemType(request.getParameter("item_name2"),
				Double.valueOf(request.getParameter("item_quantity2")), Double
						.valueOf(request.getParameter("item_unitPrice2"))));
		invoiceItem.setItem(items);
		invoiceType.setItemList(invoiceItem);

		invoiceType.setCurrencyCode(request.getParameter("currencyCode"));
		invoiceType.setPaymentTerms(PaymentTermsType.fromValue(request
				.getParameter("paymentTerms")));

		RequestEnvelope env = new RequestEnvelope("en_US");
		try {
			response.setContentType("text/html");
			if (request.getParameter("CreateBtn") != null) {
				if (request.getParameter("CreateBtn").equals("CreateInvoice")) {
					CreateInvoiceRequest createRequest = new CreateInvoiceRequest(
							env, invoiceType);
					InvoiceService invoiceSrvc = new InvoiceService(this
							.getServletContext().getRealPath("/")
							+ "/WEB-INF/sdk_config.properties");

					if (request.getParameter("accessToken") != null
							&& request.getParameter("tokenSecret") != null) {
						invoiceSrvc.setAccessToken(request
								.getParameter("accessToken"));
						invoiceSrvc.setTokenSecret(request
								.getParameter("tokenSecret"));

					}
					CreateInvoiceResponse resp = invoiceSrvc
							.createInvoice(createRequest);

					if (resp != null) {
						session.setAttribute("lastReq",
								invoiceSrvc.getLastRequest());
						session.setAttribute("lastResp",
								invoiceSrvc.getLastResponse());
						if (resp.getResponseEnvelope().getAck().toString()
								.equalsIgnoreCase("SUCCESS")) {
							Map<Object, Object> map = new LinkedHashMap<Object, Object>();
							map.put("Ack", resp.getResponseEnvelope().getAck());
							map.put("Invoice ID", resp.getInvoiceID());
							map.put("Invoice Number", resp.getInvoiceNumber());
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
					CreateAndSendInvoiceRequest createRequest = new CreateAndSendInvoiceRequest(
							env, invoiceType);
					InvoiceService invoiceSrvc = new InvoiceService(this
							.getServletContext().getRealPath("/")
							+ "/WEB-INF/sdk_config.properties");

					CreateAndSendInvoiceResponse resp = invoiceSrvc
							.createAndSendInvoice(createRequest);

					if (resp != null) {
						session.setAttribute("lastReq",
								invoiceSrvc.getLastRequest());
						session.setAttribute("lastResp",
								invoiceSrvc.getLastResponse());
						if (resp.getResponseEnvelope().getAck().toString()
								.equalsIgnoreCase("SUCCESS")) {
							Map<Object, Object> map = new LinkedHashMap<Object, Object>();
							map.put("Ack", resp.getResponseEnvelope().getAck());
							map.put("Invoice ID", resp.getInvoiceID());
							map.put("Invoice Number", resp.getInvoiceNumber());
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
