import java.util.Scanner;
class Fibonacci 
{
public static void main (String [] args)
{
  Scanner sc = new Scanner(System.in);
          


        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
  
  Fibonacci f1= new Fibonacci ();
   f1.series(n);
}


void series (int n)
{
	int a = 0, b = 1, c;
        
        System.out.print("Fibonacci series : ");
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
      }

}
}