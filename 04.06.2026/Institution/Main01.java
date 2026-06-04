/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package four;

import java.util.Scanner;

/**
 *
 * @author harin
 */
public class Main01 {
    public static void main(String[] args) 
    {
         Institution inst = new Institution();
        Institution.Student i1 = new Institution().new Student();
        Scanner sc =new Scanner (System.in);
         System.out.println("Institution Name: ABC Institution");
        System.out.print("1. Enter the  Student Name : ");
        i1.studentName = sc.nextLine();
        System.out.print("2.Roll No : ");
        i1.rollNo = sc.nextInt();
        System.out.print("3.Number of subjects : ");
        i1.subjects = sc.nextInt();
        System.out.print("4. Enter the  Marks : ");
        i1.addMarks();
        i1.displayMarks();
        i1.calculateAverage();
        i1.calculateGrade();
        
        System.out.println("7. Exit : ");
        
        
    }
    
}
