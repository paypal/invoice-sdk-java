<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invoicing</title>
</head>
<body>
	<h2>UpdateInvoice API Test Page</h2>
	<form method="POST">
		<div class="params">
			<div class="param_name">Merchant Email</div>
			<div class="param_value">
				<input type="text" name="merchantEmail"
					value="jb-us-seller@paypal.com" size="50" maxlength="260" />
			</div>
			<div class="param_name">Payer Email</div>
			<div class="param_value">
				<input type="text" name="payerEmail" value="sender@yahoo.com"
					size="50" maxlength="260" />
			</div>
			<div class="param_name">Item Name1</div>
			<div class="param_value">
				<input type="text" name="item_name1" value="item1" size="30"
					maxlength="30" />
			</div>
			<div class="param_name">Item Quantity1</div>
			<div class="param_value">
				<input type="text" name="item_quantity1" value="1" size="3"
					maxlength="5" />
			</div>
			<div class="param_name">Item UnitPrice1</div>
			<div class="param_value">
				<input type="text" name="item_unitPrice1" value="1.00" size="10"
					maxlength="19" />
			</div>
			<div class="param_name">Item Name2</div>
			<div class="param_value">
				<input type="text" name="item_name2" value="item2" size="30"
					maxlength="30" />
			</div>
			<div class="param_name">Item Quantity2</div>
			<div class="param_value">
				<input type="text" name="item_quantity2" value="2" size="3"
					maxlength="5" />
			</div>
			<div class="param_name">Item UnitPrice2</div>
			<div class="param_value">
				<input type="text" name="item_unitPrice2" value="2.00" size="10"
					maxlength="19" />
			</div>
			<div class="param_name">Currency Code</div>
			<div class="param_value">
				<input type="text" name="currencyCode" value="USD" size="50"
					maxlength="260" />
			</div>
			<div class="param_name">Payment Terms</div>
			<div class="param_value">
				<input type="text" name="paymentTerms" value="DUEONRECEIPT"
					size="50" maxlength="260" />
			</div>

			<div class="param_name">Invoice ID</div>
			<div class="param_value">
				<input type="text" name="invoiceId" value="INV2-8QPU-J739-KZHX-66TS"
					size="50" maxlength="260" />
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
		<br /> <a href="index.html">Home</a> <input type="submit"
			name="UpdateBtn" value="UpdateInvoice" />
	</form>
</body>
</html>