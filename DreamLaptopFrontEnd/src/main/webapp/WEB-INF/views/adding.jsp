<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<title>Insert title here</title>
</head>
<body>

<div class="container">
<div class="row">
<div class="col-md-6">
  <div class= "panel with-nav-tabs panel-primary">
  <div class="panel-heading">
  <ul class="nav tab-tabs">
  <li class="action"><a href="#tablprimary" data-toggle="tab">Category</a></li>
  <li><a href="#tablprimary" data-toggle="tab">Supplier</a></li>
  <li><a href="#tablprimary" data-toggle="tab">product</a></li>
  </ul>
  </div>
  
  </div>
  <div class="panel-body">
  <div class="tab-content">
  
  <div class="tab-pane fade in active" id="tablprimary">
  <form method="post" action="<c:url value="/saveCat"/>" class="form-signing">
  <h4 class="input_title">Category Id</h4>
  <input class="form_control" type="nmber" name="cid" requird>
  <h4 class="input_title">Category Name</h4>
  <input class="form_control" type="text" name="name" requird>
  <br>
     <button type="submit" class="btn btn-primary btn-md">Submit</button>
                  <button type="reset" class="btn btn-primary btn-md">Cancel</button>
          </form>
  </div>
  </div>
  </div>
</html>