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
public class Main02 
{
    ArrayList <Book>a2 = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
    public static void main(String[] args) 
    {
      Main02 m2 = new Main02();
        m2.menu();
        
    }
    
    void menu()
    {
         int choice;
        do
        {
            System.out.println("Library Management System");
            System.out.println("1.Add Books ");
            System.out.println("2.View all Books ");
            System.out.println("3.Search Students by ID ");
            System.out.println("4.Issue Books ");
            System.out.println("5.Return Books ");
            System.out.println("6.Delete Books ");
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
                    issue();
                    break;
                }
                case 5:
                {
                    returnbook();
                    break;
                }
                case 6:
                
                {
                    deletebook();
                }
            }
                
        }while(choice!=7);
 
}
    
    void add()
    {
        System.out.println("Enter the Book ID : ");
        int id = sc.nextInt();
        
        for(Book b : a2)
        {
            if(b.ID==id)
            {
                System.out.println("Book ID already exists");
                break;
            }
        }
        
        sc.nextLine();
        
        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        
        a2.add(new Book(id,title,author,"Available"));
        System.out.println("Book added");
    }
    
    void view()
    {
        if(a2.isEmpty())
        {
            System.out.println("No books available");
           
        }
        
        for(Book b : a2)
        {
            System.out.println("Book ID : " + b.ID);
            System.out.println("Title   : " + b.title);
            System.out.println("Author  : " + b.author);
            System.out.println("Status  : " + b.status);
        }
        
    }

  void search() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : a2) {
            if (b.ID == id) {
                System.out.println("Book Found:");
                System.out.println("Title  : " + b.title);
                System.out.println("Author : " + b.author);
                System.out.println("Status : " + b.status);
                break;
            }
        }

        System.out.println("Book not found!");
    }
  
  void issue()
  {
      System.out.println("Enter the bookID : ");
      int id = sc.nextInt();
      
      for(Book b : a2)
      {
          if(b.ID==id)
          {
              if(b.status.equals("Issued"))
              {
                  System.out.println("Already Issued");
              }
              
              else
              {
                  b.status = "Issued";
                  System.out.println("Book issued");
              }
          }
      }
      
      System.out.println("Book not found");
      
  }
  
  void returnbook()
  {
       System.out.println("Enter the bookID : ");
      int id = sc.nextInt();
      
      for(Book b : a2)
          {
          if(b.ID==id)
          {
              if(b.status.equals("Available"))
              {
                  System.out.println("Already Available");
              }
              
              else
              {
                  b.status = "Available";
                  System.out.println("Book returned");
              }
              return;
          }
          System.out.println("Book not found");
      }
      
      
  }
    
   void deletebook()
   {
       System.out.println("Enter the bookID : ");
      int id = sc.nextInt();
      
      for(Book b : a2)
          {
          if(b.ID==id)
          {
              a2.remove(b);
              System.out.println("Deleted");
              
          }
          }
          System.out.println("Book not found");
   }
       
    
    
}
    
