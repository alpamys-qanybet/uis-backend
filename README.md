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
###SOFT to install:
 - __Preferred OS__: Linux, Mac
 - __language__: Java JDK 1.7
 - __task and repository manager__: maven 3.0.4
 - __server__: JBoss AS 7
 - __IDE__(Preferred): eclipse indigo


###PROJECT:
in uis-api/

run command:

 `mvn eclipse:eclipse` (if you use another, run specified command)


set up jboss-home in __~/.profile__ or __/etc/bash.bashrc__, add following to the end of file:
~~~~
export JBOSS_HOME=<JBOSS-HOME>
~~~~


###SERVER:
create a database and name it "uis"(you can use different name, just assign it in _<connection-url>_ below)

set up your database settings within datasource in _<datasources>_ in ___<JBOSS-HOME>_/standalone/configuration/standalone.xml__
~~~~
    <datasource jndi-name="java:jboss/datasources/uisDatasource" pool-name="uisDatasource" enabled="true">
        <connection-url>jdbc:postgresql://localhost:5432/uis</connection-url>
        <driver-class>org.postgresql.Driver</driver-class>
        <driver>postgresql</driver>
        <security>
            <user-name>yourusername</user-name>
            <password>yourpassword</password>
        </security>
        <validation>
            <check-valid-connection-sql>select 1</check-valid-connection-sql>
        </validation>
    </datasource>
~~~~


and driver in _<datasources>/<drivers>_ in the same file read [ this ](https://developer.jboss.org/blogs/amartin-blog/2012/02/08/how-to-set-up-a-postgresql-jdbc-driver-on-jboss-7)

~~~~
    <driver name="postgresql" module="org.postgresql">
        <xa-datasource-class>org.postgresql.xa.PGXADataSource</xa-datasource-class>
    </driver>
~~~~

run server in standalone mode:

`<JBOSS-HOME>/bin/standalone.sh`


### Tasks:
in uis-api/

run commands:

`mvn install`: download dependencies and locate into repo

`mvn clean package`: build project into target

`jboss-as:deploy`: deploy to server

(any time to deploy to server use this command, you can attach it to eclipse if you want by maven-eclipse-plugin)

update uis-ui if needed:

in [ uis-ui/ ](https://bitbucket.org/ZhSulta/ui) run:

`mvn clean install`

(you do not need to deploy the ui project as it is dependant to uis-api and locates within uis-api)


### Security JAAS JBoss security domain
Rest api is divided into open and secured url methods:
add in __standalone.xml__ inside _<security-domains>_ following:
~~~~
    <security-domain name="ls-system" cache-type="default">
        <authentication>
            <login-module code="Database" flag="required">
                <module-option name="dsJndiName" value="java:jboss/datasources/uisDatasource"/>
                <module-option name="principalsQuery" value="select U.PASSWORD_ from SC_USER U where U.LOGIN_=?"/>
                <module-option name="rolesQuery" value="select NAME_, GROUP_ from SC_JAAS_ROLE where USER_=?"/>
                <module-option name="hashAlgorithm" value="MD5"/>
                <module-option name="hashEncoding" value="base64"/> 
            </login-module>
        </authentication>
    </security-domain>
~~~~

##DB:
~~~~
    CREATE TABLE sc_jaas_role
	(
	  group_ character varying(255),
	  name_ character varying(255),
	  user_ character varying(255)
	)
	WITH (
	  OIDS=FALSE
	);
	ALTER TABLE sc_jaas_role
	  OWNER TO postgres;
~~~~


##REST urls:
 - ##secured: `rest/secure`
 - ##open: `rest/`

in __UI__ use followings:
 
 to login:
~~~~
    <a href='http://localhost:8080/uis-api/login.html?url=back-url'>Login</a>
~~~~

 to logout:
~~~~
  REST GET method 'secure/users/logout'
~~~~

 to check if user is authorized(returns true/false in text):
~~~~
  REST GET method 'authorized'
~~~~

JAAS integration uses JSESSIONID inside cookie.


##SENDING E-MAIL USING GOOGLE SMTP
If you don’t have your own SMTP server, you can use Google’s in a pinch.

First, we will need to configure a mail session.
Stop JBoss if it is running.
Open __standalone.xml__. Search for smtp. You will see a sample mail session defined like this:
~~~~
<mail-session jndi-name="java:jboss/mail/Default">
	<smtp-server outbound-socket-binding-ref="mail-smtp"/>
</mail-session>
~~~~
Change it like this. I have highlighted the relevant changes.

~~~~
<mail-session jndi-name="java:jboss/mail/Default">
 	<smtp-server ssl="true" outbound-socket-binding-ref="mail-smtp">
    	<login name="portal.sdu" password="myportalsmtp"/>
	</smtp-server>
</mail-session>
~~~~
Basically, you are enabling SSL and entering your Google account information.

Keep searching for smtp and you will see how the SMTP server address is defined.

~~~~
<outbound-socket-binding name="mail-smtp">
	<remote-destination host="localhost" port="25"/>
</outbound-socket-binding>
~~~~
Change it as follows.

~~~~
<outbound-socket-binding name="mail-smtp">
	<remote-destination host="smtp.gmail.com" port="465"/>
</outbound-socket-binding>
~~~~

Save changes. Start the server.
