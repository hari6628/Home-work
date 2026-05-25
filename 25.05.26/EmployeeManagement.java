/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public class EmployeeManagement 
{
    public static void main(String[] args)
    {
        Employee obj = new Employee("Alice",50000);
        Manager obj1 = new Manager("Bob",80000,"IT");
        
        System.out.println("Employee Management System");
        obj.displayInfo();
        obj1.displayInfo();
        
        
    }
    
}
