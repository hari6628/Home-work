/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June11;


public class Thread02 extends Thread
{
    public void run()
    {
         MessegeLogger log2 = MessegeLogger.getInstance();
        log2.logMessage("Hi Welcome");
    }
    
}
