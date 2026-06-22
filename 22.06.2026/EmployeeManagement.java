/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June22;

import java.util.Scanner;


public class EmployeeManagement 
{
    static Scanner sc = new Scanner (System.in);
    static Scanner se = new Scanner(System.in);
    static boolean res = true;
    
    public static void main(String[] args)
    {
        do
        {
            System.out.println("1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Search Employee");
            System.out.println("4.Exit");
            
            System.out.println("Enter the choice : ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    add();
                    break;
                }
                
                 case 2:
                {
                    display();
                    break;
                }
                
                
                 case 3:
                {
                    search();
                    break;
                }
                
                 case 4:
                {
                    exit();
                    break;
                }
                
            }
        }while(res);
        
        
    }
    static int max = 100;
   static int id[] =  new int [max];
    static String name[] = new String[max];
    static String dep[] = new String[max];
    static int k = 0;
    
    static void add()
    {
        System.out.println("Enter the employee ID : ");
        id[k] = sc.nextInt();
        
        System.out.println("Enter the employee name : ");
        name[k] = se.nextLine();
        
        System.out.println("Enter the employee department");
        dep[k] = se.nextLine();
        
        if(k>max)
        {
            System.out.println("Reached maximum");
        }
        
        k++;
        System.out.println("Employee added");
    }
    
    static void display()
    {
        
        
        for(int i = 0; i<k; i++)
        {
            System.out.println("ID : "+  id[i]);
            System.out.println("Name : "+ name[i]);
            System.out.println("Department : "+dep[i]);
            
                
        }
    }
    
    static void search()
    {
        System.out.print("Enter the ID number");
        int ID = sc.nextInt();
       
              for(int i = 0; i<=k; i++)
        {
            if(ID == id[i])
        {
            System.out.println("ID : "+  id[i]);
            System.out.println("Name : "+ name[i]);
            System.out.println("Department : "+dep[i]);
            break;
                
        }
        }
    }
    
    
    static void exit()
    {
        System.out.println("Exit");
        res = false;
    }
    
}
