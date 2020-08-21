<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="/submit-details" method="post" />
		<p>Enter Your Name</p>
		<input type="text"    name="name" />
		<p>Enter Your Year Of Birth</p>               
    	<input type="number"   name="year" />         
    	<input type="submit" value="submit"/>        
        </form>
    </div>
</body>
</html>