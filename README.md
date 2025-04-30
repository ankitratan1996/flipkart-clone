# 🛒 Flipkart Microservices Backend

This is a microservices-based backend system inspired by the architecture of Flipkart, developed in Java using Spring Boot. It follows modular design principles and enables scalable development of e-commerce platforms.

## 🧱 Project Structure

flipkart/ ├── apigatewayservice ├── userservice ├── orderservice ├── productservice ├── paymentservice ├── shippingservice ├── favouriteservice ├── auditservice ├── eurekaserver-service ├── proxy-client ├── deployment └── pom.xml


## 🚀 Tech Stack
| Layer         | Technology            |
|---------------|------------------------|
| Language      | Java 17+               |
| Framework     | Spring Boot, Spring Cloud |
| Build Tool    | Maven                  |
| Service Discovery | Eureka              |
| API Gateway   | Spring Cloud Gateway   |
| Communication | REST, Feign Client     |
| Containerization | Docker, Kubernetes *(planned)* |

## 🧩 Microservices Overview
| Service         | Description |
|-----------------|-------------|
| **apigatewayservice** | Centralized gateway for routing requests to microservices |
| **userservice**       | Handles user registration and authentication |
| **orderservice**      | Manages order placement and retrieval |
| **productservice**    | Provides product information and listings |
| **paymentservice**    | Processes transactions and payment data |
| **shippingservice**   | Handles delivery tracking and logistics |
| **favouriteservice**  | Lets users add/view favorite products |
| **auditservice**      | Logs system events for traceability |
| **eurekaserver-service** | Enables service discovery |
| **proxy-client**      | Internal service-to-service communication |

## 🛠️ Getting Started
### 🔄 Prerequisites
- Java 17+
- Maven
- Docker (optional, for deployment)
### 🔧 Build Project
```bash
mvn clean install


---

## 🚀 Technologies Used

- Java 17+
- Spring Boot
- Spring Cloud Gateway
- Eureka Service Discovery
- Maven
- RESTful APIs
- (Docker/Kubernetes – if applicable)

---

## 🛠️ Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Docker (if using containerized deployment)

### Build All Services

```bash
mvn clean install
