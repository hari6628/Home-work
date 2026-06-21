/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount01;

import java.util.Scanner;

public class BankAccount01 
{
    

    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         
         BankAccount02 ac = new BankAccount02();
           int choice = 0;
        do
        {
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
            System.out.println("4.Exit");
        
            System.out.println("Enter the choice : ");
            choice = sc.nextInt();
       
         
         if(choice==1)
         {
             System.out.println("Enter the deposit amount : ");
             double dep = sc.nextDouble();
             ac.deposit(dep);
             System.out.println("Amount deposited");
             
         }
         
         else if(choice==2)
         {
             System.out.println("Enter the withdraw amount : ");
             double with = sc.nextDouble();
             ac.withdraw(with);
             System.out.println("Amount withdrawn");
         }
         
          else if(choice==3)
         {
             
             System.out.println("Balance = "+ac.checkbalance());
         }
         
         else
          {
              System.out.println("Exit");
          }
        
        
        }while(choice != 4);
        
        
    }
}
    