import java.util.Scanner;
class Print2
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE : ");
		int size=sc.nextInt();
		int ar[]=new int [size];
		boolean result = true;
		do
		{
			System.out.println("1.Insert elements");
			System.out.println("2.Display elements");
			System.out.println("3.Count Even numbers");
			System.out.println("4.Count Odd numbers");
			System.out.println("5.Exit");
			
			int choice = sc.nextInt();
			if(choice ==1)
			{
				for(int i=0; i<ar.length;i++)
				{
					System.out.println("ENTER THE "+i+"th VALUE");
					ar[i]=sc.nextInt();
				}
				
				
			}
			
			else if(choice ==2)
			{
				for(int i=0; i<ar.length;i++)
				{
					System.out.println(ar[i]);
					
				}
			}
			
			else if(choice ==3)
			{
				int a = 0;
				for(int i=0; i<ar.length;i++)
					
				{
					if(ar[i]%2==0)
					{
						
					a++;
					}
					
				}
				System.out.println(a);
			}
			
			else if(choice ==4)
			{
				int a = 0;
				for(int i=0; i<ar.length;i++)
					
				{
					if(ar[i]%2!=0)
					{
					a++;
					}
					
				}
				System.out.println(a);
			}
			else{
				result = false;
			}
	}while(result);
		
	}
}