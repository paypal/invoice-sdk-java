<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>PayPal Invoicing SDK - SearchInvoices</title>
	<link rel="stylesheet" type="text/css" href="sdk.css"/> 
	<script type="text/javascript" src="sdk.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>SearchInvoices</h3>
			<div id="apidetails">The SearchInvoice API operation is used to search for invoices that 
			match given search criteria.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">Merchant Email</div>
					<div class="param_value">
						<input type="text" name="merchantEmail"
							value="jb-us-seller@paypal.com" size="50" maxlength="260" />
					</div>
					<div class="param_name">Page</div>
					<div class="param_value">
						<input type="text" name="page" value="1" size="50" maxlength="260" />
					</div>
					<div class="param_name">PageSize</div>
					<div class="param_value">
						<input type="text" name="pageSize" value="10" size="50"
							maxlength="260" />
					</div>
					<div class="section_header">Search Parameters</div>
					<div class="param_name">Email</div>
					<div class="param_value">
						<input type="text" name="email" value="" size="50" maxlength="260" />
					</div>
					<div class="param_name">Business Name</div>
					<div class="param_value">
						<input type="text" name="businessName" value="" size="50"
							maxlength="260" />
					</div>
					<div class="param_name">Recipient Name</div>
					<div class="param_value">
						<input type="text" name="recipientName" value="" size="50"
							maxlength="260" />
					</div>
					<div class="param_name">Invoice Number</div>
					<div class="param_value">
						<input type="text" name="invoiceNum" value="" size="50"
							maxlength="260" />
					</div>
					<div class="param_name">Memo</div>
					<div class="param_value">
						<input type="text" name="memo" value="" size="50" maxlength="260" />
					</div>
					<div class="param_name">OriginType</div>
					<div class="param_value">
						<select name="originType">
							<option value=""></option>
							<option value="Web">Web</option>
							<option value="API">API</option>
						</select>
					</div>
					<div class="param_name">Currency Code</div>
					<div class="param_value">
						<input type="text" name="currencyCode" value="" size="50"
							maxlength="260" />
					</div>
					<table>
						<tr>
							<th class="param_name">Lower Invoice Amount to be searched</th>
							<th class="param_name">Upper Invoice Amount to be searched</th>
						</tr>
						<tr>
							<td class="param_value"><input type="text"
								name="lowerAmount" value="" maxlength="260" /></td>
							<td class="param_value"><input type="text"
								name="upperAmount" value="" maxlength="260" /></td>
						</tr>
					</table>
					<div class="param_name">Status of the invoices to be
						searched (Multiple options can be selected)</div>
					<div class="param_value">
						<select name="status" multiple="multiple">
							<option value="Draft">Draft</option>
							<option value="Sent">Sent</option>
							<option value="Paid">Paid</option>
							<option value="MarkedAsPaid">MarkedAsPaid</option>
							<option value="Canceled">Canceled</option>
						</select>
					</div>
					<div class="param_name">Invoice Date(YYYY-MM-DD)</div>
					<div class="param_value">
						From <input type="text" name="invoiceStartDate" value="" size="50"
							maxlength="260" /> To <input type="text" name="invoiceEndDate"
							value="" size="50" maxlength="260" />
					</div>
					<div class="param_name">Invoice Creation Date(YYYY-MM-DD)</div>
					<div class="param_value">
						From <input type="text" name="startDate" value="" size="50"
							maxlength="260" /> To <input type="text" name="endDate" value=""
							size="50" maxlength="260" />
					</div>
					<div class="param_name">Invoice Due Date(YYYY-MM-DD)</div>
					<div class="param_value">
						From <input type="text" name="dueStartDate" value="" size="50"
							maxlength="260" /> To <input type="text" name="dueEndDate"
							value="" size="50" maxlength="260" />
					</div>
					<div class="param_name">Payment Date(YYYY-MM-DD)</div>
					<div class="param_value">
						From <input type="text" name="paymentStartDate" value="" size="50"
							maxlength="260" /> To <input type="text" name="paymentEndDate"
							value="" size="50" maxlength="260" />
					</div>


					<jsp:include page="permissions.jsp">
						<jsp:param name="source" value="SearchInvoices"/>
					</jsp:include>
				</div>
				<div class="submit">
					<input type="submit" name="searchBtn" value="SearchInvoice" /> <br />
				</div>
				<a href="index.jsp">Home</a>
			</div>
		</form>
	</div>
</body>
</html>