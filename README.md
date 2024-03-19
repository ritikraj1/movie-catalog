# Movie Catalog Project

Welcome to the Movie Catalog Project! This project is a microservices-based application built using Spring Boot and Spring Cloud, following best practices for scalability, modularity, and reliability.

## Introduction

The Movie Catalog Project is designed to provide a comprehensive solution for managing movie information and user ratings. It consists of multiple microservices:

- **Movie Information Microservice**: Retrieves movie information from an external API.
- **Ratings Microservice**: Stores ratings data for different users (dummy data in this case).
- **Movie Catalog Microservice**: Retrieves movie details and ratings for movies rated by a user.

## Features

- **Microservice Architecture**: Built using a microservices architecture for better scalability and maintainability.
- **Spring Cloud Components**: Utilizes Spring Cloud for features like Circuit Breaker, Spring Cloud Config Server, Load Balancing, and Service Discovery using Spring Cloud Eureka Server.
- **API Gateway**: Implements an API Gateway for routing requests to the appropriate microservices.
- **Authentication**: Secures endpoints with JWT authentication.
- **Monitoring**: Includes Spring Boot Admin Server for monitoring and managing Spring Boot applications.


## Usage

Once the microservices are up and running, you can access the Movie Catalog application through the API Gateway URL. Use appropriate endpoints to fetch movie information, ratings, and other functionalities.

## API Documentation

For details related to API, refer to the Postman API exports in the 'postman-exports' folder.
