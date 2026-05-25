/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public class Car extends Vehicle 
{
    int seats;
    Car(String brand, int year, int seats)
    {
        super(brand,year);
        this.seats = seats;
        
        
    }

    @Override
    void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Seats : "+seats);
     
    }
    
}
