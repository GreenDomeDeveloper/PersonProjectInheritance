# PersonProject

## Project Overview
This project demonstrates object-oriented programming concepts in Java, featuring two main classes:

### Person Class
- Represents a basic person with the following attributes:
  * `name` (String): The person's name
  * `age` (int): The person's age
- Provides the following functionality:
  * Constructors:
    - Default constructor (sets name to "John Doe" and age to 42)
    - Parameterized constructor to set custom name and age
  * Getter and setter methods for name and age
  * `hasBirthday()` method to increment age
  * `toString()` method for string representation
  * Implements `Comparable` interface to allow sorting by age

### Student Class (Inherits from Person)
- Extends the Person class with an additional attribute:
  * `gpa` (double): The student's Grade Point Average
- Additional functionality:
  * Constructors:
    - Default constructor (calls Person default constructor, sets GPA to 3.0)
    - Parameterized constructor to set name, age, and GPA
  * Getter and setter methods for GPA
  * Overridden `toString()` method to include GPA information

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE or command-line compiler

## Building the Project
1. Ensure you have JDK installed
2. Clone the repository
3. Navigate to the project directory

### Compiling via Command Line
```bash
# Compile all Java files
javac *.java
```

## Running the Program
```bash
# Run the Main class
java Main
```

## Project Features Demonstrated
- Object-Oriented Programming
- Inheritance
- Method Overriding
- Interface Implementation (Comparable)
- Basic Object Manipulation
- Sorting Collections

## License
This project is licensed under the MIT License. See the LICENSE file for details.