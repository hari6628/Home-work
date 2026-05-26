/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist1;

/**
 *
 * @author harin
 */
public class Linkedlist1
{
    
    public static void main(String[] args) 
    {
        DoublyLinkedList d = new DoublyLinkedList();

        d.insertEnd(10);
        d.insertEnd(20);
        d.insertEnd(40);
        d.insertEnd(50);

        d.insertMiddle(3,30);

        d.display();
    }
    
}
