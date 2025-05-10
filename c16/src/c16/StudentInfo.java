/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c16;

/**
 *
 * @author USER
 */
// Class name uses PascalCase
class StudentInfo {
    // Variable names use camelCase
    String studentName;
    int studentAge;

    // Constructor
    public StudentInfo(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    // Method name uses camelCase
    public void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}
