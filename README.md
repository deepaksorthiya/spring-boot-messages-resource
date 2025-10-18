<h1 style="text-align: center;">Spring Boot OAuth2 Message Resource Server</h1>

<p style="text-align: center;">
  <a href="https://github.com/deepaksorthiya/spring-boot-messages-resource/workflows/maven-build.yml">
    <img src="https://github.com/deepaksorthiya/spring-boot-messages-resource/actions/workflows/maven-build.yml/badge.svg" alt="Java Maven Build Test"/>
  </a>
  <a href="https://hub.docker.com/r/deepaksorthiya/spring-boot-messages-resource">
    <img src="https://img.shields.io/docker/pulls/deepaksorthiya/spring-boot-messages-resource" alt="Docker"/>
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img src="https://img.shields.io/badge/spring--boot-3.5.6-brightgreen?logo=springboot" alt="Spring Boot"/>
  </a>
</p>

## Live Demo

TBD

---

## 📑 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Requirements](#-requirements)
- [Getting Started](#-getting-started)
    - [Clone the Repository](#1-clone-the-repository)
    - [Start Docker](#2-start-docker)
    - [Build the Project](#3-build-the-project)
    - [Run Project Locally](#4-run-the-project)
    - [Build Docker Image](#5-optional-build-docker-image-docker-should-be-running)
    - [Run Docker Image](#6-optional-running-on-docker)
    - [Deploy on Kubernetes with Helm](#7-optionalrun-on-local-minikube-kubernetes-using-helm-chart)
- [Testing](#-testing)
- [Clean Up](#-cleanup)
- [Reference Documentation](#-reference-documentation)
- [Guides](#-guides)

---

## 🚀 Overview

A modern **Spring Boot** starter project with OAuth2 Resource Server REST API, Actuator, Docker, and Kubernetes Helm
support.

---

## 🚀 Features

- Spring Boot 3.5.6 (Java 25)
- RESTful API with CRUD endpoints
- Spring Data JPA (H2 in-memory DB)
- Actuator endpoints enabled
- Oauth2 Resource Server
- Docker & multi-stage build
- Kubernetes manifests & Helm chart
- GitHub Actions CI/CD

---

## 📦 Requirements

- Git `2.51+`
- Java `25`
- Maven `3.9+`
- Spring Boot `3.5.6`
- (Optional)Docker Desktop (tested on `4.48.0`)
- (Optional) Minikube/Helm for Kubernetes

---

## 🛠️ Getting Started

Run Authorization server [Auth-Server](https://github.com/deepaksorthiya/spring-boot-3-oauth2-authserver.git).
Configure Host file and add auth-server as DNS to avoid localhost cookie issue.

### 1. Clone the Repository

```sh
git clone https://github.com/deepaksorthiya/spring-boot-messages-resource.git
cd spring-boot-messages-resource
```

### 2. Start Docker

```sh
docker compose up
```

### 3. Build the Project

```sh
./mvnw clean package -DskipTests
```

OR

for native build run

```bash
./mvnw clean native:compile -Pnative
```

### 4. Run the Project

```sh
./mvnw spring-boot:run
```

OR Jar file

```sh
java -jar .\target\spring-boot-messages-resource-0.0.1-SNAPSHOT.jar
```

OR

Run native image directly

```bash
target/spring-boot-messages-resource
```

### 5. (Optional) Build Docker Image (docker should be running)

```sh
./mvnw clean spring-boot:build-image -DskipTests
```

OR

To create the native container image, run the following goal:

```bash
./mvnw spring-boot:build-image -DskipTests -Pnative
```

### 6. (Optional) Running On Docker

```sh
docker run -p 8080:8080 --name spring-boot-messages-resource deepaksorthiya/spring-boot-messages-resource:latest
```

### 7. (Optional)Run on Local minikube Kubernetes using Helm Chart

```sh
cd helm
helm create spring-boot-messages-resource
helm lint spring-boot-messages-resource
helm install spring-boot-messages-resource --values=spring-boot-messages-resource/values.yaml spring-boot-messages-resource
helm install spring-boot-messages-resource spring-boot-messages-resource
helm uninstall spring-boot-messages-resource
```

---

## 🧪 Testing

- Access the API: [http://localhost:8080/messages](http://localhost:8080/messages)

### Postman API Collection

TBD

### Rest API Endpoints

TBD

### Run Unit-Integration Test Cases

```bash
./mvnw clean test
```

To run your existing tests in a native image, run the following goal:

```bash
./mvnw test -PnativeTest
```

---

## 📚 Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/maven-plugin)
- [Create an OCI image](https://docs.spring.io/spring-boot/maven-plugin/build-image.html)
- [Spring Boot Actuator](https://docs.spring.io/spring-boot/reference/actuator/index.html)
- [Spring Web](https://docs.spring.io/spring-boot/reference/web/servlet.html)
- [Spring Data JPA](https://docs.spring.io/spring-boot/reference/data/sql.html#data.sql.jpa-and-spring-data)
- [Validation](https://docs.spring.io/spring-boot//io/validation.html)
- [Flyway Migration](https://docs.spring.io/spring-boot/how-to/data-initialization.html#howto.data-initialization.migration-tool.flyway)

---

## 📚 Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Validation](https://spring.io/guides/gs/validating-form-input/)
- [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

---

<p style="text-align: center;">
  <b>Happy Coding!</b> 🚀
</p>