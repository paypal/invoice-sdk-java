<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PayPal SDK - SearchInvoices</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>SearchInvoices</h3>
			<div id="apidetails">SearchInvoice API operation is used to
				search an invoice.</div>
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
						<input type="text" name="pageSize" value="1" size="50"
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
						searched(More than one options can be selected)</div>
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
					<input type="submit" name="searchBtn" value="SearchInvoice" /> <br />
				</div>
				<a href="index.html">Home</a>
			</div>
		</form>
		<div id="relatedcalls">
			See also
			<ul>
				<li><a href='CreateInvoice'>CreateInvoice</a></li>
				<li><a href='CreateInvoice'>CreateAndSendInvoice</a></li>
				<li><a href='SendInvoice'>SendInvoice</a></li>
				<li><a href='CancelInvoice'>CancelInvoice</a></li>
				<li><a href='UpdateInvoice'>UpdateInvoice</a></li>
				<li><a href='MarkInvoiceAsPaid'>MarkInvoiceAsPaid</a></li>
				<li><a href='GetInvoiceDetails'>GetInvoiceDetails</a></li>
				<li><a href='SearchInvoices'>SearchInvoices</a></li>
			</ul>
		</div>
	</div>
</body>
</html>