# Apache Karaf feature creation task


## Build application with maven
For generate bundles and .kar file, in root directory ***service-avg*** use next maven command: 
```
mvn clean package install
```

after this in target folders sub modules will generated a bundle and kar files

in target 

## Deploy kar file:
Copy generated service-avg-feature-1.0.kar file to KARAF_HOME/deploy folder and run apache karaf

(karaf can be started before copy)

After deploy kar file, use next address for access to service:

http://localhost:8181/cxf/service-avg-bundle?wsdl