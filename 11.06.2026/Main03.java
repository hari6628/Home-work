/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;


public class Main03
{
    public static void main(String[] args) 
    {
        UserSession u1 = UserSession.getInstance();
        UserSession u2 = UserSession.getInstance();
        
        u1.getUser("Ajay");
        u2.showUser();
        
    }
    
}
