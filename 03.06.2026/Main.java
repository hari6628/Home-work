/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three;

/**
 *
 * @author harin
 */
public class Main {
    public static void main(String[] args) 
    {
        FirstThread f1 = new FirstThread();
        SecondThread s1 = new SecondThread();
        
        Thread t1 = new Thread (f1);
        Thread t2 = new Thread (s1);
        
        t1.start();
        t2.start();
        
    }
    
}
