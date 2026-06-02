/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Junetwo;

/**
 *
 * @author harin
 */
import java.util.Scanner;

public class Loginsystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        int attempts = 3;
        int choice;

        do
        {
            System.out.println("Login Menu");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                {
                    try
                    {
                        while(attempts > 0)
                        {
                            System.out.print("Enter Username: ");
                            String user = sc.nextLine();

                            System.out.print("Enter Password: ");
                            String pass = sc.nextLine();

                            if(user.equals(username) && pass.equals(password))
                            {
                                System.out.println("Login Successful");
                                break;
                            }
                            else
                            {
                                attempts--;

                                if(attempts == 0)
                                {
                                    throw new AccountLockedException();
                                }

                                System.out.println("Invalid Credentials");
                                System.out.println("Remaining Attempts: " + attempts);
                            }
                        }
                    }
                    catch(AccountLockedException e)
                    {
                        System.out.println("Account Locked");
                    }

                    break;
                }

                case 2:
                {
                    System.out.println("Thank You");
                    break;
                }

                default:
                {
                    System.out.println("Invalid Choice");
                }
            }

        } while(choice != 2);

        sc.close();
    }
}
