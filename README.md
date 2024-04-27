# Lecturer Management System
## Overview
This Java application, named "Question__1__2," is designed to manage information about lecturers and their details. It consists of several classes that handle various operations related to creating, reading, linking, and deleting lecturer names, as well as managing lecturer details in a database.

## Classes
### Question__1__2
This class serves as the entry point for the application. It initializes arrays for lecturer names and Eduvos campuses, creates instances of Question1 and Question2 classes, and calls methods to perform operations on lecturer names and details.

### Question1
The Question1 class manages operations related to lecturer names. It utilizes a HashMap to store lecturer names (first name as key, last name as value) and provides methods to:

Create a text file with lecturer names.
Read the text file.
Link names in the HashMap.
Display information from the HashMap.
Delete a specific lecturer from the HashMap.

### Question2
The Question2 class handles operations related to lecturer details in a database. It connects to a MySQL database (lecturer) using JDBC and provides functionality to:

Insert lecturer details (first name, last name, random campus) into the lecturerDetails table in the database.
Select and display all lecturer details from the lecturerDetails table.

### Purpose
This application is designed for educational or project purposes, focusing on the management of lecturer information. It demonstrates concepts such as file handling, data structures (e.g., HashMap), database connectivity using JDBC, and basic CRUD operations (Create, Read, Update, Delete) on lecturer data.

### Setup
To run this application, ensure that you have Java installed on your system. Additionally, configure the MySQL database (lecturer) with the provided schema and credentials (USERNAME: root, PASSWORD: Jobaria@4).

### Usage
1. Compile the Java files using a Java compiler.
2. Run the Question__1__2 class to execute the application.
3. Follow the prompts and instructions to perform operations on lecturer names and details.
