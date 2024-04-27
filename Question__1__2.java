/*
Project Name: LecturerManagementDatabase
Created on: 26 May 2023
Created By: Katiana Mendes Brito de Almeida.
Purpose: This script is used to input the String of arrays into the programs
question1 and question2
Class Name: Question__1__2
*/
package com.mycompany.question__1__2;
/**
*
* @author Katia
*/
public class Question__1__2 {
 private String firstNames [] = 
{"Arsene","Aubin","Tariro","Vusumusi","Ian","Gomomela","Ishmael","Marc"};
 private String lastNames [] = 
{"Mpiana","Tshiyole","Bonyongwa","Moyo","Masaga","Bokaba","Maronga","Kishinkwa"};
 private String eduvosCampuses[] = {"Bedfordview", "Bloemfontein", "Claremont", "Durban", 
"Nelson Mandela Bay", "Midrand", "Pretoria"}; 
 
 public static void main(String[] args) {
 Question__1__2 object = new Question__1__2();
 Question1 question1 = new Question1();
 Question2 question2 = new Question2();
 
 // Question number 1
 question1.createTextFile(object.firstNames, object.lastNames);
 System.out.printf("%-15s%n","1.1 Lecturer Names");
 question1.readTextFile();
 System.out.printf("%-15s%n","1.2 Link Lecturer Names");
 question1.linkName(object.firstNames,object.lastNames);
 question1.displayInformation(question1.getHashMap());
 
 System.out.printf("%-15s%n","1.3 Delete Arsene Mpiana");
 question1.deleteName("Arsene","Mpiana");
 question1.displayInformation(question1.getHashMap());
 
 // Question number 2
 question2.addIntoLecturesDetails(object.eduvosCampuses,question1.getHashMap());
 System.out.printf("%-15s%n","2.3 Inserting the lecturer details into the database 
sucessfully!!");
 System.out.printf("%-15s%n","2.4 All lecturers that are stored in the database");
 question2.selectFromLectureDetails();
 }
}
