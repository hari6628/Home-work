/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;


public class MessegeLogger
{
    private static MessegeLogger instance;
    
    private MessegeLogger()
    {}
    
    public static synchronized MessegeLogger  getInstance()
    {
        if(instance == null)
        {
            instance = new MessegeLogger();
        }
        return instance;
    }
    
    public void logMessage(String msg)
    {
         System.out.println(msg);
       
    }
    
}
