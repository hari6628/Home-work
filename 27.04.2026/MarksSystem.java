import java.util.Scanner;
class MarksSystem
{
	Scanner sc = new Scanner (System.in);
	public static void main(String [] args)
	{
		MarksSystem f1 = new MarksSystem();
		f1.menu();
	
	
	}
	
	void  menu ()
	{
		  System.out.print("ENTER THE ARRAY SIZE:");
         int size=sc.nextInt();	
		 int ar[]=new int[size];
		 boolean res = true;
	do{
		System.out.println("***Student Marks System***");
		System.out.println("1. Enter marks");
		System.out.println("2. Calculate total");
		System.out.println("3. Calculate average");
		System.out.println("4. Find grade");
		System.out.println("5. Exit");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			getMarks(ar);
		}
		
		else if(choice == 2)
		{
			int tot = Total(ar);
			System.out.println("Total marks : "+tot);
		}
		
		else if(choice == 3)
		{
			int av = Average(ar);
			System.out.println("Average marks : "+av);
		}
		
		else if(choice == 4)
         {
             char grade = Grade(ar);
              System.out.println("Grade : " + grade);
			  
			 
         }
		 
		 
		 else 
		 {
			 System.out.println("EXIT");
			 res = false;
		 }
		
		}while(res);
		
	}
	
	void getMarks(int n[])
	{
		
		
		for(int i = 0; i< n.length;i++)
		{
			System.out.print(" Enter marks : ");
			n[i] = sc.nextInt();
		}
		
		for(int i = 0; i< n.length;i++)
		{
			System.out.println(n[i]);
			
		}
	}
	
	int Total(int sums[])
	{
		int sum = 0;
		for(int i = 0; i< sums.length;i++)
		{
			sum = sum+sums[i];
	}
	return sum;
}

   int Average(int sums[])
	{
		int sum = 0;
		for(int i = 0; i< sums.length;i++)
		{
			sum = sum+sums[i];
	}
	
	int ave = sum/sums.length;
	return ave;
}


char Grade(int marks[])
{
    int avg = Average(marks);

    if(avg >= 90)
    {
        return 'A';
    }
    else if(avg >= 80)
    {
        return 'B';
    }
    else if(avg >= 65)
    {
        return 'C';
    }
    else if(avg >= 55)
    {
        return 'D';
    }
    else
    {
        return 'F';
    }
}


	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	