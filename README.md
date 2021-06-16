## Perform below steps to run the app

mvn clean install ;
docker build -t wit/service-product-mgr . ;
docker run -d -p 8080:8080 wit/service-product-mgr:latest ;