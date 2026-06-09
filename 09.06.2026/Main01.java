/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June9_1;

import java.util.Scanner;


public class Main01 {


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Storage<Integer> s1 = new Storage<>();
        Storage<String> s2 = new Storage<>();

        int choice;

        do {
            System.out.println(" Generic Storage Box Menu ");
            System.out.println("1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {

                case 1:
                    System.out.print("Enter Integer: ");
                    int val = sc.nextInt();
                    
                    System.out.println("Integer stored successfully!");
                    break;

                           case 2:
                    System.out.print("Enter String: ");
                    String str = sc.nextLine();
                    s2.setValue(str);
                    System.out.println("String stored successfully!");
                    break;

                case 3:
                    System.out.println("Stored Integer Value: " + s1.getValue());
                    System.out.println("Stored String Value: " + s2.getValue());
                    break;

                case 4:
                    System.out.println("Exited...");
                    break;

            }
        }while(choice!=4);
        }


    
}
