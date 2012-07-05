<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.Date,java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>PayPal Invoicing SDK - MarkInvoiceAsPaid</title>
	<link rel="stylesheet" type="text/css" href="sdk.css"/> 
	<script type="text/javascript" src="sdk.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>MarkInvoiceAsPaid</h3>
			<div id="apidetails">The MarkInvoiceAsPaid API operation is used to
				mark an invoice as paid.</div>
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
				<div class="section_header">Other Payment Details*</div>
				<div class="params">
					<div class="param_name">Payment Method used for offline
						payment</div>
					<div class="param_value">
						<select name="paymentMethod">
							<option value="BankTransfer">BankTransfer</option>
							<option value="Cash">Cash</option>
							<option value="Check">Check</option>
							<option value="CreditCard">CreditCard</option>
							<option value="DebitCard">DebitCard</option>
							<option value="PayPal">PayPal</option>
							<option value="WireTransfer">WireTransfer</option>
							<option value="Other">Other</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">Note</div>
					<div class="param_value">
						<input type="text" name="note" value="" size="50" maxlength="260" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Date when the invoice as paid</div>
					<div class="param_value">
						<input type="text" name="date" size="50" maxlength="260"  value='<%= dateFormat.format(new java.util.Date()) %>' />
					</div>
				</div>
				<jsp:include page="permissions.jsp">
					<jsp:param name="source" value="MarkInvoiceAsPaid"/>
				</jsp:include>				
				<div class="submit">
					<input type="submit" name="MarkInvoiceBtn"
						value="MarkInvoiceAsPaid" /> <br />
				</div>
				<a href="index.jsp">Home</a>
			</div>
		</form>
	</div>
</body>
</html>