import java.util.Scanner;
class Print0
{
	public static void main (String [] args)
	{
				Scanner sc = new Scanner(System.in);
		int num[]= new int[3];
		for(int i=0; i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
			
		}
		
		 for(int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");
        }
		
	}
}