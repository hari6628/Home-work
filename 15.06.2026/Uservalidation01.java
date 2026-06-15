/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June15;


public class Uservalidation01
{
    static void vailduser(int user) throws InvalidUser
    {
        if(user<=0)
        {
            throw new InvalidUser("User ID must be positive");
        }
        
        System.out.println("Valid User ID : "+ user);
    }
    
}
