
import java.util.Scanner;
class Print
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num[]= new int[3];
		for(int i=0; i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
			
		}
		int sum = num[0]+num[1];
		System.out.println(sum);
		
	}
}