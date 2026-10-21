# Student-Management-System
A console-based Student Management System built using Core Java.

# Student Management System

A console-based Student Management System built using Core Java. This project demonstrates object-oriented programming, collections, input validation, and exception handling through a practical student record management application.

## Project Overview

The Student Management System is a menu-driven Java application that allows users to manage student records through a command-line interface.

Users can add new students, view all registered students, search for a student by ID, and delete student records.

## Features

- **Add Student:** Register a student using their ID, name, and course.
- **View All Students:** Display all registered student records.
- **Search Student:** Find a student using their unique ID.
- **Delete Student:** Remove a student record by ID.
- **Input Validation:** Handle invalid inputs and require valid student information.
- **Duplicate ID Prevention:** Prevent multiple students from using the same ID.
- **Interactive Menu:** Navigate through the available operations using a console menu.

## Technologies Used

- Java (JDK 21)
- Object-Oriented Programming (OOP)
- Java Collections Framework (`ArrayList`)
- Exception Handling (`try-catch`)
- `Scanner` for user input
- Visual Studio Code
- Command-Line Terminal

## Project Structure

```text
Student-Management-System/
├── Main.java
├── Student.java
└── README.md
```

The repository may contain additional files, such as `.class` files, depending on what was uploaded.

## How to Run the Project

### Prerequisites

- Install JDK 21 or another compatible JDK.
- Ensure Java commands are available in your terminal.

### Execution Steps

1. Clone or download this repository.
2. Open a terminal in the folder containing `Main.java` and `Student.java`.
3. Compile the Java source files:

   ```bash
   javac Main.java Student.java
   ```

4. Start the application:

   ```bash
   java Main
   ```

5. Follow the menu displayed in the terminal.

## Sample Application Walkthrough

The following examples demonstrate how a user can interact with the application. The output format may vary slightly depending on the implementation.

### 1. Main Menu

When the program starts, the user can choose an operation.

```text
===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student
5. Exit

Enter your choice: 1
```

### 2. Add a Student

The application requests the student's ID, name, and course.

```text
Enter Student ID: 101
Enter Student Name: Rahul
Enter Student Course: Computer Science

Student added successfully!
```

Another student can be registered in the same way:

```text
Enter Student ID: 102
Enter Student Name: Priya
Enter Student Course: Information Technology

Student added successfully!
```

### 3. View All Students

Choose the option to display the registered student records.

```text
Enter your choice: 2

===== Student Records =====
ID: 101
Name: Rahul
Course: Computer Science

ID: 102
Name: Priya
Course: Information Technology
```

### 4. Search for a Student

Enter the ID of the student you want to find.

```text
Enter your choice: 3
Enter Student ID to search: 102

Student Found!
ID: 102
Name: Priya
Course: Information Technology
```

If the ID does not exist, the application should report that the student was not found.

### 5. Delete a Student

Enter the ID of the student you want to remove.

```text
Enter your choice: 4
Enter Student ID to delete: 102

Student deleted successfully!
```

You can then select **View All Students** to confirm that the record has been removed.

### 6. Exit the Application

```text
Enter your choice: 5

Exiting Student Management System...
```

## Concepts Practiced

- Classes and objects
- Constructors and methods
- Encapsulation using private fields and getters
- `ArrayList` for storing student records
- Loops and conditional statements
- User input with `Scanner`
- Exception handling and input validation
- Basic CRUD operations:
  - **Create:** Add student records
  - **Read:** View and search student records
  - **Delete:** Remove student records

## Current Limitations

- Student records are stored in memory using an `ArrayList`.
- Records are not saved permanently; they are lost when the application exits.
- The application currently operates through a command-line interface.
- The project does not currently use a database.

## Future Improvements

- Integrate MySQL for permanent data storage.
- Add file handling to save and retrieve student records.
- Develop a graphical or web-based interface.
- Build REST APIs using Spring Boot.
- Add automated unit tests.

## Learning Outcomes

This project provided practical experience in Core Java, object-oriented programming, collections, exception handling, and implementing basic record-management operations.

It is an ongoing learning project that I plan to improve as I develop my software engineering skills.

## Author

B.Tech Computer Science and Engineering Student  
Aspiring Software Engineer  
Interested in Java Development and Software Engineering Internships
