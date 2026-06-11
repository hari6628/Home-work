/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;


public class PrinterManager 
{
    private static PrinterManager instance;
    
    private PrinterManager()
    {
     }
    
    public static PrinterManager getInstance()
    {
        if(instance==null)
        {
        instance = new PrinterManager();
        }
        return instance;
    }
    
    public void print()
    {
        System.out.println("Printing documents...");
    }
            
            
    
}
