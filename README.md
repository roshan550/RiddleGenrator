# RiddleGenerator

A simple Spring Boot application that generates and displays riddles. The project includes a REST API for fetching riddles and a web interface for users to interact with.

## Features
- REST API to get random riddles
- Web interface for users
- Multilingual support (English and Hindi)

## Project Structure
- `src/main/java/com/example/RiddleGenerator/` - Java source code
- `src/main/resources/templates/` - HTML templates
- `src/main/resources/static/` - Static assets (CSS, JS)
- `src/main/resources/messages_en.properties` - English messages
- `src/main/resources/messages_hi.properties` - Hindi messages

## Getting Started

### Prerequisites
- Java 17 or later
- Maven

### Running the Application

1. Navigate to the `RiddleGenerator` directory:
   ```sh
   cd RiddleGenerator
   ```
2. Build and run the application using Maven:
   ```sh
   ./mvnw spring-boot:run
   ```
   Or on Windows:
   ```sh
   mvnw.cmd spring-boot:run
   ```
3. Open your browser and go to [http://localhost:8080](http://localhost:8080)

## API Endpoints
- `GET /api/riddle` - Returns a random riddle in JSON format

## Customization
- Add more riddles in `RiddleService.java`
- Update UI in `templates/riddle.html` and `static/css/riddle.css`

## License
This project is for educational purposes. 