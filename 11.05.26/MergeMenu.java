import java.util.Scanner;
import java.util.Arrays;

class MergeMenu
{
    int ar[];

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MergeMenu m = new MergeMenu();
        int choice;

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Enter Array");
            System.out.println("2. Sort in Ascending Order");
            System.out.println("3. Sort in Descending Order");
            System.out.println("4. Find Median");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    m.enterArray(sc);
                    break;

                case 2:
                    m.sortAscending();
                    break;

                case 3:
                    m.sortDescending();
                    break;

                case 4:
                    m.findMedian();
                    break;

                case 5:
                    m.displayArray();
                    break;

                case 6:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 6);
    }

    // 1. Enter Array
    void enterArray(Scanner sc)
    {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        ar = new int[n];

        for(int i = 0; i < ar.length; i++)
        {
            System.out.print("Enter value: ");
            ar[i] = sc.nextInt();
        }
    }