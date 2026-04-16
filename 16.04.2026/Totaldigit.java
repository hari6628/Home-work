import java.util.Scanner;
class Totaldigit
{
	public static void main (String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digit = ");
		int a =sc.nextInt();
		
		int b = 0;
		
		if(a <0)
		{ a = -a;}
	else if(a == 0)
	{b =1; }

else  
{
	while(a!=0)
	{
		a= a/10;
		b++;
		
	}
	
}

  System.out.println("Number of digits = " + b);
}
}