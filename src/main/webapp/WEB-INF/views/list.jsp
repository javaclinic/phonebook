<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>phonebook :: list.jsp</h1>

<c:if test="${empty LIST}">
<p>There are no entries in the phonebook list.</p>
</c:if>

<c:if test="${! empty LIST}">
<p>Here's the list of phonebook entries:</p>
<table class="mytable">
  <thead>
    <tr>
      <th>ID</th>
      <th>NAME</th>
      <th>NUMBER</th>
      <th>NOTE</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${LIST}" var="item">
      <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.number}</td>
        <td>${item.note}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>
</c:if>

<p><a href="add">Add a phonebook entry</a></p>
<p><a href="./">Home</a></p>
</body>
</html>
