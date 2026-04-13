import java.util.Scanner;
class Loan
{
	
	public static void main (String [] args )
	{
		
		Scanner sc = new Scanner(System.in);
		Scanner se = new Scanner(System.in);
		Scanner sr = new Scanner(System.in);
		System.out.println("Bank Loan Eligibility System");
		System.out.print("Name : ");
		String name = sc.nextLine();
		
		System.out.print("Age : ");
		int age = se.nextInt();
		
		System.out.print("Monthly Salary : ");
		int sal = se.nextInt();
		
		System.out.print("CIBIL Score : ");
		int scr = se.nextInt();
		
		System.out.print("Existing customer : ");
		boolean cus = sr.nextBoolean();
	
		System.out.println("  ");
		System.out.println("   ");
		
		System.out.println("Checking Loan Eligibility...");
		System.out.println("   ");
		
		if(age>=21)
		{
			if(sal>=20000)
			{
				if(scr>=750)
				{
					
				if(cus == true){
					System.out.println(name + " is eligible for Premium loan");
					
					
				}
				
				else{System.out.println(name + " is eligible for Standard loan" );}
				}
				
				else if(scr > 650 && scr < 749)
				{
					System.out.println(name + " is Eligible for Low Amount Loan" );
					
				}
				else if (scr < 650)
				{
					System.out.println(name + " Not Eligible Low CIBIL Score" );
					
				}
				
				else {System.out.println(name + " = Invaild score" );}
			}
			
			else if(sal < 20000)
			{
				System.out.println(name + " =  Not Eligible Low Salary" );
				
			}
			
			else {System.out.println(name + " =  Invaild" );}
		}
		
		
		else if (age < 21){
			
			System.out.println(name + " =  Not Eligible Age criteria not satisfied" );
			
		}
		
		else {System.out.println(name + " =  Invaild" );}
		
		
		
		
		
		
		
	}
	
}