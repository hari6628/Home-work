/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework_1;

/**
 *
 * @author harin
 */
public class Queue 
{
    String ar[] = new String [3];
    int front;
    int rear;
    
    
    Queue()
    {
        front = -1;
        rear = -1;
    }
    
    void add(String item)
    {
        if(rear == 2)
        {
            System.out.println("Order full");
        }
        
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear++;
            ar[rear] = item;
            System.out.println("Order added "+item);
        }
    }
    
    void remove()
    {
        if(front == -1|| front > rear)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Served order "+ar[front]);
            front ++;
        }
    }
    
    void peek()
    {
        if(front == -1|| front > rear)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Next order "+ar[front]);
           
        }
    }
    
    void display()
    {
        if(front == -1|| front > rear)
        {
            System.out.println("No pending");
        }
        else
        {
            System.out.println(" Pending Orders");
            for(int i = front; i<= rear; i++)
            {
                System.out.println(ar[i]);
            }
        }
    }
    
       void isEmpty()
    {
        if(front == -1|| front > rear)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue is not Empty ");
           
        }
    }
    
}
