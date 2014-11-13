phonebook
=========
`phonebook` is a Java EE application that implements simple phonebook features. It includes the following components:
- `com.javaclinic.phonebook.model.PhonebookEntry` JPA entity
- `com.javaclinic.phonebook.services.PhonebookService` stateless session EJB
- `com.javaclinic.phonebook.dao.PhonebookEntryDao` stateless session EJB (DAO)
- `com.javaclinic.phonebook.services.PhonebookService` stateless session EJB
- `com.javaclinic.phonebook.web.ListServlet` servlet
- `com.javaclinic.phonebook.web.AddServlet` servlet
- `com.javaclinic.phonebook.web.RemoveServlet` servlet
- `com.javaclinic.phonebook.web.EditServlet` servlet
- `/WEB-INF/views/list.jsp`
- `/WEB-INF/views/add.jsp`
- `/WEB-INF/views/added.jsp`
- `/WEB-INF/views/removed.jsp`
- `/WEB-INF/views/edit.jsp`
- `/WEB-INF/views/edited.jsp`
- `/WEB-INF/views/error.jsp`
- `/WEB-INF/phonebook-ds.xml`
- `META-INF/persistence.xml`


Build
-----
You can build/package the application with Maven:
- `mvn clean package`

This will build a new WAR archive file, e.g. `target/phonebook.war`.


Deploy/Undeploy/Redeploy
-----------------------
You can deploy/redeploy/undeploy directly to the local JBoss AS7/EAP6 instance:
- `mvn jboss-as:deploy`
- `mvn jboss-as:redeploy`
- `mvn jboss-as:undeploy`

ToDo
----
- Add multi-add feature.
