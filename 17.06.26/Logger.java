/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton02;


public class Logger 
{
    private static Logger data;
    private Logger()
            {
                
            }
    
    public static synchronized Logger getinstance()
    {
        if(data==null)
        {
            data = new Logger();
        }
        return data;
    }
    
    
}
