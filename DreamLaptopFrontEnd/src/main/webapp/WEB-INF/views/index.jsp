<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">

      <img class="img-responsive" src="resources/images/logo.jpg" style="width:174px;height:47px">
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li><a class="active" href="#home">Home</a></li>
       <li><a href="login">Admin</a></li> 
     <li><a href="#"><span class="glyphicon glyphicon-user"></span>Contact Us</a></li>
        <li><a href="register">Register</a></li> 
      <li><a href="login">login</a></li> 
       
      <!--<li><a href="${pageContext.request.contextPath}/register">Register</a></li>-->
    </ul>
  </div>
 </nav>
 
 <div class="container">
 <h2> Carousel </h2>
   <div id="myCarousel" class="carousel slide" data-ride="carousel">
   <ol class="carousel-indicators">
<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
<li data-target="#myCarousel" data-slide-to="1" class="active"></li>
<li data-target="#myCarousel" data-slide-to="2" class="active"></li>
<li data-target="#myCarousel" data-slide-to="3" class="active"></li>
<li data-target="#myCarousel" data-slide-to="4" class="active"></li>
</ol>

<div class="carousel-inner">
<div class="item active">
<img src="resources/images/carousepic1.jpg" style="width:1144px;height:235px">

</div>
<div class="item">
<img src="resources/images/carousepic2.jpg" style="width:1144px;height:235px">

</div>
<div class="item ">
<img src="resources/images/carousepic3.jpg" style="width:1144px;height:235px">

</div>
<div class="item">
<img src="resources/images/carousepic4.jpg" style="width:1144px;height:235px">

</div>
<div class="item">
<img src="resources/images/image5.jpg" style="width:1144px;height:235px">

</div>
</div>
 <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<div class="container">
  <h2>Thumbnail</h2>
  <p>The thumbnail class creates a thumbnail of the image:</p>            
  <img src="resources/images/image3.jpg" class="img-thumbnail" alt="Cinque Terre" style="width:375px;height:236px"> 
  <img src="resources/images/image2.jpg" class="img-thumbnail" alt="Cinque Terre" style="width:375px;height:236px"> 
  <img src="resources/images/image4.jpg" class="img-thumbnail" alt="Cinque Terre" style="width:375px;height:236px"> 
</div>
 <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
<style>
.social:hover {
     -webkit-transform: scale(1.1);
     -moz-transform: scale(1.1);
     -o-transform: scale(1.1);
 } 
 .social {
     -webkit-transform: scale(0.8);
     
     -moz-transform: scale(0.8);
     -o-transform: scale(0.8);
     -webkit-transition-duration: 0.5s;
     -moz-transition-duration: 0.5s;
     -o-transition-duration: 0.5s;
 }

 
 #social-fb:hover {
     color: #3B5998;
 }
 #social-tw:hover {
     color: #4099FF;
 }
 #social-gp:hover {
     color: #d34836;
 }
 #social-em:hover {
     color: #f39c12;
 }
</style>
  <br />

          
   <nav class="navbar navbar-inverse navbar-bottom">
  <div class="container-fluid">
    <div class="navbar-header">
       </div>
    <ul class="nav navbar-nav navbar-right">
    
                <li><a href="https://www.facebook.com/bootsnipp"><i id="social-fb" class="fa fa-facebook-square fa-2x social"></i></a>
	            <li><a href="https://twitter.com/bootsnipp"><i id="social-tw" class="fa fa-twitter-square fa-2x social"></i></a>
	            <li><a href="https://plus.google.com/+Bootsnipp-page"><i id="social-gp" class="fa fa-google-plus-square fa-2x social"></i></a>
	            <li><a href="mailto:bootsnipp@gmail.com"><i id="social-em" class="fa fa-envelope-square fa-2x social"></i></a>
</ul>
</div>

</body>
</html>