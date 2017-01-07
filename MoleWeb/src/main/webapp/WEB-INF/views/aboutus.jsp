<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- JSTL tag library  --%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About Us</title>
<c:url value="resources/css/bootstrap.css" var="bootstrap"></c:url>
<c:url value="resources/css/molecule-styles.css" var="moleculestyles"></c:url>

<%-- bootstrap css CDN --%>
<link rel="stylesheet" href="${ bootstrap }">
<link rel="stylesheet" href="${ moleculestyles }">
</head>
<body>
<div class="container">
		<nav class = "navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mole-navbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Molecule</a>
				</div>
				<div class="collapse navbar-collapse" id = "mole-navbar">
					<ul class="nav navbar-nav">
						<li><a href="search">Search</a></li>
						<li><a href="tutorial">Tutorial</a></li>
						<li><a href="forum">Forum</a></li>
						<li><a href="aboutus">About Us</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="signup"><span class="glyphicon glyphicon-user"></span>Sign Up</a>
						<li><a href="signin"><span class="glyphicon glyphicon-log-in"></span>Sign In </a>
					</ul>
				</div>
			</div>
		</nav>
		</div>
		<%--jQuery CDN --%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <%-- bootstrap js CDN --%>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
</body>
</html>