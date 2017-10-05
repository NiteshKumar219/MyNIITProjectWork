<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="col-lg-12">
<div class="row">
<h2>Form</h2> 
<br>
<form:form commandName="customer" action="signup" method="post">
   <div class="col-md-8">
   <div class="form-group"> 
   <label>EMAIL:</label>
   <br>
   <form:input path="email" placeholder="Enter value.." class="form-control" /></div>     
   <div class="form-group">
   <label>PASSWORD:</label>
   <br>
   <form:password path="password" placeholder="Enter value.." class="form-control"/></div>   
   <div class="form-group">
   <label>NAME:</label>
   <br>
   <form:input path="name" placeholder="Enter value.." class="form-control"/></div>
   
   <div class="form-group">
   <label>ADDRESS:</label>
   <br>
   <form:input path="address" placeholder="Enter value.." class="form-control"/></div>
   
   <div class="form-group">
   <label>PHNO:</label>
   <br>
   <form:input path="phno" placeholder="Enter value.." class="form-control"/></div>
   
   <br>
   <br>
   <button type="submit" class="btn btn-primary btn-md">Submit</button>
    
    
</form:form>
</div> 
</div>
</div>
</body>
</html>