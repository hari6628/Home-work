/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test02;

import com.mycompany.string04.String04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test02
{
    @Test
    public void checkduplicate()
    {
        String res = String04.duplicate("Welcome");
        Assertions.assertEquals("e", res);
    }
    
    
    @Test
    public void checkremovespacee()
    {
        String res = String04.remove("Welcome Hi");
        Assertions.assertEquals("WelcomeHi", res);
    }
    
    @Test
    public void checkreverse()
    {
        String res = String04.reverse("Hello");
        Assertions.assertEquals("olleH", res);
    }
    
    
}
