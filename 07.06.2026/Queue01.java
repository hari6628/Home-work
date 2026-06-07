/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Junes7;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author harin
 */
public class Queue01 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q1 = new LinkedList<>();
        
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        
        System.out.println("Queue "+q1);
        
        q1.remove(30);
        
        System.out.println("Front element : "+q1.peek());
        System.out.println("Check queue is empty "+q1.isEmpty());
        
    }
    
}
