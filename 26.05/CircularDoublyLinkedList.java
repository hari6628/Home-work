/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist_1;

/**
 *
 * @author harin
 */
public class CircularDoublyLinkedList 
{
    Node head;

    void insertHead(int data)
    {
        Node n = new Node(data);

        if(head==null)
        {
            head=n;
            head.next=head;
            head.prev=head;
        }
        else
        {
            Node tail=head.prev;

            n.next=head;
            n.prev=tail;

            tail.next=n;
            head.prev=n;

            head=n;
        }
    }

    void insertTail(int data)
    {
        Node n = new Node(data);

        if(head==null)
        {
            head=n;
            head.next=head;
            head.prev=head;
        }
        else
        {
            Node tail=head.prev;

            tail.next=n;
            n.prev=tail;

            n.next=head;
            head.prev=n;
        }
    }

    void insertMiddle(int pos,int data)
    {
        Node n = new Node(data);

        if(head==null)
        {
            head=n;
            head.next=head;
            head.prev=head;
        }
        else
        {
            Node temp=head;

            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }

            n.next=temp.next;
            n.prev=temp;

            temp.next.prev=n;
            temp.next=n;
        }
    }

    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }

        Node temp=head;

        do
        {
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        while(temp!=head);

        System.out.println("(HEAD)");
    }
}
