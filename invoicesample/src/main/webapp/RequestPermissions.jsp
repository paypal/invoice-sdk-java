<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>PayPal Invoicing SDK - RequestPermissions</title>
	<link rel="stylesheet" type="text/css" href="sdk.css"/> 
	<script type="text/javascript" src="sdk.js"></script>
<%
	StringBuilder url = new StringBuilder();
	url.append("http://");
	url.append(request.getServerName());
	url.append(":");
	url.append(request.getServerPort());
	url.append(request.getContextPath());
	String returnURL = url.toString() + "/GenerateAccessToken.jsp";
%>
</head>
<body>
	<form method="post">
		<h4>PayPal Permissions</h4>
		<ul class="wizard">
			<li class="current">Step 1: Request Permissions</li>
			<li>Step 2: Generate Access Token</li>
		</ul>
		<div class="request_form">
			<div class="params">
				<input type="text" id="callback" name="callback" size="60"
					value="<%=returnURL%>" /><br /> 
				<input type="checkbox" name="api" checked="checked" value="INVOICING" /><b>INVOICING</b><br />
				<input type="checkbox" name="api"
					disabled="disabled" value="EXPRESS_CHECKOUT" />EXPRESS_CHECKOUT<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="DIRECT_PAYMENT" />DIRECT_PAYMENT<br /> <input
					type="checkbox" name="api" disabled="disabled" value="AUTH_CAPTURE" />AUTH_CAPTURE<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="AIR_TRAVEL" />AIR_TRAVEL<br /> <input type="checkbox"
					name="api" disabled="disabled" value="TRANSACTION_SEARCH" />TRANSACTION_SEARCH<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="RECURRING_PAYMENTS" />RECURRING_PAYMENTS<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="ACCOUNT_BALANCE" />ACCOUNT_BALANCE<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="ENCRYPTED_WEBSITE_PAYMENTS" />ENCRYPTED_WEBSITE_PAYMENTS<br />
				<input type="checkbox" name="api" disabled="disabled" value="REFUND" />
				REFUND<br /> <input type="checkbox" name="api" disabled="disabled"
					value="BILLING_AGREEMENT" />BILLING_AGREEMENT<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="REFERENCE_TRANSACTION" />REFERENCE_TRANSACTION<br /> <input
					type="checkbox" name="api" disabled="disabled" value="MASS_PAY" />MASS_PAY<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="TRANSACTION_DETAILS" />TRANSACTION_DETAILS<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="NON_REFERENCED_CREDIT" />NON_REFERENCED_CREDIT<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="SETTLEMENT_CONSOLIDATION" />SETTLEMENT_CONSOLIDATION<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="SETTLEMENT_REPORTING" />SETTLEMENT_REPORTING<br /> <input
					type="checkbox" name="api" disabled="disabled" value="BUTTON_MANAGER" />BUTTON_MANAGER<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="MANAGE_PENDING_TRANSACTION_STATUS" />MANAGE_PENDING_TRANSACTION_STATUS<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="RECURRING_PAYMENT_REPORT" />RECURRING_PAYMENT_REPORT<br /> <input
					type="checkbox" name="api" disabled="disabled"
					value="EXTENDED_PRO_PROCESSING_REPORT" />EXTENDED_PRO_PROCESSING_REPORT<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="EXCEPTION_PROCESSING_REPORT" />EXCEPTION_PROCESSING_REPORT<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="ACCOUNT_MANAGEMENT_PERMISSION" />ACCOUNT_MANAGEMENT_PERMISSION<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="ACCESS_BASIC_PERSONAL_DATA" />ACCESS_BASIC_PERSONAL_DATA<br />
				<input type="checkbox" name="api" disabled="disabled"
					value="ACCESS_ADVANCED_PERSONAL_DATA" />ACCESS_ADVANCED_PERSONAL_DATA<br />
			</div>

			<input type="submit" class="submit" name="PermissionBtn" value="RequestPermissions" />
			<br /> <a href="index.jsp">Home</a>
		</div>
	</form>
</body>
</html>