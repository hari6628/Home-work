/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public class Employee
{
        String name;
        double salary;
        
        Employee(String name, double salary)
        {
            this.name=name;
            this.salary=salary;
        }
        
        void displayInfo()
        {
            System.out.println("Name : "+name);
            System.out.println("Salary Rs: "+salary);
        }
    
}
