<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PayPal SDK - GetInvoiceDetails</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>GetInvoiceDetails</h3>
			<div id="apidetails">GetInvoiceDetails API operation is used to
				get detailed information about an invoice.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">
						InvoiceID*(Get Invoice ID via <a href='CreateInvoice'>CreateInvoice</a>
						or <a href='CreateInvoice'>CreateAndSendInvoice</a>)
					</div>
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
							<%} else {%> value="<%=request.getParameter("accessToken")%>"
							<%}%> size="50" maxlength="260" />
					</div>
					<div class="param_name">Token Secret</div>
					<div class="param_value">
						<input type="text" name="accessToken"
							<%if (request.getParameter("tokenSecret") == null) {%> value=""
							<%} else {%> value="<%=request.getParameter("tokenSecret")%>"
							<%}%> size="50" maxlength="260" />
					</div>
				</div>
				<div class="submit">
					<input type="submit" name="GetInvoiceDetailsBtn"
						value="GetInvoiceDetails" /> <br />
				</div>
				<a href="index.html">Home</a>
			</div>
		</form>
		<div id="relatedcalls">
			See also
			<ul>
				<li><a href='CreateInvoice'>CreateInvoice</a>
				</li>
				<li><a href='CreateInvoice'>CreateAndSendInvoice</a>
				</li>
				<li><a href='SendInvoice'>SendInvoice</a>
				</li>
				<li><a href='CancelInvoice'>CancelInvoice</a>
				</li>
				<li><a href='UpdateInvoice'>UpdateInvoice</a>
				</li>
				<li><a href='MarkInvoiceAsPaid'>MarkInvoiceAsPaid</a>
				</li>
				<li><a href='GetInvoiceDetails'>GetInvoiceDetails</a>
				</li>
				<li><a href='SearchInvoices'>SearchInvoices</a>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>