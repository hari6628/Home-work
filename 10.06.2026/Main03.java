/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author harin
 */
public class Main03 
{
    ArrayList<Employee> e1 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)  
    {
        Main03 m3 = new Main03();
        m3.menu();
    }
    
    void menu()
    {
        
         int choice;
        do
        {
            System.out.println("Library Management System");
            System.out.println("1.Add Employee ");
            System.out.println("2.View all Employee ");
            System.out.println("3.Search Employee by ID ");
            System.out.println("4.Update Basic Salary");
            System.out.println("5.Calculate Net Salary ");
            System.out.println("6.Delete employee ");
             System.out.println("7.Exit ");
            System.out.println("Enter the choice :  ");
            
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    add();
                    break;
                }
                case 2:
                {
                    view();
                    break;
                }
                case 3:
                {
                    search();
                    break;
                }
                case 4:
                {
                    update();
                    break;
                }
                case 5:
                {
                    netsalary();
                    break;
                }
                case 6:
                
                {
                    delete();
                }
                
                case 7:
                {
                    System.out.println("Exit");
                }
            }
                
        }while(choice!=7);
 
    }
    
    void add()
    {
        System.out.println("Enter the Emplyee ID : ");
        int id = sc.nextInt();
        
        for(Employee e : e1)
        {
            if(e.id==id)
            {
                System.out.println("Already exists");
                break;
            }
        }
            
            sc.nextLine();
            
            System.out.println("Enter the name : ");
            String name = sc.nextLine();
            
            System.out.println("Enter the department : ");
            String department = sc.nextLine();
            
            System.out.println("Enter the Basic salary : ");
            int basicsalary = sc.nextInt();
            
            e1.add(new Employee(id,name,department,basicsalary));
            System.out.println("Added");
            
        
    }
    
    void view()
    {
        if(e1.isEmpty())
        {
            System.out.println("No emplyee recorded");
            
        }
        
        for(Employee e: e1)
        {
            System.out.println("ID : "+e.id);
            System.out.println("Name : "+e.name);
            System.out.println("Department : "+e.department);
            System.out.println("Basic Salary : "+e.basicsalary);
            
            
        }
    }
    
    void search()
    {
        System.out.println("Enter the Employee ID : ");
        int id = sc.nextInt();
        
        for(Employee e : e1)
        {
            if(e.id==id)
            {
                System.out.println("Name : "+e.name);
                System.out.println("Department : "+e.department);
            System.out.println("Basic Salary : "+e.basicsalary);
            break;
            }
        }
        System.out.println("Employee not found");
    }
    
    void update()
    {
        System.out.println("Enter the Employee ID : ");
        int id = sc.nextInt();
        
        for(Employee e : e1)
        {
            if(e.id==id)
            {
                System.out.print("Enter the new Basic Salary : ");
                e.basicsalary = sc.nextInt();
                System.out.println("Updated");
                break;
                
            }
        }
        
       System.out.println("Employee not found");
    }
    
    void netsalary()
    {
                System.out.println("Enter the Employee ID : ");
        int id = sc.nextInt();
        
        for(Employee e : e1)
        {
            if(e.id==id)
            {
                double hra = 0.20*e.basicsalary;
                double da = 0.10 * e.basicsalary;
                double pf = 0.05*e.basicsalary;
                
                double net =e.basicsalary+hra+da-pf;
                
                System.out.println("Net salary = "+net);
                break;
            }
            
        }
        System.out.println("Employee not found");
    }
    
    void delete()
    {
         System.out.println("Enter the Employee ID : ");
        int id = sc.nextInt();
        
        for(Employee e : e1)
        {
            if(e.id==id)
            {
               
               e1.remove(e);
                System.out.println("Removed");
                break;
                
            }
        }
        
       System.out.println("Employee not found"); 
    }
    
    
}
