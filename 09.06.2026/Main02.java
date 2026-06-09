/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June9_1;

import java.util.Scanner;


public class Main02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int choice;
        int typeChoice;

        do {
            System.out.println(" Generic Calculator Menu ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

         switch (choice) {

          case 1:
               

       System.out.println("\nChoose Data Type:");
      System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.print("Enter type: ");
         typeChoice = sc.nextInt();

                    if (typeChoice == 1) {

                        Calculator<Integer> calc = new Calculator<>();
                         
                        System.out.print("Enter first integer: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second integer: ");
                        int b = sc.nextInt();

                        if (choice == 1)
                            calc.add(a, b);
                        else
                            calc.subtract(a, b);

                    } else if (typeChoice == 2) {

                        Calculator<Double> calc = new Calculator<>();

                        System.out.print("Enter first double: ");
                        double a = sc.nextDouble();

                        System.out.print("Enter second double: ");
                        double b = sc.nextDouble();

                        if (choice == 1)
                            calc.add(a, b);
                        else
                            calc.subtract(a, b);

                    } else {
                        System.out.println("Invalid type!");
                    }

                    break;
                  case 3:
                    System.out.println("Exited...");
                    break;
        
    }
    
}while(choice!=3);
        
    }
    
}
