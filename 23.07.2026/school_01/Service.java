package school_01;

import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Service 
{
    public void insertservice(int id,String name,String email,String course,int fee) throws SQLException
    {
        Dao d = new Dao();
        d.insertdao(id,name,email,course,fee);
        
        
    }
    
    public void updateservice(int id,String name,String email,String course,int fee) throws SQLException
    {
        Dao d = new Dao();
        d.updatedao(id,name,email,course,fee);
        
        
    }
    
    public void deleteservice(int id) throws SQLException
    {
        Dao d = new Dao();
        d.deletedao(id);
        
        
    }
    
}
