/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpapergame;

import java.util.Random;
import java.util.Scanner;

public class Rockpapergame {

    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissors");
        
        int a = sc.nextInt();
        
        Random r = new Random();
        int c = r.nextInt(3)+1;
        
        System.out.println(c);
        
        
        
        if(a==c)
        {
            System.out.println("Draw");
        }
        
        else if(a==1 && c == 2)
        {
            System.out.println("Computer wins");
        }
        
        else if(a==1 && c == 3)
        {
            System.out.println("User wins");
        }
        
        else if(a==2 && c==1)
        {
            System.out.println("User wins");
        }
        
        else if(a==2 && c==3)
        {
            System.out.println("Computer wins");
        }
        
         else if(a==3 && c==1)
        {
            System.out.println("Computer wins");
        }
        
        else if(a==3 && c==2)
        {
            System.out.println("User wins");
        }
        
        else
        {
            System.out.println("Invalid choice. Please select 1, 2, or 3. ");
            
        }
        
        
        
    }
    
}
