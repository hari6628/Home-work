import java.util.Scanner;
class BankBalance
{
	Scanner sc = new Scanner (System.in);
	double balance = 0;
	public static void main(String [] args)
	{
		BankBalance f1 = new BankBalance();
		f1.menu();
	
	
	}
	
	void  menu ()
	{
		  
		 boolean res = true;
	do{
		System.out.println("*** Bank Balance***");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
	
		System.out.println("4. Exit");
		
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			deposit();
		}
		
		else if(choice == 2)
		{
			withdraw();
		}
		
		else if(choice == 3)
		{
			checkBalance();
		}
		
		 
		 
		 else 
		 {
			 System.out.println("EXIT");
			 res = false;
		 }
		
		}while(res);
		
	}
	
	void deposit()
	{
		
		 System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
		  if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposited successfully.");
        }
        else
        {
            System.out.println("Invalid amount.");
        }
    }

		
		
		
	
	
	void withdraw()
	{
		System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
		if(amount <=0)
		{
			System.out.println("Invalid amount.");
		}
		else if(amount >balance )
		{
			System.out.println("Insufficient");
		}
		else
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
		
    }

   void checkBalance()
    {
        System.out.println("Current Balance: " + balance);
    }





	

}