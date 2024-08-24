# Request Tracking System

## Overview

This project is a simple Spring Boot application that demonstrates how to track and log incoming HTTP requests in a MySQL database. The application captures the following details for each request:

- A unique ID for each request.
- The IP address of the client making the request.
- The request body or query parameters (depending on the request type).
- The timestamp when the request was received.

The application also includes a basic "Hello World" JSP page to demonstrate the functionality.


![image](https://github.com/user-attachments/assets/3b13461c-f3e4-4a77-bdb9-e2ebc4012157)


## Features

- **Request Logging:** Logs each incoming request to a MySQL database.
- **Database Integration:** Uses Spring Data JPA to manage database interactions.
- **Simple Web Interface:** Includes a basic JSP page to demonstrate the logging feature.

## Technologies Used

- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- JSP
- Maven

## Prerequisites

- Java 8 or higher
- Maven
- MySQL Server
