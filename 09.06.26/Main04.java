/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June9;

import java.util.Scanner;

/**
 *
 * @author harin
 */
public class Main04
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int choice;
        
        do
        {
            System.out.println("Order Status Tracking");
     System.out.println("1.Show Order Status");
     System.out.println("2.Check Order is   Completed");
     
     System.out.println("3.Exit");
     System.out.print("Enter the Choice : ");
     choice = sc.nextInt();
     switch (choice)
     {
         case 1:
         {
             System.out.println("Order Status");
             for(Status s1 : Status.values())
             {
                 System.out.println(s1);
             }
             break;
         }
         
         case 2 :
         {
             sc.nextLine();
             System.out.print("Enter the order status : ");
             String order = sc.nextLine();
             
             Status s2 = Status.valueOf(order);
             
             if(s2==Status.DELIVERED)
             {
                 System.out.println("Order Completed");
             }
             
             else if(s2==Status.CANCELLED)
             {
                 System.out.println("Order not Completed");
             }
             else if(s2==Status.PLACED)
             {
                 System.out.println("Order Still in progress");
             }
             else 
             {
                 System.out.println("Order Still in progress");
             }
             break;
         }
         
         case 3 :
         {
             System.out.println("Exit");
         }
        
    }
      }while(choice !=3);
}
    
}
