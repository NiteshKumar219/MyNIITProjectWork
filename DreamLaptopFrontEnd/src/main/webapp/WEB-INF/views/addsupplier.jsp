<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
  </div>
  
  </div>
  <div class="panel-body">
  <div class="tab-content">
  
  <div class="tab-pane fade in active" id="tablprimary">
  <form method="post" action="<c:url value='/SCat'/>" class="form-signing">
  <h4 class="input_title">Supplier Id</h4>
  <input class="form_control" type="nmber" name="cid" value="${supplier.sid}" required>
  <h4 class="input_title">Supplier Name</h4>
  <input class="form_control" type="text" name="name" value="${supplier.sname}" required>
  <br>
     <button type="submit" class="btn btn-primary btn-md">Submit</button>
     <button type="reset" class="btn btn-primary btn-md">Cancel</button>
  
  </form>
  </div>
  </div>
  </div>
  </div>
  </body>
</html>