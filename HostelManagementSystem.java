package com.aspiresys;

import java.util.Scanner;


public class HostelManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Hostel hostel = new Hostel(5); // Hostel with 5 rooms

     while (true) {
         System.out.println("\n--- Hostel Management System ---");
         System.out.println("1. Register Student");
         System.out.println("2. Display Student Details");
         System.out.println("3. Pay Fee");
         System.out.println("4. Display All Students");
         System.out.println("5. Free Room");
         System.out.println("6. Exit");

         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); 

         switch (choice) {
             case 1: // Register a new student
                 System.out.print("Enter Student ID: ");
                 String studentId = scanner.nextLine();
                 System.out.print("Enter Student Name: ");
                 String name = scanner.nextLine();
                 hostel.registerStudent(studentId, name);
                 break;

             case 2: // Display student details
                 System.out.print("Enter Student ID: ");
                 studentId = scanner.nextLine();
                 hostel.displayStudentDetails(studentId);
                 break;

             case 3: // Pay fee for a student
                 System.out.print("Enter Student ID: ");
                 studentId = scanner.nextLine();
                 System.out.print("Enter amount to pay: ");
                 double amount = scanner.nextDouble();
                 hostel.payFee(studentId, amount);
                 break;

             case 4: // Display all students
                 hostel.displayAllStudents();
                 break;

             case 5: // Free a room
                 System.out.print("Enter Student ID to free room: ");
                 studentId = scanner.nextLine();
                 hostel.freeRoom(studentId);
                 break;

             case 6: // Exit the program
                 System.out.println("Exiting system. Goodbye!");
                 scanner.close();
                 return;

             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}
