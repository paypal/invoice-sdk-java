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
		RequestEnvelope env = new RequestEnvelope("en_US");
		SearchInvoicesRequest req = new SearchInvoicesRequest();
		req.setRequestEnvelope(env);
		req.setMerchantEmail(request.getParameter("merchantEmail"));
		req.setPage(Integer.parseInt(request.getParameter("page")));
		req.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		SearchParametersType parameters = new SearchParametersType();
		if (request.getParameter("businessName") != "")
			parameters.setBusinessName(request.getParameter("businessName"));
		if (request.getParameter("startDate") != ""
				|| request.getParameter("endDate") != "") {

			DateRangeType dateRangeType = new DateRangeType();
			if(request.getParameter("startDate") != "")
				dateRangeType.setStartDate(request.getParameter("startDate")
					+ "T00:00:00.000Z");
			if(request.getParameter("endDate") != "")
				dateRangeType.setEndDate(request.getParameter("endDate")
					+ "T23:59:59.000Z");
			parameters.setCreationDate(dateRangeType);
		}
		if (request.getParameter("currencyCode") != "")
			parameters.setCurrencyCode(request.getParameter("currencyCode"));
		if (request.getParameter("dueStartDate") != ""
				|| request.getParameter("dueEndDate") != "") {
			DateRangeType dueDate = new DateRangeType();
			if(request.getParameter("dueStartDate") != "")
				dueDate.setStartDate(request.getParameter("dueStartDate")
					+ "T00:00:00.000Z");
			if(request.getParameter("dueEndDate") != "")
				dueDate.setEndDate(request.getParameter("dueEndDate")
					+ "T23:59:59.000Z");
			parameters.setDueDate(dueDate);
		}
		parameters.setEmail(request.getParameter("email"));
		if (request.getParameter("invoiceStartDate") != ""
				|| request.getParameter("invoiceEndDate") != "") {
			DateRangeType invoiceDate = new DateRangeType();
			if(request.getParameter("invoiceStartDate") != "")
				invoiceDate.setStartDate(request.getParameter("invoiceStartDate")
					+ "T00:00:00.000Z");
			if(request.getParameter("invoiceEndDate") != "")
				invoiceDate.setEndDate(request.getParameter("invoiceEndDate")
					+ "T23:59:59.000Z");
			parameters.setInvoiceDate(invoiceDate);
		}
		parameters.setInvoiceNumber(request.getParameter("invoiceNum"));
		if (request.getParameter("lowerAmount") != "")
			parameters.setLowerAmount(Double.parseDouble(request
					.getParameter("lowerAmount")));
		parameters.setMemo(request.getParameter("memo"));
		if(request.getParameter("originType") != "") {
			parameters.setOrigin(OriginType.fromValue(request
					.getParameter("originType")));
		}
		if (request.getParameter("paymentStartDate") != ""
				|| request.getParameter("paymentEndDate") != "") {
			DateRangeType paymentDate = new DateRangeType();
			if(request.getParameter("paymentEndDate") != "")
				paymentDate.setEndDate(request.getParameter("paymentEndDate")
					+ "T23:59:59.000Z");
			if(request.getParameter("paymentStartDate") != "")
				paymentDate.setStartDate(request.getParameter("paymentStartDate")
					+ "T00:00:00.000Z");
			parameters.setPaymentDate(paymentDate);
		}// if (request.getParameter("recipientName") != "")
		parameters.setRecipientName(request.getParameter("recipientName"));
		List<StatusType> statusList = new ArrayList<StatusType>();
		if (request.getParameterValues("status") != null) {
			String[] statusLst = request.getParameterValues("status");
			for (int i = 0; i < statusLst.length; i++)
				statusList.add(StatusType.fromValue(statusLst[i]));
			parameters.setStatus(statusList);
		}
		if (request.getParameter("upperAmount") != "")
			parameters.setUpperAmount(Double.parseDouble(request
					.getParameter("upperAmount")));
		req.setParameters(parameters);
		try {

			InvoiceService invoiceSrvc = new InvoiceService(this
					.getServletContext().getRealPath("/")
					+ "/WEB-INF/sdk_config.properties");
			if (request.getParameter("accessToken") != null
					&& request.getParameter("tokenSecret") != null) {
				invoiceSrvc.setAccessToken(request.getParameter("accessToken"));
				invoiceSrvc.setTokenSecret(request.getParameter("tokenSecret"));

			}
			response.setContentType("text/html");
			SearchInvoicesResponse resp = invoiceSrvc.searchInvoices(req);
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
					map.put("Ack", resp.getResponseEnvelope().getAck());
					map.put("Page", resp.getPage());
					map.put("Match count", resp.getCount());
					if (resp.getInvoiceList() != null) {
						Iterator<InvoiceSummaryType> iterator = resp
								.getInvoiceList().getInvoice().iterator();
						int index = 1;
						while (iterator.hasNext()) {
							InvoiceSummaryType invSummaryType = iterator.next();
							map.put("Invoice ID" + index,
									invSummaryType.getInvoiceID());
							map.put("Merchant Email" + index,
									invSummaryType.getMerchantEmail());
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
