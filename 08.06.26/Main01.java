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
public class Main01 
{
    ArrayList <Student> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Main01 m1 = new Main01();
        m1.display();

        
    }
    
    void display()
    {
        int choice;
        do
        {
            System.out.println("Student Management System");
            System.out.println("1.Add Students ");
            System.out.println("2.View all Students ");
            System.out.println("3.Search Students by roll no ");
            System.out.println("4.Update Students Marks ");
            System.out.println("5.Delete Student ");
            System.out.println("6.Exit ");
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
                    delete();
                    break;
                }
                case 6:
                
                    System.out.println("Exit...");
                    break;
                
             
            }
                    
            }while(choice!=6);
            
        }
            
            void add()
            {
                System.out.println("Enter the Roll No : ");
                int rollno =sc.nextInt();
                for(Student s1:a1)
                {
                    if(s1.rollno == rollno)
                    {
                        System.out.println("Already exists"); 
                        break;
                    }
                }
                
                sc.nextLine();
//                String name;
//    int age;
//    String course;
//    double marks;
                 System.out.println("Enter the name : "); 
                  String name = sc.nextLine();
                  
                  System.out.println("Enter the age : "); 
                  int age = sc.nextInt();
                  
                  sc.nextLine();
                  System.out.println("Enter the course : "); 
                  String course = sc.nextLine();
                  
                  System.out.println("Enter the marks : ");
                  
                  double marks = sc.nextDouble();
                  a1.add(new Student(rollno,name,age,course,marks));
                  System.out.println("Added");
                  
                  
            }

      void view() {
        if (a1.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student s : a1) {
            System.out.println("Roll no: " + s.rollno);
            System.out.println("Name   : " + s.name);
            System.out.println("Age    : " + s.age);
            System.out.println("Course : " + s.course);
            System.out.println("Marks  : " + s.marks);
        }
            
            
        }
      
      void search()
      {
          System.out.print("Enter Roll No to search: ");
        int rollno = sc.nextInt();

        for (Student s : a1) {
            if (s.rollno == rollno) {
                System.out.println("Student Found:");
                System.out.println("Name   : " + s.name);
                System.out.println("Age    : " + s.age);
                System.out.println("Course : " + s.course);
                System.out.println("Marks  : " + s.marks);
                break;
            }
        }

        System.out.println("Invaild");
      }

      void update() {
        System.out.print("Enter Roll No to update marks: ");
        int rollno = sc.nextInt();

        for (Student s : a1) {
            if (s.rollno == rollno) {
                System.out.print("Enter new marks: ");
                s.marks = sc.nextDouble();
                System.out.println("Marks updated successfully!");
                break;
            }
        }

        System.out.println("Student not found!");
    }

    // 5. Delete
    void delete() {
        System.out.print("Enter Roll No to delete: ");
        int rollno = sc.nextInt();

        for (Student s : a1) {
            if (s.rollno == rollno) {
                a1.remove(s);
                System.out.println("Student deleted ");
                break;
            }
        }

        System.out.println("Student not found!");
    }
      
      
    
    
}
