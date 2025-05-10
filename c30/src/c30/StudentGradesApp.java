/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesApp {

    private static Map<String, Double> studentGrades = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Grades Tracker!");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudentGrade();
                    break;
                case "2":
                    updateStudentGrade();
                    break;
                case "3":
                    viewStudentGrades();
                    break;
                case "4":
                    System.out.println("Exiting application. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. Add student grade");
        System.out.println("2. Update student grade");
        System.out.println("3. View all student grades");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }

    private static void addStudentGrade() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();

        if (studentGrades.containsKey(name)) {
            System.out.println("Student already exists. Use update option to modify the grade.");
            return;
        }

        Double grade = readGrade();
        if (grade != null) {
            studentGrades.put(name, grade);
            System.out.println("Added " + name + " with grade " + grade);
        }
    }

    private static void updateStudentGrade() {
        System.out.print("Enter student name to update: ");
        String name = scanner.nextLine().trim();

        if (!studentGrades.containsKey(name)) {
            System.out.println("Student not found. Use add option to add new student.");
            return;
        }

        Double grade = readGrade();
        if (grade != null) {
            studentGrades.put(name, grade);
            System.out.println("Updated " + name + "'s grade to " + grade);
        }
    }

    private static void viewStudentGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nStudent Grades:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        }
    }

    private static Double readGrade() {
        System.out.print("Enter grade (0.0 - 100.0): ");
        String input = scanner.nextLine().trim();

        try {
            double grade = Double.parseDouble(input);
            if (grade < 0.0 || grade > 100.0) {
                System.out.println("Grade must be between 0.0 and 100.0.");
                return null;
            }
            return grade;
        } catch (NumberFormatException e) {
            System.out.println("Invalid grade input. Please enter a numeric value.");
            return null;
        }
    }
}

