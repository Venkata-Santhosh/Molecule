<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- JSTL tag library  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<c:url value="resources/css/bootstrap.css" var="bootstrap"></c:url>
<c:url value="resources/css/molecule-styles.css" var="moleculestyles"></c:url>
<c:url value="resources/js/registerOperations.js" var="register.js"></c:url>

<%-- bootstrap css CDN --%>
<link rel="stylesheet" href="${ bootstrap }">
<link rel="stylesheet" href="${ moleculestyles }">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

</head>
<body>
	<div class="container">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#mole-navbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Molecule</a>
				</div>
				<div class="collapse navbar-collapse" id="mole-navbar">
					<ul class="nav navbar-nav">
						<li><a href="search">Search</a></li>
						<li><a href="tutorial">Tutorial</a></li>
						<li><a href="forum">Forum</a></li>
						<li><a href="aboutus">About Us</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="signup"><span
								class="fa fa-user fa"></span>Sign Up</a>
						<li><a href="signin"><span
								class="fa fa-sign-in"></span>Sign In </a>
					</ul>
				</div>
			</div>
		</nav>

		<div class="register-panel">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title"> Register </h3>
				</div>
				<div class ="panel-body">
					<div class="reponse-messages"></div>
					<form class="form-horizontal" id = "registerForm" name="userDetails">
						
						<div class="form-group">
							<label for="userName" class="cols-sm-2 control-label">User Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="userName" id="userName"  placeholder="Enter your User Name"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  placeholder="Enter your email address"/>
								</div>
							</div>
						</div>
						<div class="form-group ">
							<button  class="btn btn-primary  btn-block ">Register</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<%--jQuery CDN --%>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<%-- bootstrap js CDN --%>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src = "resources/plugins/validation/jquery.validate.min.js"></script>
	<script type="text/javascript" src = "resources/plugins/validation/additional-methods.min.js"></script>
	<script type="text/javascript" src = "resources/plugins/loading/jquery.isloading.min.js"></script>
	
	<script type="text/javascript" src="resources/js/registerOperations.js"></script>
</body>
</html>