/*
Project Name: Question__1__2
Created on: 30 May 2023
Created By: Katiana Mendes Brito de Almeida.
Purpose: Here we are adding the lectures into and selecting from the database
Class Name: Question2
*/
package com.mycompany.question__1__2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Random;
/**
*
* @author Katia
*/
public class Question2 {
 private String firstName, lastName, campus;
 private static final String URL = "jdbc:mysql://localhost:3307/lecturer";
 private static final String USERNAME = "root";
 private static final String PASSWORD = "Jobaria@4";
 private Connection connection;
 private PreparedStatement insertLectureDetails;
 private PreparedStatement selectLectureDetails;
 private Random randomNumber = new Random();
 private int index;
 public Question2() {
 try {
 connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
 insertLectureDetails = connection.prepareStatement("INSERT INTO lecturerDetails 
(lecturerFirstName, lecturerLastName, campusName) VALUES (?, ?, ?)");
 selectLectureDetails = connection.prepareStatement("SELECT * FROM 
lecturerDetails");
 } catch (SQLException sqlException) {
 System.out.println("Failed to connect to the database!!");
 System.exit(1);
 }
 }
 /**
 * Add lecturer details and random campus name into the database
 */
 public void addIntoLecturesDetails(String eduvosCampuses[], HashMap<String, String> 
hashMapValue) {
 try {
 for (String key : hashMapValue.keySet()) {
 index = randomNumber.nextInt(6);
 insertLectureDetails.setString(1, key);
 insertLectureDetails.setString(2, hashMapValue.get(key));
 insertLectureDetails.setString(3, eduvosCampuses[index]);
 insertLectureDetails.executeUpdate();
 }
 } catch (SQLException sqlException) {
 System.out.println("Failed to add values into the database!!");
 System.exit(1);
 }
 }
 /**
 * select all the values from the LectureDetails table
 */
 public void selectFromLectureDetails() {
 try (ResultSet resultSet = selectLectureDetails.executeQuery()) {
 System.out.println("-*/".repeat(25));
 while (resultSet.next()) {
 firstName = resultSet.getString("lecturerFirstName");
 lastName = resultSet.getString("lecturerLastName");
 campus = resultSet.getString("campusName");
 System.out.printf("{%s,%s=%s}%n", firstName, lastName, campus);
 }
 System.out.println("");
 } catch (SQLException sqlException) {
 System.out.println("Failed to select values from the database!!");
 System.exit(1);
 }
 }
 public void close() {
 try {
 connection.close();
 } catch (SQLException sqlException) {
 sqlException.getSQLState();
 sqlException.getErrorCode();
 }
 }
}
