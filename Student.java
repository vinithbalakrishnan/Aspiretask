package com.aspiresys;

//Student.java - Class to represent student details
public class Student {
 private String studentId;
 private String name;
 private int roomNumber;
 private double feePaid;

 // Constructor to initialize a student's details
 public Student(String studentId, String name, int roomNumber) {
     this.studentId = studentId;
     this.name = name;
     this.roomNumber = roomNumber;
     this.feePaid = 0.0; // Initially, the fee paid is 0
 }

 // Getter and Setter methods for feePaid
 public void payFee(double amount) {
     this.feePaid += amount;
 }

 public double getFeePaid() {
     return feePaid;
 }

 // Getter methods for other attributes
 public String getStudentId() {
     return studentId;
 }

 public String getName() {
     return name;
 }

 public int getRoomNumber() {
     return roomNumber;
 }

 // Method to display student details
 @Override
 public String toString() {
     return "Student ID: " + studentId + ", Name: " + name + ", Room: " + roomNumber + ", Fee Paid: " + feePaid;
 }
}
