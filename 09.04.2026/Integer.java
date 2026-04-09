import java.util.Scanner;

class Integer
{
public static void main (String [] args)
{

Scanner sc = new Scanner(System.in);


System.out.print("Enter the digit : ");

int digit = sc.nextInt();
if (digit>0){
	
	System.out.println("Positive");
	
}

else if (digit < 0){
	System.out.println("Negative");
}

else {System.out.println("Zero");}



}


}