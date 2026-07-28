/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator02;


public abstract class PizzaDecorator implements Pizza
{
    protected Pizza piza;
    
    public PizzaDecorator (Pizza piza)
    {
        this.piza = piza;
    }
    
     @Override
    public String getdescription() 
    {
        return piza.getdescription();
        
    }

    @Override
    public double getcost() 
    {
        return piza.getcost();
    }
    
}
