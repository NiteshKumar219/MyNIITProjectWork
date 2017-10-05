<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
</head>
<body>
<div class="container">
<a href="addcategory">Add New Category</a>
<form method="post" action="<c:url value='/saveCat'/>" class="form-signing">
<div class="row">
<div id="headin2"><strong> <h3 align="center">Category List </h3></strong></div>
<div align="center">
<table width=\"100%\" border=\"0\" id=\"tab\">
		<tr>
		<th>Category Id</th>
		<th>Category Name</th>
		<th>Edit</th>
		<th>Delete</th>
		</tr>
<c:forEach items="${clist}" var="ca" >
	<tr>
		<td>${ca.cid }</td>
		<td>${ca.name }</td>
		<td bgcolor="white"><a href="edit/${ca.cid}" >Edit</a></td>
		<td bgcolor="white"><a href="del/${ca.cid}" >Delete</a></td>
	</tr>
</c:forEach>

</table>
</div>
</div>
</form>
</div>
</body>
</html>