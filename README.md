### This is the Playful Prelaunch sample app.

#### The stack:
- PostgreSQL 9.1-901.jdbc4

#### ui1
- in play framework 1
- play eclipsify //make .project for eclipse ide
- play run //run project in dev mode
- play start //run project in prod mode
- kill -9 $(cat server.pid) //kill process in production mode

#### ui2
- in play framework 2(Scala)
- ./activator //open sbt console
- ./play //open sbt console
- //then
- ~run //run command that compiles files when you save files
- run //run command that compiles when you refresh the browser
- start //run project in production mode
- digest //zip project as in production mode

- Play Framework 2.3.0
- Activator 1.2.10
- Scala 2.11.0
- Twitter Bootstrap 3.2.0
- JQuery 2.0.2
- sbt 0.13.5
- sbt-plugin 2.3.0
- sbt-coffeescript 1.0.0
- sbt-less 1.0.0
- sbt-digest 1.0.0
- sbt-uglify 1.0.3
- sbt-gzip 1.0.0
- sbt-concat 0.1.5
- sbt-css-compress 0.1.0
- sbt-filter 1.0.0
- sbt-html-minifier 1.0.0
- sbt-imagemin 1.0.0
- sbt-dustjs-linkedin 1.0.2
- play-auto-refresh 0.0.10


#### uis-api
in uis-api/
run command:
 `mvn eclipse:eclipse`

set up jboss-home in pom.xml:
edit <jboss.home>
(use content as sample)

create a database and name it "uis"(you can use different name, just assign it in <connection-url> below)

set up your database settings within datasource in <datasources> in <JBOSS-HOME>/standalone/configuration/standalone.xml
// <datasource jndi-name="java:jboss/datasources/uisDatasource" pool-name="uisDatasource" enabled="true">
//     <connection-url>jdbc:postgresql://localhost:5432/uis</connection-url>
//     <driver-class>org.postgresql.Driver</driver-class>
//     <driver>postgresql</driver>
//     <security>
//         <user-name>postgres</user-name>
//         <password>postgres</password>
//     </security>
//     <validation>
//         <check-valid-connection-sql>select 1</check-valid-connection-sql>
//     </validation>
// </datasource>


and driver in <datasources>/<drivers> in the same file(read this https://developer.jboss.org/blogs/amartin-blog/2012/02/08/how-to-set-up-a-postgresql-jdbc-driver-on-jboss-7)
// <driver name="postgresql" module="org.postgresql">
//     <xa-datasource-class>org.postgresql.xa.PGXADataSource</xa-datasource-class>
// </driver>


in uis-api/
run commands:
`mvn install`
`mvn clean package jboss-as:deploy`
(any time to deploy to server use this command, you can attach it to eclipse if you want by maven-eclipse-plugin)