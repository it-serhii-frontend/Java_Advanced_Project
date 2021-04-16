<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Create periodical</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
	<div class="container">

		<div class="w3-sidebar w3-light-grey w3-bar-block" style="width: 25%">
			<h3 class="w3-bar-item">Menu</h3>
			<a href="/home" class="w3-bar-item w3-button">Home</a> <a
				href="/create-periodical" class="w3-bar-item w3-button">Create
				periodical</a> <a href="#" class="w3-bar-item w3-button">Bucket</a>
		</div>

		<div style="margin-left: 25%">

			<div class="w3-container w3-teal">
				<h1>Create new Periodical</h1>
			</div>

			<div class="w3-container">

				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<form id="logoutForm" method="POST" action="${contextPath}/logout">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
					<h2>
						Welcome ${pageContext.request.userPrincipal.name} <a
							onclick="document.forms['logoutForm'].submit()">Logout</a>
							
					</h2>

				</c:if>



				<form:form method="POST" action="${contextPath}/addPeriodical"
					modelAttribute="periodical">
					<table>
						<tr>
							<td><form:label path="name">Name</form:label></td>
							<td><form:input path="name" /></td>
						</tr>
						<tr>
							<td><form:label path="description">Description</form:label></td>
							<td><form:input path="description" /></td>
						</tr>
						<tr>
							<td><form:label path="price">Price</form:label></td>
							<td><form:input path="price" /></td>
						</tr>
					</table>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />

				</form:form>

			</div>

		</div>


	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>


</body>
</html>