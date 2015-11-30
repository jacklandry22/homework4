<%-- 
    Document   : checkout
    Created on : Nov 29, 2015, 8:53:27 PM
    Author     : lexagrasz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>
<body>
  
  
  
   <form class="form" action="calculate" method="post">
     
     <h2>Checkout a book</h2>
      <input type="hidden" name="action" value="add">        
      <label>First Name:</label>
      <input type="text" name="first" required><br>
      <label>Last Name:</label>
      <input  type="text" name="last"  required><br>
      <label>Email Address:</label>
      <input  type="email"  name="email" required ><br>
      <label>Book Title:</label>
      <input  type="text"  name="title" required><br>
      <label class="spacer">&nbsp;</label>
      <input type="submit" value="Checkout" class="button">
    </form>

<%@ include file="/includes/footer.jsp" %>