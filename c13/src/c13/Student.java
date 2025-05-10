/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13;

/**
 *
 * @author USER
 */
// Subclass (inherits from Person)
class Student extends Person {
    String matricNo;

    // Constructor
    public Student(String name, int age, String matricNo) {
        super(name, age);  // Call the constructor of the superclass
        this.matricNo = matricNo;
    }

    // Method to display student info (extends the parent method)
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the superclass method
        System.out.println("Matric Number: " + matricNo);
    }
}