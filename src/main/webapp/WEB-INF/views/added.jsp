<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<h1>phonebook :: added.jsp</h1>
<p>The following phonebook entry has been added:</p>
<table>
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
<p><a href="add">Add another phonebook entry</a></p>
<p><a href="list">List phonebook entries</a></p>
<p><a href="./">Home</a></p>
</body>
</html>
