<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>phonebook :: index.jsp</h1>
<p>&nbsp;</p>
<h2>Description</h2>
<p>This is an example of a JEE app that provides simple phonebook features. Here are major components:</p>
<ul>
  <li>com.javaclinic.phonebook.model.PhonebookEntry JPA entity</li>
  <li>com.javaclinic.phonebook.services.PhonebookService stateless session EJB</li>
  <li>com.javaclinic.phonebook.dao.PhonebookEntryDao stateless session EJB</li>
  <li>com.javaclinic.phonebook.web.ListServlet servlet</li>
  <li>com.javaclinic.phonebook.web.AddServlet servlet</li>
  <li>META-INF/persistence.xml (on a classpath)</li>
  <li>/WEB-INF/views/list.jsp</li>
  <li>/WEB-INF/views/add.jsp</li>
  <li>/WEB-INF/views/added.jsp</li>
  <li>/WEB-INF/views/error.jsp</li>
  <li>/WEB-INF/phonebook-ds.xml</li>
</ul>
<h2>Features</h2>
<p><a class="button" href="list">List phonebook entries</a></p>
<p><a class="button" href="add">Add a phonebook entry</a></p>
</body>
</html>
