/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c18;

/**
 *
 * @author USER
 */
public class WithDRY {
    public static void greet(String name) {
        System.out.println("welcome, " + name + "!");
    }

    public static void main(String[] args) {
        // Call the method instead of repeating code
        greet("chris");
        greet("kenethe");
        greet("somuadina");
    }
}
