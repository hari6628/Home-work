/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcstudentrecords01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCstudentrecords01 {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the id : ");
        int id = sc.nextInt();
        System.out.println("Enter the name : ");
        String name = se.nextLine();
        JDBCstudentrecords01 j = new JDBCstudentrecords01();
        
        boolean res = true;
        do
        {
        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Exit");
        
        System.out.println("Enter the choice :");
        int choice = sc.nextInt();
        if(choice == 1)
        {
        j.insert(id,name);
        }
        else if (choice == 2)
                {
         j.update(id,name);
                }
        
        else if(choice == 3)
        {
         j.delete(id);
        }
        
        else
        {
            res = false;
        }
        }while (res);
        
        
    }
    
    public Connection dbconnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        Connection c1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Studentrecords03","postgres","hari");
        return c1;
    }
    

    
    public void insert(int id , String name ) throws ClassNotFoundException, SQLException
    {
        Connection c = dbconnection();
        Statement s = c.createStatement();
        PreparedStatement ps = c.prepareStatement("insert into studentdet values(?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        int res = ps.executeUpdate();
        
        if(res>0)
        {
            System.out.println("Inserted");
        }
        
        else
        {
            System.out.println("Not Inserted");
        }
        
    }
    
    public void update(int id , String name ) throws ClassNotFoundException, SQLException
    {
        Connection c = dbconnection();
        Statement s = c.createStatement();
        PreparedStatement ps = c.prepareStatement("update studentdet set sname = ? where srollno = ?");
        
        ps.setString(1, name);
        ps.setInt(2, id);
        int res = ps.executeUpdate();
        
        if(res>0)
        {
            System.out.println("Updated");
        }
        
        else
        {
            System.out.println("Not Updated");
        }
        
    }
    
     public void delete(int id  ) throws ClassNotFoundException, SQLException
    {
        Connection c = dbconnection();
        Statement s = c.createStatement();
        PreparedStatement ps = c.prepareStatement("delete from studentdet where srollno = ?");
        
        
        ps.setInt(1, id);
        int res = ps.executeUpdate();
        
        if(res>0)
        {
            System.out.println("Deleted");
        }
        
        else
        {
            System.out.println("Not Deleted");
        }
        
    }
    
}
