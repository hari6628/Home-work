import java.util.Scanner;

class CountForty 
{
    public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int ar[] = new int [size];
		System.out.println("Enter the value : ");
		for(int i = 0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		for(int i = 0; i<ar.length; i++)
		{
			System.out.print(ar[i]+ " , ");
		}
		System.out.println(" ");
		int count = 0;
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]==40)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}