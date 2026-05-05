class PassbyRef1
{
	public static void main (String args [])
	{
		int ar[] = {21,22,23};
		PassbyRef1 f1 = new PassbyRef1();
		
		 System.out.println("Before calling the method : ");
		 System.out.println(ar[0]);
		 System.out.println(ar[1]);
		 System.out.println(ar[2]);
		 f1.display(ar);
		 System.out.println("After calling the method : ");
		 
		  System.out.println(ar[0]);
		 System.out.println(ar[1]);
		 System.out.println(ar[2]);
		 
		 
	}
	
	void display(int ar1[])
	{
		
		ar1[0]=33;
		
	}
}
