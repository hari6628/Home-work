/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static04;

/**
 *
 * @author harin
 */
public class Main 
{
    public static void main(String[] args) 
    {
        College s1 = new College(25000);
        College s2 = new College(30000);
        
        College.dispalyCollegeDetails();
        s1.displayStudentFee();
        s2.displayStudentFee();;
        
    }
    
}
