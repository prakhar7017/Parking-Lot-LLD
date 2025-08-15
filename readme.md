# Parking Lot System

A comprehensive parking lot management system implemented in Java, designed using Object-Oriented Programming principles and various design patterns.

## Features

- **Multiple Vehicle Types**: Support for different vehicle types (Car and Bike)
- **Multi-Floor Parking**: System supports multiple parking floors
- **Dedicated Parking Spots**: Each floor has dedicated spots for cars and bikes
- **Ticketing System**: Generates tickets for parked vehicles
- **Entry/Exit Gates**: Separate gates to handle vehicle entry and exit
- **Payment Processing**: Multiple payment options (Cash, Card, UPI)
- **Hourly Fee Model**: Parking fees calculated based on hours parked
- **Capacity Management**: System prevents exceeding maximum capacity

## System Architecture

### Core Components

1. **Parking Lot**: Main component that manages floors and parking operations
2. **Parking Floor**: Contains multiple parking spots for different vehicle types
3. **Parking Spots**: Individual spots for cars and bikes
4. **Vehicles**: Different types of vehicles that can be parked
5. **Gates**: Entry and exit points for the parking lot
6. **Payment System**: Handles different payment methods
7. **Ticket**: Records parking information

### Design Patterns Used

- **Factory Pattern**: For creating different types of vehicles
- **Strategy Pattern**: For implementing different payment methods

## How to Use

1. Run the Main class to start the parking lot system
2. Follow the menu options to:
   - Park a vehicle
   - Vacate a parking spot
   - Exit the system

## Technical Details

- **Language**: Java
- **Build Tool**: Maven
- **Project Structure**:
  - `com.prakhar.Gates`: Contains entrance and exit gate implementations
  - `com.prakhar.Parkinglot`: Core parking lot components
  - `com.prakhar.payments`: Payment processing system
  - `com.prakhar.vehicles`: Vehicle-related classes
  - `com.prakhar.main`: Main application class

## Getting Started

```bash
# Clone the repository
git clone https://github.com/prakhar7017/Parking-Lot-LLD.git

# Navigate to the project directory
cd parkinglotsystem

# Compile the project
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="com.prakhar.main.Main"
```

## Future Enhancements

- Add support for more vehicle types
- Implement reservation system
- Add reporting and analytics
- Integrate with external payment gateways
- Implement user authentication
