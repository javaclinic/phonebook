<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>phonebook :: add.jsp</h1>
<p>Please add details of the entry to add to phonebook:</p>
<form action="add" method="POST">
<table class="mytable">
  <tr>
    <th>NAME</th>
    <td><input type="text" name="name" value="John Doe" /></td>
  </tr>
  <tr>
    <th>NUMBER</th>
    <td><input type="text" name="number" value="415-555-1111" /></td>
  </tr>
  <tr>
    <th>NOTE</th>
    <td><input type="text" name="note" value="work" /></td>
  </tr>
  <tr>
    <td colspan="2"><input class="button" type="submit" value="Submit" /></td>
  </tr>
</table>
</form>
<p><a class="button" href="list">List phonebook entries</a></p>
<p><a class="button" href="./">Home</a></p>
</body>
</html>
