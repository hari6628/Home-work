import java.util.Scanner;
class PrimeNumber
{
	public static void main(String [] args)
	{
		
	
	
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		PrimeNumber f1 = new PrimeNumber();
		f1.isPrime(n);
		
		
		
	}
	
	
	void isPrime(int n)
	{
		int count = 0;
		if(n<2)
		{
			System.out.println(n+"not a prime number");
			
			
			
		}
		
		for(int i = 1; i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" not a prime number");
		}
		
	}
}	