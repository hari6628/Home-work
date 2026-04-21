import java.util.Scanner;
class MatrixAddition
{
	public static  void main(String args [])
	{
		Scanner sc =  new Scanner (System.in);
		System.out.print("ENTER THE ROW SIZE : ");
		int rows = sc.nextInt();
		System.out.print("ENTER THE COLUMN SIZE : ");
		int col = sc.nextInt();
	int ar1 [][] = new int [rows ] [col] ;
	 int ar2[][] = new int[rows][col];
        int sum[][] = new int[rows][col];


    System.out.println("ENTER VALUES FOR MATRIX 1:");
	for(int i=0; i < rows; i++)
	{
		for(int j=0;j< col; j++)
		{
			System.out.print("ENTER THE VALUE OF "+i+" "+j+" ");
			ar1[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0; i < rows; i++)
	{
		for(int j=0;j< col; j++)
		{
			System.out.print(ar1[i][j]+" ");
			
		}
		System.out.println(" ");
	}
	
	
	System.out.println("ENTER VALUES FOR MATRIX 2:");
	for(int i=0; i < rows; i++)
	{
		for(int j=0;j< col; j++)
		{
			System.out.print("ENTER THE VALUE OF "+i+" "+j+" ");
			ar2[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0; i < rows; i++)
	{
		for(int j=0;j< col; j++)
		{
			System.out.print(ar2[i][j]+" ");
			
		}
		System.out.println(" ");
	}
	
	 for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                sum[i][j] = ar1[i][j] + ar2[i][j];
            }
        }

        
        System.out.println("RESULT MATRIX:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
	}
}