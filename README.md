# Spring Microservice ERP Sandbox

This repository contains a learning-friendly ERP landscape composed of three Spring Boot microservices plus the infrastructure pieces required to let them communicate:

- **OMS Service (Order Management)** – handles customer orders and validates product data with the WMS service before persisting to an in-memory H2 database.
- **WMS Service (Warehouse Management)** – provides product and inventory CRUD APIs and queries the manufacturing service for related work orders.
- **MFG Service (Manufacturing)** – manages work orders stored in its own in-memory database.
- **Eureka Server** – acts as the service discovery registry shared by all services.
- **API Gateway** – exposes a unified entry point using Spring Cloud Gateway and performs service discovery based routing.

All persistence uses in-memory H2 databases, so you can start experimenting without installing MySQL or another external data store.

## Getting started

1. **Start the service discovery server**
   ```bash
   ./mvnw -pl eureka-server spring-boot:run
   ```
2. **Launch the remaining services (in separate terminals)**
   ```bash
   ./mvnw -pl api-gateway spring-boot:run
   ./mvnw -pl oms-service spring-boot:run
   ./mvnw -pl wms-service spring-boot:run
   ./mvnw -pl mfg-service spring-boot:run
   ```

   Each service registers itself with Eureka and exposes its API through the gateway running on port `8080`.

3. **Interact with the APIs** – example curl workflow:
   ```bash
   # Create a product and inventory in WMS through the gateway
   curl -X POST http://localhost:8080/wms/products \
     -H 'Content-Type: application/json' \
     -d '{"sku":"SKU-1","name":"Widget","description":"Test product"}'

   curl -X POST http://localhost:8080/wms/inventory \
     -H 'Content-Type: application/json' \
     -d '{"sku":"SKU-1","quantityOnHand":100}'

   # Create a manufacturing work order
   curl -X POST http://localhost:8080/mfg/work-orders \
     -H 'Content-Type: application/json' \
     -d '{"sku":"SKU-1","status":"PLANNED","quantity":50}'

   # Create an order – OMS validates the SKU via WMS before saving
   curl -X POST http://localhost:8080/oms/orders \
     -H 'Content-Type: application/json' \
     -d '{"customerName":"Acme Corp","productSku":"SKU-1","quantity":10,"status":"NEW"}'

   # Retrieve order details including product metadata fetched from WMS
   curl http://localhost:8080/oms/orders/1/details
   ```

4. **Explore service registries and consoles**
   - Eureka Dashboard: `http://localhost:8761`
   - H2 consoles (per service): `http://localhost:<service-port>/h2-console`

## Building

To build all modules run:
```bash
./mvnw clean package
```

Each module can also be built independently using `-pl <module-name>`.
