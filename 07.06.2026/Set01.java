/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Junes7;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author harin
 */
public class Set01 
{
    public static void main(String[] args) 
    {
        Set<Integer> s1 =new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(20);
        
        System.out.print("Set Elements "+s1);
        System.out.println();
        System.out.println(s1.contains(10));
        s1.remove(40);
        
        for(Object o1 : s1)
        {
            System.out.println(o1);
        }
        
        
        
    }
    
}
