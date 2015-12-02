 
<%-- Copyright Jack Landry and Lexa Grasz 2015 --%> 



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>
<body>
    
   <form class="form" action="library" method="post">
     <h2>Checkout a book</h2>
      <input type="hidden" name="action" value="checkout">        
      <label>First Name:</label>
      <input type="text" name="first" value="${user.firstName}" required ><br>
      <label>Last Name:</label>
      <input  type="text" name="last" value="${user.lastName}"  required><br>
      <label>Email Address:</label>
      <input  type="email"  name="email" value="${user.email}" required ><br>
      <label>Book Title:</label>
      <input  class="book" type="text"  name="title" value="${user.book}" required><br>
      <label class="spacer">&nbsp;</label>
      <input type="submit" value="Checkout" class="button">
    </form>

<%@ include file="/includes/footer.jsp" %>