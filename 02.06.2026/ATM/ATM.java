/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework01;

import java.util.Scanner;

/**
 *
 * @author harin
 */
public class ATM 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        double balance = 5000;
        int choice;
        
        do
        {
            System.out.println("ATM Menu");
            System.out.println("1.Withdraw Money");
            System.out.println("2.Checks Balance");
            System.out.println("3.Exit");
            System.out.print("Enter the choice : ");
            choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter the amount : ");
                    double amount = sc.nextDouble();
                    
                    try
                    {
                        if(amount > balance)
                        {
                            throw new InsufficientBalanceException();
                        }
                        balance = balance - amount;
                        System.out.println("Withdrawl successful");
                        System.out.println("Balance : "+balance);
                        
                    }
                    catch(InsufficientBalanceException e)
                    {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                }
                
                case 2:
                {
                    System.out.println("Current balance : "+balance);
                    break;
                }
                
                case 3:
                {
                    System.out.println("Thank you");
                    break;
                }
                
                default:
                {
                    System.out.println("Invaild choice");
                }
            }
            
            
        }while(choice !=3);
        
    }
    
}
