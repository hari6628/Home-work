class Ticket

{
public static void main (String [] args)

	
	{
		//Movie Ticket Price Calculator
//The user enters age.
//Using if–else conditions, calculate and display the ticket price:

//Age < 12 → ₹80

//Age 12–59 → ₹150

//Age ≥ 60 → ₹100



int  age = 40;


if(age < 12 ){
	
	System.out.println("Rs.80");
	
}

if (age >=12 && age <=59){
	
	
	System.out.println("Rs.150");
	
}

else
{	
		
		System.out.println("Rs.100");
}



		
	}
	
}