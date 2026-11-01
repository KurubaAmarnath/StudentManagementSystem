# Student Management System

A **console-based Java application** for managing student records, built to demonstrate the **practical implementation of Object-Oriented Programming (OOP) concepts**.

---

## Overview

The Student Management System allows users to perform **complete record-management operations** on student data through a simple console menu. The project follows a **package-based structure**, separating the model, service, interface, exception and application layers for **clean and maintainable design**.

---

## Features

| Feature | Description |
|---|---|
| **Add Student** | Register a new student with personal and academic details |
| **Display All Students** | View every stored student record |
| **Search Student by ID** | Retrieve a specific student using their **unique ID** |
| **Update Student Details** | Modify the information of an existing student |
| **Delete Student** | Remove a student record from the system |
| **Calculate Student Grade** | Automatically determine the grade from marks |
| **Display Student Results** | Show marks along with the resulting grade |
| **Track Total Students** | Maintain a live count of registered students |

---

## Technologies

- **Java**
- **Object-Oriented Programming**
- **Java Collections Framework**

---

## OOP Concepts Covered

| Concept | Description |
|---|---|
| **Class & Object** | Creating and managing student objects |
| **Encapsulation** | Data hiding using **private fields** with controlled access |
| **Inheritance** | Reusing common properties through a **parent class** |
| **Abstraction** | Defining **abstract classes** to hide implementation details |
| **Polymorphism** | Implementing **method overriding** for specialised behaviour |
| **Interfaces** | Defining **common behaviours** across classes |
| **Constructors** | Initialising student objects with required data |
| **Static** | Maintaining a shared **student counter** |
| **Final** | Restricting modification and inheritance |
| **Records** | Representing **immutable** student addresses |
| **Enum** | Defining fixed **student grade** values |
| **Composition** | Building object relationships (a student **has an** address) |
| **Collections** | Managing student records using **ArrayList** |
| **Exception Handling** | Handling errors with **custom exceptions** |

---

## Project Structure

```
StudentManagementSystem/
│
├── src/
│   ├── app/
│   │   └── Main.java
│   │
│   ├── model/
│   │   ├── Address.java
│   │   ├── Person.java
│   │   ├── Student.java
│   │   └── StudentGrade.java
│   │
│   ├── interfaces/
│   │   └── Printable.java
│   │
│   ├── service/
│   │   └── StudentService.java
│   │
│   └── exception/
│       └── StudentNotFoundException.java
│
├── .gitignore
└── README.md
```

---

## Package Description

| Package | Purpose |
|---|---|
| **app** | Contains the **entry point** of the application |
| **model** | Contains the **data classes** that represent students and related details |
| **interfaces** | Contains **interfaces** that define common behaviour |
| **service** | Contains the **business logic** and CRUD operations |
| **exception** | Contains **custom exceptions** for application-specific errors |

### File Descriptions

| Package | File | Purpose |
|---|---|---|
| **app** | **Main.java** | **Entry point** with the console menu |
| **model** | **Address.java** | **Record** that holds a student's address details |
| **model** | **Person.java** | **Abstract base class** with common personal attributes |
| **model** | **Student.java** | Extends `Person`; stores **academic details** and implements `Printable` |
| **model** | **StudentGrade.java** | **Enum** representing the possible grades |
| **interfaces** | **Printable.java** | **Interface** defining a common display behaviour |
| **service** | **StudentService.java** | **Business logic** and CRUD operations on the student list |
| **exception** | **StudentNotFoundException.java** | **Custom exception** for missing student records |

---

## Application Modules

| No. | Module | Responsibility |
|---|---|---|
| 1 | **Student Management** | Handles student records |
| 2 | **Student Information** | Maintains student details |
| 3 | **Grade Management** | Calculates grades based on marks |
| 4 | **Record Management** | Supports **CRUD** operations (Create, Read, Update, Delete) |
| 5 | **Student Services** | Handles application operations and coordinates all modules |

---

## How It Works

```
Main (app)  -->  StudentService (service)  -->  ArrayList<Student>
                                                       |
                                      Student extends Person        (model)
                                      Student has an Address        (model, record)
                                      Student has a StudentGrade    (model, enum)
                                      Student implements Printable  (interfaces)
```

- **Main** displays the menu and receives user input.
- **StudentService** performs the requested operation on the student collection.
- If an ID does not exist, **StudentNotFoundException** is thrown and handled gracefully.

---

## License

This project is intended for **learning and educational purposes**.