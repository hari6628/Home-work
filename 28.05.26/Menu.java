/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework_1;

/**
 *
 * @author harin
 */
import java.util.Scanner;
public class Menu
{
    void Scan(Queue q1)
    {
        Scanner sc = new Scanner(System.in);
        boolean res = true;
        do{
      System.out.println("1.Add item"); 
         System.out.println("2.Remove the last item"); 
          System.out.println("3.Display the top item"); 
           System.out.println("4.Display all");
               System.out.println("5.Exit");
            System.out.print("Enter the choice : ");
           int choice = sc.nextInt();
           
              if(choice == 1)
              {
                  sc.nextLine();
                  System.out.print("Enter the item : ");
                  String item = sc.nextLine();
                  q1.add(item);
              }
              
              else if (choice == 2)
              {
                  q1.remove();
              }
              
              else if (choice == 3)
              {
                  q1.peek();
              }
              
              else if (choice == 4)
              {
                  q1.display();
              }
              
              else if (choice == 5)
              {
                  q1.isEmpty();
              }
              
              else
              {
                  System.out.println("Exit");
                  res = false;
              }
           }while (res);
    }
        
    }
    

