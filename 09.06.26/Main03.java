/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June9;

import java.util.Scanner;


public class Main03 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int choice;
        
        do
        {
            System.out.println("Traffic Signal System");
     System.out.println("1.Check Working day");
     System.out.println("2.Check Weekend");
     System.out.println("3.Display all Days");
     System.out.println("4.Exit");
     System.out.print("Enter the Choice : ");
     choice = sc.nextInt();
     switch (choice)
     {
         case 1:
         {
             sc.nextLine();
             
               System.out.print("Enter the Day : ");
             String day = sc.nextLine();
             
             Days01 d1 = Days01.valueOf(day);
             
             if(d1 == Days01.MONDAY || d1==Days01.TUESDAY || d1==Days01.WEDNESDAY
                 || d1 == Days01.THURSDAY ||   d1 == Days01.FRIDAY)
             {
                 System.out.println("Working Day");
             }
             
             else 
             {
                 System.out.println("Weekend");
             }
             break;
    
         }
         
         
         case 2 :
         {
             sc.nextLine();
             System.out.print("Enter the Day : ");
             String day = sc.nextLine();
             
             Days01 d1 = Days01.valueOf(day);
             if(d1 == Days01.SATURDAY || d1 == Days01.SUNDAY)
             {
                 System.out.println("Weekend");
             }
             
             else
             {
                 System.out.println("Working day");
             }
             break;
         }
         
         case 3 :
         {
             System.out.println("Exit");
         }
     }
        
    }while (choice!=3);
}
}
