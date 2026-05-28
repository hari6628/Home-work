/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework;

/**
 *
 * @author harin
 */
public class Stack 
{
    String ar[] = new String [5];
    int top;
    
    Stack()
    {
        top = -1;
    }
    
    void push(String item)
    {
        if(top == 4)
        {
            System.out.println("Item full");
        }
        
        else
        {
            top++;
            ar[top] = item;
            System.out.println("Item added : "+item);
        }
    }
    
    void pop()
    {
        if(top== -1)
          {
              System.out.println("Empty");
                    
          }
        
        else
        {
            System.out.println(ar[top]+"removed");
            top--;
        }
    }
    
    void peek()
    {
      if(top== -1)
          {
              System.out.println("Empty");
                    
          }
        
        else
        {
            System.out.println(ar[top]+"Last item");
           
        }  
    }
    
    void display()
    {
        if(top== -1)
          {
              System.out.println("Empty");
                    
          }
        
        else
        {
            System.out.println("Scanned items : ");
            for(int i = top; i>=0; i--)
            {
                System.out.println(ar[i]);
            }
        }
    }
    
    void isEmpty()
    {
        if(top== -1)
          {
              System.out.println("Empty");
                    
          }
        
        else
        {
            System.out.println("Not empty");
        }
    }
}
