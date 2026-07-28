/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator02;


public class Mushroom extends PizzaDecorator
{
    public Mushroom(Pizza piza)
    {
        super(piza);
    }

    @Override
    public String getdescription()
    {
        return piza.getdescription() + ", Mushroom";
    }

    @Override
    public double getcost()
    {
        return piza.getcost() + 2.0;
    }
    
}
