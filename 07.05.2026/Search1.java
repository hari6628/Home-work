import java.util.Scanner;
class Search1
{
	Scanner sc = new Scanner (System.in);
	public static void main (String args [])
	{
		
		Search1 f1 = new Search1 ();
		System.out.println("Enter the array size : ");
		int size = f1.sc.nextInt();
		
		int ar [] = new int [size];
		boolean res = true;
		do
		{
		System.out.println("1.Insert Elements : ");
		System.out.println("2.Display Elements : ");
		System.out.println("3.Linear Search : ");
		System.out.println("4.Binary Search : ");
		System.out.println("5.Exit ");
		
		int choice = f1.sc.nextInt();
		if(choice ==1)
		{
			f1.insert(ar);
		}
		else if(choice ==2)
		{
			f1.display(ar);
		}
		
		else if(choice == 3)
		{
			int target = f1.sc.nextInt();
			int tar = f1.linear(ar,target);
			System.out.println(tar);
		}
		
		else if(choice == 4)
		{
			int target = f1.sc.nextInt();
			int tar = f1.binary(ar,target);
			System.out.println(tar);
		}
		
		else
		{
			System.out.println("exit.....");
			res = false;
		}
		
		
		
		}while(res);		
	}
	
	void insert(int ar1[])
	{
		for(int i = 0; i<ar1.length; i++)
		{
			ar1[i]=sc.nextInt();
		}
	}	
	
	void display (int ar2[])
	{
		for(int i = 0; i<ar2.length; i++)
		{
			System.out.println("Element "+(i+1)+": "+ar2[i]);
		}
	}
	
	int linear(int ar3[],int a)
	{
		for(int i = 0; i<ar3.length; i++)
		{
			if(ar3[i]==a)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	int binary(int ar4[],int b)
	{
		int left = 0;
		int right = ar4.length-1;
		
		while(left<=right)
		{	
	int mid = (left+right)/2;
		if(ar4[mid]==b)
		{
			return mid;
		}
		
		else if(ar4[mid]<b)
		{
			left = mid+1;
		}
		
		else if(ar4[mid]>b)
		{
			right = mid-1;
		}
		}
		return -1;
	}
}