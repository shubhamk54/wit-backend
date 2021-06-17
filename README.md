## Perform below steps to run the app

# Run using Spring boot plugin
mvn spring-boot:run

# Run using Docker

mvn clean install 
docker build -t wit/service-product-mgr .
docker run -d -p 8080:8080 wit/service-product-mgr:latest

# Perform below steps to push the image to IBM CR

mvn clean install 
docker build -t uk.icr.io/dev-env/wit/service-product-mgr .
docker push uk.icr.io/dev-env/wit/service-product-mgr:latest


# deploy the app to cloud foundary
cf push wit-backend-3 -o uk.icr.io/dev-env/wit/service-product-mgr:latest --docker-username shubham_kale
