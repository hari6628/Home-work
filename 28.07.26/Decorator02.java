/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator02;


public class Decorator02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getdescription());
        System.out.println("Cost : " + pizza.getcost());

        System.out.println();

       
        pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);

        System.out.println(pizza.getdescription());
        System.out.println("Cost : " + pizza.getcost());

        System.out.println();

       
        pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new Mushroom(pizza);

        System.out.println(pizza.getdescription());
        System.out.println("Cost : " + pizza.getcost());

        System.out.println();

       
        pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new Mushroom(pizza);
        pizza = new Olive(pizza);

        System.out.println(pizza.getdescription());
        System.out.println("Cost : " + pizza.getcost());
    }
    
}
