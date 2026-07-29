/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter02;


public class Markadapter implements Grade
{
    private Oldsystem oldmarksystem;

    public Markadapter(Oldsystem oldmarksystem) {
        this.oldmarksystem = oldmarksystem;
    }

    @Override
    public void displaygrade() 
    {
        
        int marks =oldmarksystem.gettotalmarks();
      if (marks >= 90)
            System.out.println("Grade : A");
        else if (marks >= 75)
            System.out.println("Grade : B");
        else if (marks >= 60)
            System.out.println("Grade : C");
        else if (marks >= 40)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");
        
    }
    
    
    
}
