/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June15;

import java.util.Scanner;


public class Login01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user ID : ");
        String UserId = sc.nextLine();
        
      try
      {
          int user =Integer.parseInt(UserId);
          Uservalidation01.vailduser(user);
      }
      
      catch(NumberFormatException e)
      {
          System.out.println("User ID must be a number");
      }
      
      catch(InvalidUser e)
      {
          System.out.println(e.getMessage());
      }
      
      
        
    }
    
}
