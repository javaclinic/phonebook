<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>phonebook :: add.jsp</h1>
<p>Please add details of the entry to add to phonebook:</p>
<form action="edit" method="POST">
<input type="hidden" name="id" value="${ENTRY.id}" />
<table class="mytable">
  <tr>
    <th>ID</th>
    <td>${ENTRY.id}</td>
  <tr>
    <th>NAME</th>
    <td><input type="text" name="name" value="${ENTRY.name}" /></td>
  </tr>
  <tr>
    <th>NUMBER</th>
    <td><input type="text" name="number" value="${ENTRY.number}" /></td>
  </tr>
  <tr>
    <th>NOTE</th>
    <td><input type="text" name="note" value="${ENTRY.note}" /></td>
  </tr>
  <tr>
    <td colspan="2"><input type="submit" value="Update phonebook entry" /></td>
  </tr>
</table>
</form>
<p><a href="list">List phonebook entries</a></p>
<p><a href="./">Home</a></p>
</body>
</html>
