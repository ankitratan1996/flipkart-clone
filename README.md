# 🛡️ Flipkart Microservices Project - JWT Authentication

This project is a microservices-based architecture for an e-commerce backend system. It includes services such as `userservice`, `orderservice`, `productservice`, `paymentservice`, and more. Authentication and authorization are implemented using **JWT (JSON Web Token)**.

## 🔐 JWT Authentication Overview

JWT is used to authenticate users and authorize access to protected resources across microservices.

### ✅ Flow

1. **User logs in via `/userservice/login`.**
2. **A JWT token is generated and returned to the client.**
3. **Client includes the token in the `Authorization` header for subsequent requests.**
4. **The `apigatewayservice` validates the token and forwards the request to the appropriate service.**

---

## 📦 Involved Services

- **userservice** – Handles user login and token generation.
- **apigatewayservice** – Validates JWT tokens on incoming requests.
- **Other services** – Assume incoming requests are authenticated via the gateway.

---

## 🧪 Example Usage

### 1. Login (Token Generation)

```http
POST /userservice/login
Content-Type: application/json

{
  "username": "testuser",
  "password": "password123"
}
