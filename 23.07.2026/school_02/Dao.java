/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Dao 
{
    public void insertdao(int id,String name,String email,String course,int fee) throws SQLException
    {
       Connection c1 = getConnection();
       PreparedStatement ps = c1.prepareStatement("insert into student values (?,?,?,?,?)");
       ps.setInt(1, id);
       ps.setString(2, name);
       ps.setString(3, email);
       ps.setString(4, course);
       ps.setInt(5, fee);
       
       int res = ps.executeUpdate();
       if(res>0)
       {
           System.out.println("Program run");
       }
       
       else
       {
           System.out.println("Failed");
       }
        
    }
    
    
    public void updatedao(int id,String name,String email,String course,int fee) throws SQLException
    {
       Connection c1 = getConnection();
       PreparedStatement ps = c1.prepareStatement("update student set name = ?,email = ?,course = ?, fee = ? where id = ?");
       ps.setInt(5, id);
       ps.setString(1, name);
       ps.setString(2, email);
       ps.setString(3, course);
       ps.setInt(4, fee);
       
       int res = ps.executeUpdate();
       if(res>0)
       {
           System.out.println("Program run");
       }
       
       else
       {
           System.out.println("Failed");
       }
        
    }
    
    public void deletedao(int id) throws SQLException
    {
       Connection c1 = getConnection();
       PreparedStatement ps = c1.prepareStatement("delete from student where id = ?");
       ps.setInt(1, id);
       
       
       int res = ps.executeUpdate();
       if(res>0)
       {
           System.out.println("Program run");
       }
       
       else
       {
           System.out.println("Failed");
       }
        
    }

    
     private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
     private static final String USERNAME = "system";
     private static final String PASSWORD = "hari";

    public Connection getConnection()
    {
        Connection c = null;
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            c = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Database connection success");
            
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return c;
    }
    
    
}
