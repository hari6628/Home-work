import java.util.Scanner;
class Count

{
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int count =0;
		
		if (a == 0)
		{
					System.out.println("Zero");
		}
		else {
			for(int i = a; i != 0; i/=10)
		{
			count++;
			
			
		}
		}
		
		
		
		System.out.println("Number = "+ a);
			System.out.println("Number of digits = "+count);
			
			
	}
	
}