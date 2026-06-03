/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three;

/**
 *
 * @author harin
 */
public class SecondThread implements  Runnable 
{

    @Override
    public void run()
    {
        for(int i = 0; i<= 5; i++)
        {
            for(int j = 0; j <=5; j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
    
    
}
