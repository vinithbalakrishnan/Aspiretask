package com.aspiresys;

import java.util.HashMap;
import java.util.Map;

public class Hostel {
    private final int totalRooms;
    private final Map<String, Student> students;
    private final boolean[] roomAvailability;

    public Hostel(int totalRooms) {
        this.totalRooms = totalRooms;
        this.students = new HashMap<>();
        this.roomAvailability = new boolean[totalRooms];
        for (int i = 0; i < totalRooms; i++) {
            roomAvailability[i] = true; // All rooms are initially available
        }
    }

    public void registerStudent(String studentId, String name) {
        for (int i = 0; i < totalRooms; i++) {
            if (roomAvailability[i]) {
                roomAvailability[i] = false; // Room is now occupied
                Student student = new Student(studentId, name, i + 1); // Room number starts at 1
                students.put(studentId, student);
                System.out.println("Student " + name + " is assigned to room " + (i + 1));
                return;
            }
        }
        System.out.println("No rooms available.");
    }

    // Method to display details of a student
    public void displayStudentDetails(String studentId) {
        if (students.containsKey(studentId)) {
            System.out.println(students.get(studentId));
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to handle fee payment for a student
    public void payFee(String studentId, double amount) {
        if (students.containsKey(studentId)) {
            Student student = students.get(studentId);
            student.payFee(amount);
            System.out.println("Fee of " + amount + " paid. Total fee paid: " + student.getFeePaid());
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display details of all registered students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students are registered.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }

    // Method to free a room when a student leaves
    public void freeRoom(String studentId) {
        if (students.containsKey(studentId)) {
            Student student = students.remove(studentId);
            roomAvailability[student.getRoomNumber() - 1] = true; // Free the room
            System.out.println("Room " + student.getRoomNumber() + " is now free.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
