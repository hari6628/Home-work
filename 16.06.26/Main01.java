/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June16_Builder;

public class Main01 
{
    public static void main(String[] args) 
    {
        Patientrecord paitent = new Patientrecord.Builder().setPatientName("Ajay").setAge(25).setDisease("Fever").setDoctorName("Ram").setRoomType("Normal room").setBillAmount(5000.0).build();
        paitent.displayDetails();
        
    }
    
}
