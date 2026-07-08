/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package July08;

import java.util.Scanner;

public class Prime01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+" "+prime(n));
        
        
    }
    
    static String prime(int n)
    {
        if(n<=1)
        {
            return "is not a Prime number";
        }
        int c = 2;
        
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return "is not a Prime number";
            }
            c++;
        }
        
        if(c*c > n)
        {
            return "is  a Prime number";
        }
        
        return "is not a Prime number";
        
    }
    
}
