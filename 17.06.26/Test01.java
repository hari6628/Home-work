/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import com.mycompany.singleton02.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test01 
{
    @Test
    public void createtest()
    {
        Logger l = Logger.getinstance();
         Logger l1 = Logger.getinstance();
         Assertions.assertEquals(l1, l);
        
    }
    
}
