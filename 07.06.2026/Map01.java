/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Junes7;

import java.util.HashMap;

/**
 *
 * @author harin
 */
public class Map01
{
    public static void main(String[] args) 
    {
        HashMap h1 = new HashMap();
         h1.put("One", 1);
          h1.put("Two", 2);
          h1.put("Three", 3);
          h1.put("Four", 4);
          h1.put("Five", 5);
          
          System.out.println(h1.get("Two"));
          h1.put("Three", 30);
          h1.remove("Four");
          
          for(Object o1 : h1.keySet())
          {
              System.out.println(o1+" Value "+ "Key "+h1.get(o1));
          }
          
        
    }
    
}
