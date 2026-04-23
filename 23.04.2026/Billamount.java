import java.util.Scanner;
class Billamount
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Number of items : ");
		int items = sc.nextInt();
		int ar[] = new int [items];
		
		
		
		
		for(int i = 0; i< ar.length; i++)
		{
			System.out.print("Enter the price of item "+(i+1)+" : ");
			 ar[i] = sc.nextInt();
			
		}
		
		double total = 0;
		double discount = 0;
		
		
		for(int i = 0; i< ar.length; i++)
		{
			

			total = total+ar[i];
			
		}
		
		if(total > 5000)
		{
			System.out.println("Total Amount : "+total);
			 discount = total*20/100;
			System.out.println("Discount     : "+discount);
			
			System.out.println("Final Amount : "+ (total-discount));
			
			
		}
		
		else if(total > 2000)
		{
			System.out.println("Total Amount : "+total);
			 discount = total*10/100;
			System.out.println("Discount     : "+discount);
			
			System.out.println("Final Amount : "+ (total-discount));
		}
		
		else 
		{
			System.out.print("No discount ");
		}
	}
}