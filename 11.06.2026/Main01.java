/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;


public class Main01 
{
    public static void main(String[] args) 
    {
        PrinterManager o = PrinterManager.getInstance();
        PrinterManager o1 = PrinterManager.getInstance();
        
        o.print();
        o1.print();
        
        System.out.println(o==o1);
        
    }
    
}
