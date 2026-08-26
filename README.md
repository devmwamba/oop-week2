# OOP Week 2 Lab — Blueprints, Objects & Your First Test

A Java Object-Oriented Programming lab focused on classes, objects, object state and behaviour, and unit testing with JUnit.

## Overview

This lab builds on the concepts introduced in Week 1 by moving from simple Java programs to a properly structured Maven project.

The lab covers:

- Creating a Maven project
- Creating classes and objects
- Understanding instantiation using `new`
- Working with object state through attributes
- Defining object behaviour through methods
- Using the dot (`.`) operator to access object members
- Understanding that objects created from the same class have independent state
- Writing unit tests with JUnit
- Using Arrange, Act, Assert (AAA)
- Deliberately introducing a bug and using a test to detect it
- Creating a second class independently and testing it

## Technologies Used

- Java 17
- Apache Maven
- JUnit 6
- VS Code
- Git & GitHub

## Project Structure

```text
Week 2/
├── pom.xml
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── oop/
    │               ├── BankAccount.java
    │               ├── Main.java
    │               └── Student.java
    │
    └── test/
        └── java/
            └── com/
                └── oop/
                    ├── BankAccountTest.java
                    └── StudentTest.java
