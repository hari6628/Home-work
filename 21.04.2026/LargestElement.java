import java.util.Scanner;
class LargestElement
{
	public static  void main(String args [])
	{
		Scanner sc =  new Scanner (System.in);
		System.out.println("ENTER THE ROW SIZE");
		int rows = sc.nextInt();
		System.out.println("ENTER THE COLUMN SIZE");
		int col = sc.nextInt();
	int ar [][] = new int [rows ] [col] ;
	for(int i=0; i < rows; i++)
	{
		for(int j=0;j< col; j++)
		{
			System.out.println("ENTER THE VALUE OF "+i+" "+j+" ");
			ar[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0; i < rows; i++)
	{
		for(int j=0;j< col; j++)
		{
			System.out.print(ar[i][j]+" ");
			
		}
		System.out.println(" ");
	}
	
	int max = ar[0][0];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(ar[i][j] > max)
                {
                    max = ar[i][j];
                }
            }
        }
		
		 System.out.println("Largest number = " + max);
	
	}
}