To run,

You will need the mp3 files in the react app and for java intellij will need the below properties in your application.properties file

# Datasource and H2 stuff
spring.h2.console.enabled=true
spring.h2.console.path=/h2
hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.datasource.url=jdbc:h2:file:./db/millionaireservice_db
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true

then

run the main method in the WhoWantsToBeAMillionaireApplication file on the backend, be sure to open the file at the level of the pom.xml 

When spring is loaded then type 'npm start' in your react app.
