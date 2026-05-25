/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public class Inheritance_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car obj = new Car("Toyota",2022,5);
       
        Motorcycle obj1 = new Motorcycle("Yamaha",2020,"Sports");
        System.out.println("Car : ");
        obj.displayInfo();
        System.out.println("Bike : ");
        obj1.displayInfo();
       
        
    }
    
}
