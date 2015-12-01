<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>
<body>
    <div>
<h2>Currently checked out books</h2>

<table>

  <tr>
    <th>Patron Name</th>
    <th>Email Address</th>
    <th>Book Title</th>
    <th>Due Date</th>
    <th>Overdue</th>
  </tr>

  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:forEach var="user" items="${users}"> 
  <tr>
    <td>${user.firstName} + ${user.lastName}</td>
    <td>${user.email}</td>
    <td>${user.book}</td>
    <td>${user.dueDate}</td>
    <td>${user.overdue}</td>
    <td><a href="homework4?action=checkin_user&amp;book=${user.book}">Check in</a></td>
      
<!--    <td><label class="spacer">&nbsp;</label>
      <input type="submit" value="Checkout" class="button"></td>-->
  </tr>
 </c:forEach>

</table>

<p><a href="index.jsp">Return to front page</a></p>
  
    </div>
  
<%@ include file="/includes/footer.jsp" %>
