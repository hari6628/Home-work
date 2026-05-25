/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public class Manager extends Employee
{
    String department;
    
    Manager(String name, double salary, String department)
    {
        super(name,salary);
        this.department = department;
    }
    
    @Override
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Department : "+department);
    }
    
}
