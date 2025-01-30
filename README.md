# Car Inventory Management System

A Spring Boot-based application developed to manage car inventory. This system allows for the efficient management of vehicle records through CRUD operations (Create, Read, Update, Delete). It integrates a database for storing car details and ensures efficient data retrieval. The application provides RESTful APIs, which have been designed and tested for functionality and validation using **Postman**. The solution follows best practices in API design and code structure, ensuring scalability and maintainability.

## Features

- **CRUD Operations**: 
  - Create, read, update, and delete car records in the inventory.
- **Database Integration**: 
  - Use a relational database (e.g., MySQL, PostgreSQL) to persist car details.
- **RESTful API Design**: 
  - Exposes APIs to interact with car data in a standardized manner.
- **Postman Testing**:
  - APIs have been thoroughly tested using Postman to ensure functionality and correctness.

## Technologies Used

- **Backend**: 
  - Spring Boot (for RESTful API development)
  - JPA/Hibernate (for database interaction)
  - MySQL/PostgreSQL (database)
- **Tools**:
  - Maven (for dependency management)
  - Postman (for API testing)
- **API Design**:
  - RESTful APIs with CRUD operations

## Database Schema

The application stores car data in a relational database, which includes:

- **Car**: Contains car details like make, model, year, price, and VIN (Vehicle Identification Number).
- **Car Inventory**: Tracks the car inventory with an identifier for each car, linked to specific details.

## API Endpoints

### Car Endpoints

- `GET /api/cars` - Get all cars in the inventory
- `GET /api/cars/{id}` - Get a specific car by ID
- `POST /api/cars` - Add a new car to the inventory
- `PUT /api/cars/{id}` - Update car details
- `DELETE /api/cars/{id}` - Delete a car from the inventory

### Example Usage

1. **Get all cars**:
   - Request: `GET /api/cars`
   - Response: A list of all cars in the inventory.
   
2. **Add a new car**:
   - Request: `POST /api/cars`
   - Body: JSON object with car details (make, model, year, price, etc.)
   - Response: Confirmation of car added to the inventory.

3. **Update a car's details**:
   - Request: `PUT /api/cars/{id}`
   - Body: JSON object with updated car details.
   - Response: Updated car record.

4. **Delete a car**:
   - Request: `DELETE /api/cars/{id}`
   - Response: Confirmation that the car has been removed from the inventory.

## Installation

### Prerequisites

- Java 11 or higher
- Maven
- MySQL/PostgreSQL (or other relational database)
