/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school_01;

import java.sql.SQLException;
import java.util.Scanner;

public class School_01 {


        
    public static void main(String[] args) throws SQLException 
    {
        Scanner sc = new Scanner(System.in);
            Scanner se = new Scanner(System.in);
            
            
            
       
           Service s = new Service();
         
            boolean res = true;
        do
        {
        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Exit");
        
        System.out.println("Enter the choice :");
        int choice = sc.nextInt();
        if(choice == 1)
        {
             System.out.println("Enter the id : ");
        int id = sc.nextInt();
        System.out.println("Enter the name : ");
        String name = se.nextLine();
        System.out.println("Enter the email : ");
        String email = se.nextLine();
        System.out.println("Enter the course : ");
        String course = se.nextLine();
        System.out.println("Enter the fee : ");
        int fee = sc.nextInt();
          s.insertservice(id,name,email,course,fee);
           
        }
        else if (choice == 2)
                {
                    System.out.println("Enter the id : ");
        int id = sc.nextInt();
        System.out.println("Enter the name : ");
        String name = se.nextLine();
        System.out.println("Enter the email : ");
        String email = se.nextLine();
        System.out.println("Enter the course : ");
        String course = se.nextLine();
        System.out.println("Enter the fee : ");
        int fee = sc.nextInt();
          s.updateservice(id,name,email,course,fee);

      
                }
        
        else if(choice == 3)
        {
            System.out.println("Enter the id : ");
        int id = sc.nextInt();
       s.deleteservice(id);
         
        }
        
        else
        {
            res = false;
        }
        }while (res);
        
           
           
           
            
            
    }
    
}
