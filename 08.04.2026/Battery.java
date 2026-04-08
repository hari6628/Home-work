class Battery

{
public static void main (String [] args)




	
	{
		
		//Mobile Battery Status Checker
//The user enters battery percentage.
//Using if–else-if, display:

//≥ 80 → Battery Full

//30–79 → Battery Normal

//< 30 → Low Battery – Charge Now


		int  Battery = 30;


if(Battery >= 80 ){
	
	System.out.println("Battery Full");
	
}

else if (Battery >= 30 && Battery <= 79){
	
	
	System.out.println(" Battery Normal");
	
}

else if (Battery < 30)
{	
		
		System.out.println("Charge Now");
}


else{
	
	System.out.println("Invaild");
	
}
		
	}
	
}