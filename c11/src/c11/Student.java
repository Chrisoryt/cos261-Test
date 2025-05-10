/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11;

/**
 *
 * @author USER
 */


   
    
      class Student {
    // Properties
    String name;
    String matricNo;
    double score;

    // Constructor
    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
    }
}
    
    
