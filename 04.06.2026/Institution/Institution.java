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
public class Institution 
{
    Scanner sc = new Scanner (System.in);
 String insitutionName;
 class Student
 {
     String studentName;
     int rollNo;
     int  subjects;  
     int marks[];
     double average;
     int sum;
     
     void addMarks()
     {
         marks = new int[subjects];
         System.out.print("Enter marks: ");
         for(int i = 0; i<marks.length;i++)
         {
             marks[i]=sc.nextInt();
         }
     }
     
          void displayMarks()
     {
         for(int i = 0; i<marks.length;i++)
         {
             System.out.print("Marks : ");
             System.out.print(marks[i]+", ");
         }
     }
    
     void calculateAverage()
     {
         sum = 0;
        for(int i = 0; i<marks.length;i++)
         {
            sum = sum + marks[i];
         } 
        average = (double)sum/subjects;
        System.out.println("Average: " + average);
     
     }
     
     
     void calculateGrade()
     {
         if(average >=90 && average==100)
         {
             System.out.println("Grade A"); 
         }
         
         else if(average >=75 && average<=89)
         {
             System.out.println("Grade B"); 
         }
         
          else if(average >=74 && average<=50)
         {
             System.out.println("Grade C"); 
         }
         
          else if(average < 50)
          {
              System.out.println("Fail");
          }
         
         else
          {
              System.out.println("Fail");
          }
     }
     
 }
}
