import java.util.Scanner;
class Secondmax
{
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int ar[] = new int [size];
		
		for(int i = 1; i< ar.length; i++)
		{
			System.out.print("Enter the "+i+"th Number :");
			 ar[i] = sc.nextInt();
			
		}
		
		for(int i = 1; i< ar.length; i++)
		{
			System.out.println(ar[i]);
			
		}
		
		int max = 0;
		int secondmax = 0;
		
		if(ar[0]>ar[1])// 0 - 23 , 1 - 20
		{
			max = ar[0];
            secondmax = ar[1];
        } else {
            max = ar[1];
            secondmax = ar[0];
        }
		
		
		for(int i = 2; i< ar.length; i++)
		{
			if(ar[i]>max)
			{
				secondmax = max; // sec max = 23 max = 30
				max =ar[i];
			}
			
			else if (ar[i] > secondmax && ar[i] != max)
			{
				secondmax = ar[i];
			}
			
			
		}
		
		System.out.println("Second Maximum = " + secondmax);
		
		}
		
		}