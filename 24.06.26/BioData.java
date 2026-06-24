/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June24Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioData
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        Scanner so = new Scanner(System.in);
        
                
        File f = new File("C:\\BioData\\Biodata.txt");
        
        if(f.createNewFile())
        {
            System.out.println("File created");
        }
        
        else
        {
            System.out.println("Already exists");
        }
        
        System.out.print("Enter the name : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the age : ");
        int i = se.nextInt();
        System.out.println("Gender : ");
        String s2 = sc.nextLine();
        System.out.println("DOB");
        int i1 = se.nextInt();
        System.out.println("Blood group");
        String s3 = sc.nextLine();
        
        System.out.println("Enter the degree : ");
        String s4 = sc.nextLine();
        System.out.println("College name ");
        String s5 = sc.nextLine();
        System.out.println("CGPA");
        double d = so.nextDouble();
        
        System.out.println("Skills");
        String s6 = sc.nextLine();
        
        System.out.println("Experience");
        String s7 = sc.nextLine();
        
        System.out.println("Phone no");
        int i2 = se.nextInt();
        System.out.println("Email");
        String s8 = sc.nextLine();
        System.out.println("Address");
        String s9 = sc.nextLine();
        
        System.out.println("Father name");
        String p = sc.nextLine();
        
          System.out.println("Mother name");
        String p1 = sc.nextLine();
        
        
        FileWriter f1 = new FileWriter("C:\\BioData\\Biodata.txt");
        f1.write("Personal Details \n");
     
        f1.write("Name : "+s1+"\n");
       
        f1.write("Age : "+i+"\n");
       
        f1.write("Gender : "+s2+"\n");
        
        f1.write("DOB : "+i1+"\n");
        System.out.println("");
        f1.write("Blood Group : "+s3+"\n");
        System.out.println("\n");
        System.out.println("\n");
        
        
        f1.write("Education"+"\n");
       f1.write("Qualification : "+s4+"\n");
       f1.write("College : "+s5+"\n");
       f1.write("CGPA : "+d+"\n");
       
       f1.write("Skills"+"\n");
       f1.write(s6+"\n");
       
       f1.write("Experience : "+s7+"\n");
       f1.write("Contact");
       f1.write("Phone : "+i2+"\n");
       f1.write("Email : "+s8+"\n");
       f1.write("Address : "+s9+"\n");
       
       f1.write("Family "+"\n");
       f1.write("Father name : "+p+"\n");
        f1.write("Mother name : "+p1+"\n");
       
        f1.close();
        
        
        
    }
    
}
