/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static03;

import java.util.Scanner;

/**
 *
 * @author harin
 */

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Bank b1 = new Bank();
        System.out.print("Enter the principal amount : ");
        double amount = sc.nextDouble();
        System.out.print("Enter the number of years : ");
        int years = sc.nextInt();
        Bank.calculateInterest(amount,years);
        b1.display();
        
    }
    
}
