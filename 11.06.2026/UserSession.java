/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;


public class UserSession 
{
    private static UserSession instance;
    
    private String username;
    
    private UserSession()
    {}
    
    public static UserSession getInstance()
    {
        if(instance==null)
        {
            instance = new UserSession();
        }
        return instance;
    }
    
    public void getUser(String name)
    {
        username =name;
    }
    
    public void showUser()
    {
        System.out.println("User name : "+username);
    }
    
}
