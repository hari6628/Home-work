import java.util.Scanner;

class Even
{
public static void main (String [] args)
{

Scanner sc = new Scanner(System.in);


System.out.print("Enter the digit : ");

int a = sc.nextInt();
if (a%2 ==0){
	
	System.out.println("Even");
	
}

else if (a%2 != 0){
	System.out.println("Odd");
}

else {System.out.println("Invaild");}



}


}