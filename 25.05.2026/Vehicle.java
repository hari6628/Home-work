/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

/**
 *
 * @author harin
 */
public  class  Vehicle 
{
    String brand;
    int year;
    
    Vehicle(String brand,int year)
    {
        this.brand = brand;
        this.year = year;
    }
    
    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
    
    
}
