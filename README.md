# Microservices Eureka Server with Restaurant Service 🍽️

This project is a demonstration of a microservices architecture utilizing Eureka Server for service discovery and registration. It includes services for managing restaurants, users, orders, and food items.

## Features

- Eureka Server for service discovery
- Restaurant microservice for managing restaurant listings
- RESTful endpoints for fetching all restaurants and adding a new restaurant
- DTO (Data Transfer Object) mapping using MapStruct for converting entities to DTOs
- Integration with front end applications

## Technologies Used

- Spring Boot
- Eureka Server
- MapStruct
- Java

## Getting Started

To run this project locally, you need to have Java and Maven installed on your machine.

1. Clone this repository:

```bash
git clone https://github.com/your_username/your_project.git

```

2. Navigate to the project directory:

```bash
cd your_project
```
3. Run the Eureka Server:
```bash
cd eureka-server
mvn spring-boot:run
```
4. Run the Restaurant Service:
```bash
cd restaurant-service
mvn spring-boot:run
```

## Endpoints

## Fetch All Restaurants

- **Method:** `GET`
- **URL:** `/fetchAllRestaurant`
- **Description:** Retrieves a list of all restaurants.

## Add Restaurant

- **Method:** `POST`
- **URL:** `/addRestaurant`
- **Description:** Adds a new restaurant.
## Usage/Examples

- After running the services, you can access the Eureka Server dashboard at http://localhost:8761. Here, you can see the registered services.
- The Restaurant Service exposes RESTful endpoints for managing restaurant data. You can fetch all restaurants or add a new restaurant using the provided endpoints.


## Contributing

Contributions are always welcome!

If you find any issues or would like to contribute to this project, feel free to open a pull request or submit an issue.


## Authors

- [@Dhananjaywarade](https://github.com/Dhananjaywarade)

