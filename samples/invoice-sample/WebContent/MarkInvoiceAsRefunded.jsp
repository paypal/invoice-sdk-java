<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date,java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>PayPal Invoicing SDK - MarkInvoiceAsRefunded</title>
	<link rel="stylesheet" type="text/css" href="sdk.css"/> 
	<script type="text/javascript" src="sdk.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>MarkInvoiceAsRefunded</h3>
			<div id="apidetails">The MarkInvoiceAsRefunded API operation is used to
				mark an invoice as refunded.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">
						InvoiceID* (Get Invoice ID via <a href='CreateInvoice'>CreateInvoice</a>
						or <a href='CreateInvoice'>CreateAndSendInvoice</a>)
					</div>
					<div class="param_value">
						<input type="text" name="invoiceId" value="" size="50"
							maxlength="260" />
					</div>
				</div>
				<div class="section_header">Refund Details*</div>
				<div class="params">
					<div class="param_name">Note</div>
					<div class="param_value">
						<input type="text" name="note" value="" size="50" maxlength="260" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Date when the invoice as refunded</div>
					<div class="param_value">
						<input type="text" name="date" size="50" maxlength="260" value='<%= dateFormat.format(new java.util.Date()) %>'/>
					</div>
				</div>
				<jsp:include page="permissions.jsp">
					<jsp:param name="source" value="MarkInvoiceAsRefunded"/>
				</jsp:include>				
				<div class="submit">
					<input type="submit" name="MarkInvoiceBtn"
						value="MarkInvoiceAsRefunded" /> <br />
				</div>
				<a href="index.jsp">Home</a>
			</div>
		</form>
	</div>
</body>
</html>