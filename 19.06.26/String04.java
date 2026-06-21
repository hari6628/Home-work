/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.string04;

import java.util.Scanner;

public class String04 {
    static Scanner sc = new Scanner(System.in);
     static  boolean res = true;

    public static void main(String[] args) 
    {
        
   System.out.println("Enter the String ");
            String a = sc.nextLine();
        
       
        do
        {
            
            
            
            System.out.println("1.Find duplicate");
            System.out.println("2.Remove Space");
            System.out.println("3.Reverse String");
            System.out.println("4.Exit");
            System.out.print("Enter the choice : ");
            
            int choice = sc.nextInt();
            
            switch (choice)
          {
                case 1:
                {duplicate(a); break;}
                
                case 2:
                {remove(a); break;}
//                
                case 3:
                {reverse(a); break;}
                
                case 4:
                {exit(); break;}
                
                default:
                {System.out.println("Invalid");}
            }
            
            
            
            
            
        }while(res);
        
        
        
    }

     public static String duplicate(String a) // "Hello"
     {
         int count = 0;
         String b = "";
       for(int i = 0; i<a.length();i++)
       {
           char ch = a.charAt(i);
           
          count = 1;
          for(int j = i+1;j<a.length();j++)
          {
              if(a.charAt(j)==ch)
              {
                  count++;
              }
          }
          
          if(count>1&&b.indexOf(ch)==-1)
          {
              b = b+a.charAt(i);
          }
          
       }
       
         return b;
    }

    public static String remove(String a)
    {
        String b = "";
        for(int i = 0; i<a.length();i++)
        {
            if(a.charAt(i)!=' ')
            {
                b=b+a.charAt(i);
            }
        }
       return b;
    }

    public  static String reverse(String a) 
    {
        String b = "";
        
//        for(int i = a.length()-1; i>=0;i--)
//        {
//           b = b+ a.charAt(i);
//        }
//        System.out.println(b);

     StringBuffer c = new StringBuffer(a);
     b = c.reverse().toString();
        return b;
       
    }

     public static String exit() 
    {
       res = false;
        return "Ok";
    }
    
   
}
