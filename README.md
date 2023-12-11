# TP-MICROSERVICES
This repository contains the code for an eureka server, a gateway and two services


## Overview

This project consists of a Eureka Server, a Gateway, and two services that communicate with each other. The first service, "Car Service," interacts with a MySQL database, while the second service, "Client Service," communicates with another MySQL database. The Eureka interface allows you to view all the launched services.
![image](https://github.com/SAADBAKANZIZE/TP-MICROSERVICES/assets/101594125/4bc6ae00-ab27-4f0e-960f-4176bc94954f)


## Technologies Used

- Spring Tool Suite
- Java (Spring Boot) 
- MySQL
- Insomnia (for testing)

## Project Structure

- **Eureka Server:** Manages service registration and discovery.
- **Gateway:** Acts as an entry point for accessing microservices.
- **Car Service:** Handles interactions with a MySQL database for car-related data.
- **Client Service:** Manages interactions with a MySQL database for client-related data.
  
## URLs

-**Eureka Server:** http://localhost:8761
-**Gateway:** http://localhost:8888
-**Car Service:** http://localhost:8089
-**Client Service:** http://localhost:8088

## Testing

Insomnia was used for testing the functionality of the services.

## Running the Project

1. Start the Eureka Server.
2. Launch the Gateway.
3. Run the Car Service and Client Service.
4. Access the Eureka interface to view all launched services.

## Video Demo

[Watch the video demo](https://mega.nz/file/tw13VKZQ#u70M5coeh6dq1Pnn0MZIvw61-lNZs8_tHtNCN8bv9Uw) to see the project in action.


