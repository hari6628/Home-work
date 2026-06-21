/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount01;


public class BankAccount02 
{
    private double balance;
    
    public BankAccount02()
    {
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        }
    }
    
    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
        }
    }
    
    public double checkbalance()
    {
        return balance;
    }
    
}
