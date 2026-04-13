import java.util.Scanner;
class sample4

{
	public static void main (String [] args )
	{
		
		Scanner ro = new Scanner(System.in);
		int a =ro.nextInt();
		int b = ro.nextInt();
		int c = a + b + a++ + b++ + ++a + ++b;
		
		
		System.out.println(c);
		
		
		
		
	}	
	
}