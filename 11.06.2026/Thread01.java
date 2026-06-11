/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;

/**
 *
 * @author harin
 */
public class Thread01 extends Thread
{
    public void run()
    {
        MessegeLogger log1 = MessegeLogger.getInstance();
        log1.logMessage("Hi Hello");
    }
    
}
