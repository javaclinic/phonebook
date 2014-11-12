phonebook
=========
`phonebook` is a simple Java EE application that implements simple phonebook features. It includes the following components:
- `com.javaclinic.phonebook.model.PhonebookEntry` JPA entity
- `com.javaclinic.phonebook.services.PhonebookService` stateless session EJB
- `com.javaclinic.phonebook.web.ListServlet` servlet
- `/WEB-INF/views/list.jsp`, `/WEB-INF/views/error.jsp`
- `/WEB-INF/phonebook-ds.xml`
- `META-INF/persistence.xml`


Build
-----
You can build/package the application with Maven:
- `mvn clean package`

This will build a new WAR archive file, e.g. `target/phonebook.war`.


Deploy
------
You can deploy directly to the local JBoss AS7/EAP6 instance:
- `mvn jboss-as:deploy`

ToDo
----
- Add delete phonebook entry feature
- Add update phonebook entry feature
- Add TABLE stylesheet
