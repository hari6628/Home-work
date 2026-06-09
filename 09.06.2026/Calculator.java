/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June9_1;

/**
 *
 * @author harin
 */
public class Calculator <T extends Number> {
     void add(T a, T b) {
        System.out.println("Result: " + (a.doubleValue() + b.doubleValue()));
    }

    void subtract(T a, T b) {
        System.out.println("Result: " + (a.doubleValue() - b.doubleValue()));
    }
    
}
