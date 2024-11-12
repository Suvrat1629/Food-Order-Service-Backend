
# Food Delivery Platform

## Features

- **User Registration and Login**: Secure user authentication and authorization for customers, delivery personnel, and admins.
- **Restaurant Management**: Allows restaurant owners to add, update, and delete food items on the menu.
- **Order Management**: Enables users to place orders, track status, and receive notifications.
- **Admin Dashboard**: Admins can manage all orders, restaurants, and user accounts from a single interface.
- **Delivery Tracking**: Real-time tracking of delivery status for both customers and delivery personnel.
- **Cart Functionality**: Customers can add items to their cart and modify the quantity before placing an order.

## Tech Stack

- **Backend**: Spring Boot
- **Database**: MySQL
- **Security**: Spring Security with JWT authentication
- **REST API**: Exposes endpoints for CRUD operations and business logic
- **Build Tool**: Maven

## Getting Started

To set up and run the project locally, follow these steps:

### Prerequisites

- Java 17 or above
- Maven 3.6 or above
- MySQL

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/food-delivery-platform.git
   cd food-delivery-platform
   ```

2. **Set up the Database**:
   - Configure MySQL database connection in `application.properties`.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/food_delivery
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
   - Alternatively, you can use an in-memory H2 database for quick testing.

3. **Build and Run the Project**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the Application**:
   - The application will be available at `http://localhost:8080`.

## API Endpoints

Here are some of the main REST API endpoints:

- **User Registration**: `POST /api/auth/register`
- **User Login**: `POST /api/auth/login`
- **Get All Restaurants**: `GET /api/restaurants`
- **Add Food Item**: `POST /api/restaurants/{restaurantId}/items`
- **Place Order**: `POST /api/orders`
- **Track Order**: `GET /api/orders/{orderId}/status`


will add some documentation or the complete list of endpoints:)


## Contributing

Contributions are welcome! Please open an issue first to discuss any feature changes or bug fixes.
