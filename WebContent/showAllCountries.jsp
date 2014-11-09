<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.util.*,
				com.worldmanager.models.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Welcome to the World Manager</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<table style="width:100%;">
		<tr>
			<td style="width:25%;height:80%;" valign="top">
			  	<jsp:include page="navbar.jsp" />
			</td>
			<td style="width:75%;height:80%;">
				<table style="width:100%" border="1">
					<% 
						ArrayList<Country> allCountries = (ArrayList<Country>)session.getAttribute("AllCountries");
						StringBuilder sb = new StringBuilder("");
						sb.append("<tr><td>Name</td<td><td>Code</td><td>Region</td><td>Continent</td>");
						for (Country c : allCountries) {
							sb.append("<tr>");
							sb.append("<td>" + c.getName() + "</td>");
							sb.append("<td>" + c.getCode() + "</td>");
							sb.append("<td>" + c.getRegion() + "</td>");
							sb.append("<td>" + c.getContinent() + "</td>");
							sb.append("</tr>");
						}
						out.println(sb);
					%>
				</table>
			</td>
		</tr>
	</table>
	<jsp:include page="footer.jsp" />
</body>
</html>