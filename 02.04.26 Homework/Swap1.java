class Swap1
{
	public static void main (String [] args)
	{
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("Before swapping A =" +a);
		System.out.println("Before swapping B =" +b);
		System.out.println("Before swapping C =" +c);
		
		
		a= a+b+c;
		c = a- (b+c);
		b = a-(b+c);
		a = a- (b+c);
		
		System.out.println("After swapping A =" +a);
		System.out.println("After swapping B =" +b);
		System.out.println("After swapping C =" +c);
		
		
	
		
	}
	
	
	
}