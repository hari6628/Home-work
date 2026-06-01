/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static03;

/**
 *
 * @author harin
 */
public  class Bank 
{
        static final String bank = "XYZ bank";
        static final double INTEREST_RATE = 7.5;
        
          static double principal ;  
         static  int years;
         static double interest;
        
        static void calculateInterest(double p,int y)
        {
            principal = p;
            years=y;
            
            interest =(principal*INTEREST_RATE*years)/100;
            
        }
        
        void display()
        {
            System.out.println("Bnak Name : "+bank);
            System.out.println("Principal Amount : "+principal);
            System.out.println("Years : "+ years);
            System.out.println("Interest Amount "+interest);
        }
    
}
