package com.sample.invoice;

import java.io.IOException;
import java.util.Iterator;

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
import com.paypal.svcs.services.PermissionsService;
import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.perm.GetAccessTokenRequest;
import com.paypal.svcs.types.perm.GetAccessTokenResponse;

public class GenerateAccessTokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GenerateAccessTokenServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setContentType("text/html");
		try {
			PermissionsService permService = new PermissionsService(this
					.getServletContext().getRealPath("/")
					+ "/WEB-INF/sdk_config.properties");
			GetAccessTokenRequest tokenReq = new GetAccessTokenRequest();
			RequestEnvelope env = new RequestEnvelope("en_US");
			tokenReq.setRequestEnvelope(env);
			String text[] = request.getParameterValues("txtbox");
			int i = 0;
			tokenReq.setToken(text[i + 1]);
			tokenReq.setVerifier(text[i]);
			GetAccessTokenResponse resp = permService.getAccessToken(tokenReq);
			response.getWriter()
					.println(
							"<table><tr><td><font color=grey><h3>Step 1:</h3></font></td><td><font color=grey><h3>Requesting Permissions</h3></font></td><td><img src=/invoice-sample/images/camera_test.png></img></td></tr><tr><td><font color=grey><h3>Step 2:</h3></font></td><td><font color=grey><h3>Generate Access Token</h3></font></td><td><img src=/invoice-sample/images/camera_test.png></img></td></tr></table>");
			response.getWriter().println(
					"Ack:" + resp.getResponseEnvelope().getAck() + "<br/>");
			if (resp.getResponseEnvelope().getAck().equals(AckCode.SUCCESS)) {
				response.getWriter().println(
						"AccessToken:" + resp.getToken() + "<br/>");
				response.getWriter().println(
						"TokenSecret:" + resp.getTokenSecret() + "<br/>");
			} else {
				Iterator iterator = resp.getError().iterator();
				while (iterator.hasNext()) {
					ErrorData error = (ErrorData) iterator.next();
					response.getWriter().println("<br/>" + error.getMessage());
				}

			}
			if (session.getAttribute("page").equals("CreateInvoice")) {
				response.getWriter().println(
						"<a href=CreateInvoice?accessToken=" + resp.getToken()
								+ "&tokenSecret=" + resp.getTokenSecret()
								+ ">Return to CreateInvoice page</a>");
			}
			response.getWriter().println("<br/><a href='index.html'>Home</a>");
		} catch (OAuthException e) {
			// TODO: handle exception
			e.printStackTrace();
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
		}
	}
}
