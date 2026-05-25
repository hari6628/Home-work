/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public class Motorcycle extends Vehicle
{
    String type;
    Motorcycle(String brand, int year, String type)
    {
        super(brand,year);
        this.type= type;
    }
    
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type : "+type);
        
    }
    
    
}
