class PassbyValue1
{
	public static void main (String args [])
	{
		int a = 0;
		PassbyValue1 f1 = new PassbyValue1();
		
		 a = 10;
		 System.out.println("Outside the method before calling "+a);
		 f1.display(a);
		 
		 System.out.println("Outside the method After calling "+a);
		
	}
	 
	void display(int a)
	{
		a = 20;
		System.out.println("Inside the method "+a);
		
	}
}
