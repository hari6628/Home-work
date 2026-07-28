/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator02;


public class PlainPizza implements Pizza
{

    @Override
    public String getdescription() 
    {
        return "Plain Pizza";
        
    }

    @Override
    public double getcost() 
    {
        return 5.0;
    }
    
    
}
