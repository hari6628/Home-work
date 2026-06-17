/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;


import com.mycompany.builder02.User;
import com.mycompany.builder02.UserBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test01
{
    @Test
    public void requiredFieldTest()
    {
        User user = new UserBuilder()
                .setName("Hari")
                .Making();

        assertNotNull(user);
    }

    @Test
    public void optionalFieldTest()
    {
        User user = new UserBuilder()
                .setName("Hari")
                .setAge(22)
                .setEmail("hari@gmail.com")
                .setPhone(123456789)
                .Making();

        assertNotNull(user);
    }

    @Test
    public void compareExpectedActualValues()
    {
        User user = new UserBuilder()
                .setName("Hari")
                .setAge(22)
                .setEmail("hari@gmail.com")
                .setPhone(123456789)
                .Making();

        String expected =
        "User{name=Hari, age=22, email=hari@gmail.com, phone=123456789}";

        assertEquals(expected, user.toString());
    }
}