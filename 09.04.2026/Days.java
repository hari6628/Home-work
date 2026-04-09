import java.util.Scanner;

class Days
{
public static void main (String [] args)
{

Scanner sc = new Scanner(System.in);


System.out.print("What day is  today? : ");

int day = sc.nextInt();
if (day == 1){
	System.out.print("Today is : ");
	System.out.println("Monday");
	
}

else if (day == 2){
	System.out.print("Today is : ");
	System.out.println("Tuesday");
}

else if (day == 3){
	System.out.print("Today is : ");
	System.out.println("Wednesday");
}

else if (day == 4){
	System.out.print("Today is : ");
	System.out.println("Thursday");
}

else if (day == 5){
	System.out.print("Today is : ");
	System.out.println("Friday");
}

else if (day == 6){
	System.out.print("Today is : ");
	System.out.println("Saturday");
}

else if (day == 7){
	System.out.print("Today is : ");
	System.out.println("Sunday");
}

else {System.out.println("Invalid");}



}


}