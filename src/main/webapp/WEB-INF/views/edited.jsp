<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>phonebook :: edited.jsp</h1>
<p>The following phonebook entry has been edited:</p>
<table class="mytable">
  <tr>
    <th>ID</th>
    <td>${ENTRY.id}</td>
  </tr>
  <tr>
    <th>NAME</th>
    <td>${ENTRY.name}</td>
  </tr>
  <tr>
    <th>NUMBER</th>
    <td>${ENTRY.number}</td>
  </tr>
  <tr>
    <th>NOTE</th>
    <td>${ENTRY.note}</td>
  </tr>
</table>
<p><a href="list">List phonebook entries</a></p>
<p><a href="./">Home</a></p>
</body>
</html>
