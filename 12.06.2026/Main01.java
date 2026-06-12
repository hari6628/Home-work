/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June12;


public class Main01 
{
    public static void main(String[] args) 
    {
      
      NotificationFactory n = new EmailNotification01();
      Notification f = n.createNotification();
      f.sendMesseage();
      
    NotificationFactory n1 = new SMSNotification01();
      Notification f1 = n1.createNotification();
      f1.sendMesseage();
      
      NotificationFactory n2 = new PushNotification01();
      Notification f2 = n2.createNotification();
      f2.sendMesseage();
        
        
    }
    
}
