<%-- 
    Copyright Lexa Grasz and Jack Landry 2015

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>
<body>
  
    <div class="thx">
  
  <p>Thank you for your patronage of the Belk Library. You&#39;ve successfully 
    checked out the book, ${user.book}. Please note that this book is due 
    back on ${user.formattedDate}.  A friendly email reminder will be sent to 
    you if the book becomes overdue.
  </p>
  
  
  <a href="index.jsp">Return to front page </a>
  
    </div>
<%@ include file="/includes/footer.jsp" %>
