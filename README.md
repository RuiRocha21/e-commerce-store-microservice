# Event-Driven-Microservices-CQRS-SAGA-Axon-Spring-Boot
Microservices e-commerce store with Event-Driven, CQRS, SAGA, Axon server in Spring Boot

Order run Microservices
Run axon server by docker by port 8084
Run DiscoveryServer
Run OrderService
Run PaymentService
Run ProductService
Run UsersService
Run ApiGateWay

Data base product service

	url-> http://localhost:8082/products-service/h2-console
	JDBC URL: jdbc:h2:file:~/products
	User-> root
	Pass-> rui

Data base order service

	url-> http://localhost:8082/orders-service/h2-console
	JDBC URL-> jdbc:h2:file:~/orders-dev
	User-> root
	Pass-> rui

Data base payment service

	url-> http://localhost:8082/payments-service/h2-console
	JDBC URL-> jdbc:h2:file:~/payments
	User-> root
	Pass-> rui

URL Eureka server - > http://localhost:8761/


Exemple input product service
http://localhost:8082/products-service/products
{
	"title":"macbook pro 2022",
	"price":3200,
	"quantity":20
}

Exemple input order service
http://localhost:8082/orders-service/orders
{
	"productId":"f241af45-4854-43f4-95bc-ab54da338a29",
	"quantity":1,
	"addressId":"afbb5881-a872-4d13-993c-faeb8350eea5"
}

productId is string id of product

Reset event processor
http://localhost:8082/products-service/management/eventProcessor/product-group/reset

Image axon for docker
docker run --name axonserver -p 8024:8024 -p 8124:8124 -v "Path workspace/data":/data -v "Path workspace/eventdata":/eventdata -v "Path workspace/docker-data/config":/config axoniq/axonserver

URL Axon Server ->    http://localhost:8024
