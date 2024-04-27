/*
Project Name: LecturerManagementDatabase
Created on: 26 May 2023
Created By: Katiana Mendes Brito de Almeida.
Purpose: This script is used to create and read a text file, create and display a 
hashmap
 and delete a hashmap element (one element at time)
Class Name: Question1
*/
package com.mycompany.question__1__2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
* @author Katia
*/
public class Question1 {
 private HashMap<String, String> hashMap = new HashMap<>();
 public Question1() {
 }
 public Question1(HashMap<String, String> hashMap) {
 this.hashMap = hashMap;
 }
 /**
 * Create a text file with firstNames and lastNames values
 */
 public void createTextFile(String firstNames[], String lastNames[]) {
 try (Formatter storeValues = new Formatter("lecturer.txt")) {
 for (int index = 0; index < firstNames.length; index++) {
 storeValues.format("%s,%s%n", firstNames[index], lastNames[index]);
 }
 } catch (FileNotFoundException ex) {
 Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
 System.exit(1);
 }
 }
 /**
* read text file
 */
 public void readTextFile() {
 try (Scanner printValue = new Scanner(Paths.get("lecturer.txt"))) {
 System.out.println("-".repeat(25));
 while (printValue.hasNext()) { // while there is more to read
 System.out.printf("%s%n", printValue.next());
 }
 System.out.println("");
 } catch (IOException ex) {
 Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
 System.exit(1);
 }
 }
 /**
 *
 * creates a hashMap with with firstNames and lastNames values
 */
 public void linkName(String firstNames[], String lastNames[]) {
 for (int index = 0; index < firstNames.length; index++) {
 hashMap.put(firstNames[index], lastNames[index]);
 }
 setHashMap(hashMap);
 }
 /**
 * displays the content of a hashMap
 */
 public void displayInformation(HashMap<String, String> hashMap) {
 System.out.println("-".repeat(25));
 for (String key : hashMap.keySet()) {
 System.out.printf("{%s=%s}%n", key, hashMap.get(key));
 }
 System.out.println("");
 }
 /**
 * delete one element from the hashMap
 */
 public void deleteName(String key, String value) {
 hashMap.remove(key, value);
 }
 public void setHashMap(HashMap<String, String> hashMap) {
 this.hashMap = hashMap;
 }
 public HashMap<String, String> getHashMap() {
 return hashMap;
 }
}
