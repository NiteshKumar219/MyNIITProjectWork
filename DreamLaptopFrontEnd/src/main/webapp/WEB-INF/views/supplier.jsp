<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<a href="addsupplier">Add New Supplier</a>
<form method="post" action="<c:url value='/saveCat'/>" class="form-signing">
<div class="row">
<div id="headin2"><strong> <h3 align="center">Category List </h3></strong></div>
<div align="center">
<table width=\"100%\" border=\"0\" id=\"tab\">
		<tr>
		<th>Supplier Id</th>
		<th>Supplier Name</th>
		<th>Edit</th>
		<th>Delete</th>
		</tr>
<c:forEach items="${slist}" var="su" >
	<tr>
		<td>${su.sid }</td>
		<td>${su.sname }</td>
		<td bgcolor="white"><a href="edit/${su.sid}" >Edit</a></td>
		<td bgcolor="white"><a href="del/${su.sid}" >Delete</a></td>
	</tr>
</c:forEach>

</table>
</div>
</div>
</form>
</div>
</body>
</html> Id</th>
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
</html> Id</th>
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