/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package four.one;

import java.util.Scanner;

/**
 *
 * @author harin
 */
public class ShoppingCart 
{
    Scanner sc = new Scanner(System.in);
    String cartownername;
    
    class item
    {
        String itemname;
        int price;
        int quantity;
        double[] pricehistory ;
        double newprice;
        double totalbill;
        
        void addpricehistory()
        {
            System.out.println("Number of price updates : ");
            int n = sc.nextInt();
            pricehistory = new double[n];
            
            System.out.println("Enter the price updates : ");
            for(int i = 0; i<n;i++)
            {
                pricehistory[i] = sc.nextDouble();
            }
            newprice = pricehistory[n - 1];
        }
        
        void calculatetotalbills()
        {
            totalbill = newprice * quantity;
        }
        
        void display()
        {
             System.out.println("Cart Owner: " + cartownername);
            System.out.println("Item Name: " + itemname);
            System.out.println("Quantity: " + quantity);
              System.out.print("Price History: ");
              
              for (int i = 0; i < pricehistory.length; i++) {
                System.out.print(pricehistory[i] + " ");
            }

            System.out.println();

            System.out.println("Latest Price: " + newprice);
            System.out.println("Total Bill: " + totalbill);

        }
        
        
    }
    
}
