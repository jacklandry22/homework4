<%-- Copyright Lexa Grasz and Jack Landry 2015 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>
<body>

  <nav>
      <ul>
          <li><a href="library?action=toCheckout"> Check out a book </a></li>
          <li><a href="library?action=coBooks"> Manage checked out books </a></li>
      </ul>
  </nav>
    
<%@ include file="/includes/footer.jsp" %>