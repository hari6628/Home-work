/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist1;

/**
 *
 * @author harin
 */
public class DoublyLinkedList 
{
    Node head;

    void insertEnd(int data)
    {
        Node n = new Node(data);

        if(head==null)
        {
            head=n;
        }
        else
        {
            Node temp=head;

            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=n;
            n.prev=temp;
        }
    }

    void insertMiddle(int pos,int data)
    {
        Node n = new Node(data);

        Node temp=head;

        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }

        n.next=temp.next;
        n.prev=temp;

        if(temp.next!=null)
        {
            temp.next.prev=n;
        }

        temp.next=n;
    }

    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }

        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }

        System.out.println("NULL");
    }
}
