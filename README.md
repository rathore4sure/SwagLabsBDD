# Swag Labs Automation Testing using Cucumber BDD

This repository contains the automation framework for testing the Swag Labs e-commerce application using Cucumber BDD with Selenium WebDriver and TestNG. The framework is designed to validate critical user flows including login, product interaction, cart management, and checkout.

## Tech Stack

- **Language:** Java  
- **Frameworks:** Cucumber BDD, TestNG  
- **Automation Tool:** Selenium WebDriver  
- **Design Pattern:** Page Object Model (POM)  
- **Build Tool:** Maven  
- **Reporting:** ExtentReports (Aventstack)  
- **Test Data Management:** Excel (Apache POI)

## Features Automated

- User login (valid and invalid scenarios)
- Product filtering and sorting
- Adding/removing items from the cart
- Checkout process
- Logout functionality
- Error message and UI validations

## Project Structure
src
├── main
│ └── java
│ └── pages # Page classes using PageFactory
│ └── utils # Utility classes (ExcelReader, ConfigManager)
├── test
│ └── java
│ └── stepDefinitions # Step definition classes
│ └── runners # Test runners using TestNG
│ └── features # Gherkin feature files

## Key Highlights

- Uses **Behavior Driven Development** with Gherkin syntax for readable and structured test scenarios.
- Implements **Page Object Model (POM)** using PageFactory for cleaner and modular code.
- Enables **data-driven testing** via Excel files using Apache POI.
- Integrated **ExtentReports** for generating visually rich and detailed test execution reports.
- Follows **modular design principles** to ensure scalability and easy maintenance.

## How to Run the Tests

1. Clone the repository:
  
   git clone https://github.com/your-username/swaglabs-cucumber-bdd.git
   cd swaglabs-cucumber-bdd

2. Install dependencies and build the project:

  mvn clean install

3. Run the test suite using Maven:

  mvn test
  
4. View the generated ExtentReports under target/ExtentReports

Author
Aashish Kumar
---
