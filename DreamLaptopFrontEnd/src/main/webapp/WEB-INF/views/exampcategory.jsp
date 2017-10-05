<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
  
  angular.module('showProduct',[]).controller('CategoryController', function($scope)
   {
          $scope.Category=${clist}
   
          $scope.sort = function(keyname)
          {
              $scope.sortKey = keyname;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script> 
</head>
<body>
<div class="container">
<a href="addcategory">Add New Category</a>
<div class="span12" style="text-align: justify; font-size: large; color:silver;">
 <div ng-app="showProduct" ng-controller="CategoryController">
 <br/><br/>
 <div class="row">
Search:<input type=text placeholder="Search" ng-model="searchText"/>
</div>
<div id="headin2"><strong> <h3 align="center">Category List </h3></strong></div>
<div align="center">
<table width=\"100%\" border=\"0\" id=\"tab\">
<tr>
				<th bgcolor="white" id=\"td1\">CATEGORY ID</th>
				<th bgcolor="white" id=\"td2\">CATEGORY NAME</th>
                <th id=\"td4\" bgcolor="white">EDIT</th>
               <th bgcolor="white" id=\"td5\">DELETE</th>
 </tr>
 <tr class="success" ng-repeat="cat in ${clist}|filter:searchText">
 <td bgcolor="white">{{cat.cid}}</td>
 <td bgcolor="white">{{cat.name}}</td>
 <td bgcolor="white"><a href="EditCategory?id={{cid=cat.cid}}" name="edit" value="Edit">Edit</a></td>
<td bgcolor="white"><a href="delCategory?id={{cid=cat.cid}}" value="Delete" name="delete" >Delete</a>
</td>
</tr>
</table>
</div>
</div>
</div>
</div>
     </body>
</html> -->