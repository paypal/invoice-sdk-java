package com.sample.invoice;

import java.io.IOException;
import java.util.LinkedHashMap;
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
import com.paypal.svcs.services.PermissionsService;
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
		session.setAttribute("url", request.getRequestURI());
		response.setContentType("text/html");
		try {
			PermissionsService service = new PermissionsService(this
					.getServletContext().getRealPath("/")
					+ "/WEB-INF/sdk_config.properties");
			GetAccessTokenRequest tokenReq = new GetAccessTokenRequest();
			RequestEnvelope env = new RequestEnvelope("en_US");
			tokenReq.setRequestEnvelope(env);
			String text[] = request.getParameterValues("txtbox");
			int i = 0;
			tokenReq.setToken(text[i + 1]);
			tokenReq.setVerifier(text[i]);
			GetAccessTokenResponse resp = service.getAccessToken(tokenReq);
			response.getWriter()
					.println(
							"<table><tr><td><font color=grey><h3>Step 1:</h3></font></td><td><font color=grey><h3>Requesting Permissions</h3></font></td><td><img src=/invoice-sample/images/tick.png></img></td></tr><tr><td><font color=grey><h3>Step 2:</h3></font></td><td><font color=grey><h3>Generate Access Token</h3></font></td><td><img src=/invoice-sample/images/camera_test.png></img></td></tr></table>");
			if (resp != null) {
				session.setAttribute("RESPONSE_OBJECT", resp);
				session.setAttribute("lastReq", service.getLastRequest());
				session.setAttribute("lastResp", service.getLastResponse());
				if (resp.getResponseEnvelope().getAck().toString()
						.equalsIgnoreCase("SUCCESS")) {
					Map<Object, Object> map = new LinkedHashMap<Object, Object>();
					map.put("Ack", resp.getResponseEnvelope().getAck());
					map.put("AccessToken", resp.getToken());
					map.put("TokenSecret", resp.getTokenSecret());
					map.put("Return to Sample page",
							"<a href=" 
									+ (String) session.getAttribute("page")
									+ "?accessToken="
									+ resp.getToken() + "&tokenSecret="
									+ resp.getTokenSecret() + ">Return</a");
					session.setAttribute("map", map);
					response.sendRedirect("Response.jsp");
				} else {
					session.setAttribute("Error", resp.getError());
					response.sendRedirect("Error.jsp");
				}
			}

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
