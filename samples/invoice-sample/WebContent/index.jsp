<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.paypal.core.Constants"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Invoice API Sample App</title>
<meta name="generator" content="TextMate http://macromates.com/">
<meta name="author" content="palavilli">
<!-- Date: 2011-06-17 -->
</head>
<body>
	<center>
		<h4>Invoice API Sample App</h4>
		<h5>SDK v<%=Constants.SDK_VERSION%></h5>
	</center>
	<p><a href="CreateInvoice">CreateInvoice</a></p>
	<p><a href="SendInvoice">SendInvoice</a></p>
	<p><a href="CreateInvoice">CreateAndSendInvoice</a></p>
	<p><a href="UpdateInvoice">UpdateInvoice</a></p>
	<p><a href="GetInvoiceDetails">GetInvoiceDetails</a></p>
	<p><a href="CancelInvoice">CancelInvoice</a></p>
	<p><a href="SearchInvoices">SearchInvoices</a></p>
	<p><a href="MarkInvoiceAsPaid">MarkInvoiceAsPaid</a></p>
	<p><a href="MarkInvoiceAsUnpaid">MarkInvoiceAsUnpaid</a></p>
	<p><a href="MarkInvoiceAsRefunded">MarkInvoiceAsRefunded</a></p>	
</body>
</html>
