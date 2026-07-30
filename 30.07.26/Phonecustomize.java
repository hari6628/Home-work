/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonecustomize;


public class Phonecustomize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
 {
Phone phone1 = new AndroidPhone();
        phone1 = new ScreenGuard(phone1);
        

        System.out.println("Phone 1:");
        System.out.println(phone1.getDescription());
        System.out.println("Total Price = ₹" + phone1.getPrice());

        System.out.println();

       
        Phone phone2 = new IPhone();
        phone2 = new ScreenGuard(phone2);
      
        phone2 = new WirelessCharger(phone2);
        System.out.println("Phone 2:");
        System.out.println(phone2.getDescription());
        System.out.println("Total Price = ₹" + phone2.getPrice());
       
    }
    
}
