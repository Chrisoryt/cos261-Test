/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2;

/**
 *
 * @author USER
 */
public class strings {
public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println("Using == : " + (s1 == s2));          // false
        System.out.println("Using .equals(): " + s1.equals(s2)); // true

        String s3 = "World";
        String s4 = "World";

        System.out.println("Using == : " + (s3 == s4));          // true (String pool optimization)
        System.out.println("Using .equals(): " + s3.equals(s4)); // true
    }
}

    
    
}
