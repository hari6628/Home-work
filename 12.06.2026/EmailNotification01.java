/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June12;

public class EmailNotification01 extends NotificationFactory
{

    @Override
    Notification createNotification()
    {
        return new EmailNotification();
        
    }
    
}
