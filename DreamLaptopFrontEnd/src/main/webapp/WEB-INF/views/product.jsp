<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1" isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Basic Table</h2>
  <a href="addproduct">Add New Product</a>
  <form method="post" action="<c:url value='/PCat'/>" class="form-signing">
<div class="row">
<div id="headin2"><strong> <h3 align="center">Product List </h3></strong></div>
<div align="center">
<table width=\"100%\" border=\"0\" id=\"tab\">
		<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product price</th>
		<th>Product description</th>
		<th>Product stock</th>
		<th>Edit</th>
		<th>Delete</th>
		</tr>
<c:forEach items="${plist}" var="pr" >
	<tr>
		<td>${pr.id }</td>
		<td>${pr.name }</td>
		<td>${pr.price }</td>
		<td>${pr.description }</td>
		<td>${pr.stock }</td>
		<td bgcolor="white"><a href="edit/${pr.cid}" >Edit</a></td>
		<td bgcolor="white"><a href="del/${pr.cid}" >Delete</a></td>
	</tr>
</c:forEach>

</table>
</div>
</div>
</form>
</div>
</body>
</html>