import java.util.Scanner;
class MaxArray
{
	public static void main(String args [])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size = sc.nextInt();
	int ar[] = new int [size];
	System.out.println("Enter the value : ");
	for(int i = 0; i<ar.length; i++)
	{
		ar[i]=sc.nextInt();
		
	}
	
	for(int i = 0; i<ar.length; i++)
	{
		System.out.print(ar[i]+" , ");
		
	}
	
	int max = ar[0];
	for(int i = 0; i<ar.length; i++)
	{
		if(max<ar[i])
		{
			max = ar[i];
		}
		
	}
	
	System.out.println("Maximum value of the array : "+max);
	
	}
	
	
}
