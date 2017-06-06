# Apache Karaf feature creation task

<details>
  <summary>TASK</summary>
<pre>


Implementation SOAP service feature using Blueprint.

Project should consist of:

- $service-name project

- $service-name-bundle module

- $service-name-feature module

Feature module should contain all necessary dependencies for service bundle.

Use 

```xml
<plugin>
    <groupId>org.apache.felix</groupId>
    <artifactId>maven-bundle-plugin</artifactId>
    <version>${maven.bundle.plugin.version}</version>
	...
</plugin> 
```

to configure bundle's manifest and create bundle JAR.

Use 
```xml
<plugin>
	<groupId>org.codehaus.mojo</groupId>
	<artifactId>build-helper-maven-plugin</artifactId>
	<version>${maven.build.helper.plugin}</version>
    ...
</plugin>
```

to create feature JAR and attach feature.xml resource.

Configure creation of KAR file using maven plugin.

Use functionality implemented during Web Services training (SOAP).

Apache Karaf Shell Console basics can be found on

https://karaf.apache.org/manual/latest/#_shell_console_basics


CXF blueprint documentation: 

http://cxf.apache.org/docs/jax-ws-configuration.html

http://kevinboone.net/suntimes_ws.html


</pre>
</details>


<details>
  <summary>Web Service (description task)</summary>
<pre>

### Web Service
Implement Web Service for getting average of double array. 
The service accepts array of double numbers and returns its average. For calculating average it’s needed to:
	1.	Create a client for the service
		http://www.webservicex.net/Statistics.asmx?WSDL  
	2.	Call the client's method GetStatistics
	3.	Parse GetStatistics response and take value from field "Average"
In case of value of field “Sums” of GetStatistics response is less than 0 ¬¬¬¬– SOAP response must have Fault section.
WSDL must have meaningful parameters’ names (not like arg0).

### Client (OPTIONAL)
Implement a client application for the Web Service above.
Demonstrate work of the Web Service in it.

</pre>
</details>


<details>
  <summary>description structure of solution</summary>
<pre>
  
```
  - service-avg (multimodule project)  
  - service-avg-api-bundle (API for SOAP service)
  - service-avg-bundle (project contain implementation of SOAP service)
  - service-avg-feature (project contain feature. After build application contain .kar file )

  CLIENT_FOR_TEST_SERVICE          
    - client-avg (project client for test service. console application in executable jar file)
```
</pre>
</details>

## Build application with maven
For generate ***bundles and .kar*** file, in root directory ***service-avg*** use next maven command: 
```
mvn clean package install
```

after this in ***target*** folders in ***service-avg-feature*** module, will generated ***service-avg-feature-1.0.kar*** files

## Deploy kar file:
Copy generated ***service-avg-feature-1.0.kar*** file to ***KARAF_HOME/deploy*** folder and run apache karaf

(karaf can be started before copy)

After deploy service-avg-feature-1.0.kar, use next address for access to service wsdl schema:

http://localhost:8181/cxf/service-avg-bundle?wsdl


#### Test work
For test you can use project ***client-avg*** from folder *CLIENT_FOR_TEST_SERVICE*
