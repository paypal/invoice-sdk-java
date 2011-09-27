<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invoicing</title>
</head>
<body>
	<h2>MarkInvoiceAsPaid API Test Page</h2>
	<form method="POST">
		<div class="params">
			<div class="param_name">InvoiceID</div>
			<div class="param_value">
				<input type="text" name="invoiceId" value="" size="50"
					maxlength="260" />
			</div>

			<input type="checkbox" name="authentication" />Using Permission
			Credentials<br />

			<div class="param_name">Access Token</div>
			<div class="param_value">
				<input type="text" name="accessToken"
					<%if (request.getParameter("accessToken") == null) {%> value=""
					<%} else {%> value="<%=request.getParameter("accessToken")%>" <%}%>
					size="50" maxlength="260" />
			</div>
			<div class="param_name">Token Secret</div>
			<div class="param_value">
				<input type="text" name="accessToken"
					<%if (request.getParameter("tokenSecret") == null) {%> value=""
					<%} else {%> value="<%=request.getParameter("tokenSecret")%>" <%}%>
					size="50" maxlength="260" />
			</div>
		</div>
		<input type="submit" name="MarkInvoiceBtn" value="MarkInvoiceAsPaid" />
		<br /> <a href="index.html">Home</a>
	</form>
</body>
</html>