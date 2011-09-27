<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="GenerateAccessToken">
		<%
			String query = request.getQueryString();
			Map map = new HashMap();
			try {
				StringTokenizer stTok = new StringTokenizer(query, "&");
				while (stTok.hasMoreTokens()) {
					StringTokenizer stInternalTokenizer = new StringTokenizer(
							stTok.nextToken(), "=");
					if (stInternalTokenizer.countTokens() == 2) {
						map.put(stInternalTokenizer.nextToken(),
								stInternalTokenizer.nextToken());
					}
				}
			} catch (Exception e) {
				//left on purpose
			}%>
			<table>
			<tr>
				<td><font color="grey"><h3>Step 1:</h3></font>
				</td>
				<td><font color="grey"><h3>Requesting Permissions</h3></font></td>
				<td><img src="images/camera_test.png"></img></td>

			</tr>

			<tr>
				<td><h3>Step 2:</h3></td>
				<td><h3>Generate Access Token</h3></td>
			</tr>
		</table><%
			if (map != null) {
				Iterator iterator = map.entrySet().iterator();

				while (iterator.hasNext()) {
					Map.Entry elem = (Map.Entry) iterator.next();
		%><table>
			<tr>
				<td><%=elem.getKey()%>:</td>
				<td align="left"><input type="text" name="txtbox"
					value=<%=elem.getValue()%>></td>
			</tr>
		</table>
		<%
			}
			}
		%>

		<input type="submit" name="GenerateBtn" value="GenerateAccessToken">
		<br />
		<a href="index.html">Home</a>
	</form>
</body>
</html>