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
public class Main03
{
    public static void main(String[] args) 
    {
       ShoppingCart cart = new ShoppingCart();
       ShoppingCart.item i1 = cart.new item();
       
       Scanner sc =new Scanner(System.in);
       
        System.out.println("Enter Cart Owner Name : ");
        cart.cartownername = sc.nextLine();
        
        System.out.println("Enter Item Name : ");
        i1.itemname = sc.nextLine();
        
        System.out.println("Enter Quantity : ");
         i1.quantity = sc.nextInt();
         
         i1.addpricehistory();
         i1.calculatetotalbills();
         i1.display();
        
        
        
    }
    
}
