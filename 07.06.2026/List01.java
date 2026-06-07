/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Junes7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harin
 */
public class List01 
{
    public static void main(String[] args)
    {
        List<Integer> l1 =new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        
        l1.add(2, 6);
        l1.remove(Integer.valueOf(5));
        l1.set(0, 7);
        
        for(Object o1 : l1)
        {
            System.out.println(o1);
        }
        
        
    }
    
}
