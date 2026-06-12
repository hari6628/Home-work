/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June12;

/**
 *
 * @author harin
 */
public class SMSNotification01 extends NotificationFactory
{
     @Override
    Notification createNotification()
    {
        return new SMSNotification();
        
    }
}
