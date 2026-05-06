import java.util.Scanner;
class EmployeeId
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int ar[] = new int [size];
		boolean res = true;
		do{
		    System.out.println("1. Enter employee ID");
		    System.out.println("2. Add employee ID");
            System.out.println("3. Remove employee ID");
            System.out.println("4. Display employee IDs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
          int pos = ar.length;
		  
		  int ar1[] = new int [ar.length+1];
		int choice = sc.nextInt();
		
		
		switch (choice)
		{
			case 1:
			{
				for(int i = 0; i<ar.length; i++)
				{	
				System.out.print("Enter employee ID: ");
				ar[i] = sc.nextInt();
				}
				 System.out.println("Employee ID added.");
                    break;
				
				
			}
			
			case 2:
			{
				
				
				System.out.print("Enter new ID: ");
				int newid = sc.nextInt();
				for(int i = 0; i<ar.length; i++)
				{
					ar1[i]=ar[i];
					
				}
				
				
				ar1[pos] = newid;
				 ar = ar1; 

                System.out.println("After adding:");
				
			 for(int i=0;i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}
		break;
	  
			}
			
			
			case 3:
			{
				System.out.print("Enter ID to remove: ");
				int key = sc.nextInt();

				int p = -1;

				
				for(int i = 0; i < ar.length; i++)
				{
					if(ar[i] == key)
					{
						p = i + 1; 
						break;
					}
				}

				if(p == -1)
				{
					System.out.println("Employee ID not found.");
				}
				else
				{
					int ar2[] = new int[ar.length - 1];

					
					for(int i = 0; i < p-1; i++)
					{
						ar2[i] = ar[i];
					}

					
					for(int i = p-1; i < ar2.length; i++)
					{
						ar2[i] = ar[i+1];
					}

					ar = ar2; 

					System.out.println("Employee ID removed.");

					for(int i = 0; i < ar.length; i++)
					{
						System.out.print(ar[i] + " ");
					}
					System.out.println();
				}
				break;
			}
			
			case 4:
			{
				System.out.println("Employee IDs:");
				for(int i = 0; i < ar.length; i++)
				{
					System.out.print(ar[i] + " ");
				}
				System.out.println();
				break;
			}

			case 5:
			{
				System.out.println("Exiting.");
				res = false;
				break;
			}
		}
			
		
		}while(res);
		
		
}
		
	}
 