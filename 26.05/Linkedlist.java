/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist_1;

/**
 *
 * @author harin
 */
public class Linkedlist 
{
    public static void main(String[] args) 
    {
        
        CircularDoublyLinkedList c = new CircularDoublyLinkedList();

        c.insertHead(20);
        c.insertHead(10);

        c.insertTail(40);

        c.insertMiddle(3,30);

        c.display();
    }
    
}
