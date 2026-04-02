class Swap2

{
public static void main (String [] args)
{
	
	int a = 5;
	int b = 15;
	int c = 25;
	
	System.out.println("Before rotation:");
	System.out.println("a = " + a);
	    System.out.println("b = " + b);
		System.out.println("c = " + c);
	
       int temp = c;
        c = b;
        b = a;
        a = temp;

        System.out.println("After rotation:");
        System.out.println("a = " + a);
	    System.out.println("b = " + b);
		System.out.println("c = " + c);
	
	
	
	
	
	
	
}}