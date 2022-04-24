<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.stackroute.model.Team" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shopping Cart</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<!-- FontAwesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.1/css/all.css"
	integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp"
	crossorigin="anonymous">
</head>
<body>
	<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send 
		 button. Handle errors like empty fields -->
	<div class="container pt-2">
		<h3 class="display-3 text-center">Shopping Cart</h3>
	</div>

	<!-- Create a form which will have text boxes for News ID, title, author,description, content
		 along with a Send button. Handle errors like empty fields -->
	<div class="container py-3">
	<form action="addTeam" method="post",modelAttribute="team">
		  <div class="form-group">
		    <label for="exampleInputProductId">Product Id</label>
		    <input type="text" class="form-control" name="productId" id="exampleInputProductId">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputProductName">Product Name</label>
		    <input type="text" class="form-control" name="productName" id="exampleInputProductName">
		  </div> 
			<div class="form-group">
				<label for="exampleInputNewsDescription">Product Cost</label> <input
					type="text" class="form-control" name="productCost"
					id="exampleInputNoteStatus">
			</div>
			<button type="submit" class="btn btn-primary">Save</button>
		</form>
		<table>
		<tr>
		<td>Product Id</td>
		<td>Product Name</td>
		<td>Product Cost</td>
		</tr>
		<c:forEach items="${teams}" var="team">
		<tr>
		<td>${team.productId}</td>
		<td>${team.productName}</td>
		<td>${team.productCost}</td>
		<td><a href="editTeam?id=${team.productId}">Edit</a></td>
		<td><a href="deleteTeam?id=${team.productId}">Delete</a></td>
		</tr>
		</c:forEach>
		</table>
	</div>
	</body>
	</html>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	