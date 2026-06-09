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
public class Main02 
{
    Scanner sc = new Scanner(System.in);
    int choice;
    

    public static void main(String[] args) 
    {
      Main02 m1 = new Main02();
       m1.menu();
        
    }
    
    void menu()
{
    do{
     System.out.println("Traffic Signal System");
     System.out.println("1.Show Signal System");
     System.out.println("2.Check Stop or Go");
     System.out.println("3.Exit");
     System.out.print("Enter the Choice : ");
     choice = sc.nextInt();
     switch (choice)
     {
         case 1:
         {
             for(Traffic t : Traffic.values())
             {
                 if(t==Traffic.RED)
                 {
                     System.out.println("RED - Stop");
                 }
                 
                 else if(t==Traffic.YELLOW)
                 {
                     System.out.println("Yellow - Wait");
                 }
                 
                 else if(t==Traffic.GREEN)
                         {
                             System.out.println("Green - Go");
                         }
             }
             break;
         }
         
         case 2 :
         {
             sc.nextLine();
             System.out.println("Enter the signal ");
             String input = sc.nextLine();
             Traffic t1 = Traffic.valueOf(input);
             
             if(t1 ==Traffic.RED)
             {
                 System.out.println("Stop");
             }
             
             else if(t1 == Traffic.YELLOW)
             {
                 System.out.println("Wait");
             }
             
             else if(t1 == Traffic.GREEN)
             {
                 System.out.println("GO");
             }
             break;
             
         }
         
         case 3 :
         {
             System.out.println("Exit");
             break;
         }
         
     }
     
     
    }while(choice!=3);
     
}

   
    
}

