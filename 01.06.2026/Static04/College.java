/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static04;

/**
 *
 * @author harin
 */
public class College
{
    static final String collegename = "XYZ engineering college";
    final double registrationFees;
    static  int totalStudents = 0;
    College(double registrationFee)
    {
        this.registrationFees = registrationFee;
        totalStudents++;
    }
    
    static void dispalyCollegeDetails()
    {
        System.out.println("College name : "+collegename);
        System.out.println("Total Students : "+totalStudents);
    }
    
    void displayStudentFee()
    {
        System.out.println("Registration Fees : "+registrationFees);
    }

            
}
