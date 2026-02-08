Local Kubernetes (Docker Desktop)

This folder contains manifests for running the services in your local Kubernetes cluster (Docker Desktop).

Build images (example)
1) docker build --build-arg MODULE=api-gateway -t spring-micro-service-erp/api-gateway:latest .
2) docker build --build-arg MODULE=oms-service -t spring-micro-service-erp/oms-service:latest .
3) docker build --build-arg MODULE=wms-service -t spring-micro-service-erp/wms-service:latest .
4) docker build --build-arg MODULE=party-service -t spring-micro-service-erp/party-service:latest .
5) docker build --build-arg MODULE=kafka-service -t spring-micro-service-erp/kafka-service:latest .
6) docker build -f frontend/Dockerfile -t spring-micro-service-erp/frontend:latest frontend

Apply manifests
kubectl apply -f k8s

Notes
- DB_HOST is set to host.docker.internal to use your local MySQL (e.g. from docker-compose).
- Kafka is set to host.docker.internal:9094 for local docker-compose Kafka.
- SPRING_PROFILES_ACTIVE=k8s disables Eureka and uses K8s service DNS.
