/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package June8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main04
 {
         Set<String> members = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Main04 m1 = new Main04();
        m1.menu();
    }

    void menu()
    {
        int choice;

        do
        {
            System.out.println("Student Club Management");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Search Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Count Members");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    add();
                    break;

                case 2:
                    remove();
                    break;

                case 3:
                    search();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    count();
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

            }

        } while(choice != 6);
    }

    void add()
    {
        System.out.print("Enter Member Name : ");
        String name = sc.nextLine();

        if(members.add(name))
        {
            System.out.println("Member Added");
        }
        else
        {
            System.out.println("Member Already Exists");
        }
    }

    void remove()
    {
        System.out.print("Enter Member Name : ");
        String name = sc.nextLine();

        if(members.remove(name))
        {
            System.out.println("Member Removed");
        }
        else
        {
            System.out.println("Member Not Found");
        }
    }

    void search()
    {
        System.out.print("Enter Member Name : ");
        String name = sc.nextLine();

        if(members.contains(name))
        {
            System.out.println("Member Found");
        }
        else
        {
            System.out.println("Member Not Found");
        }
    }

    void display()
    {
        if(members.isEmpty())
        {
            System.out.println("No Members Available");
            return;
        }

        System.out.println("Club Members:");

        for(String member : members)
        {
            System.out.println(member);
        }
    }

    void count()
    {
        System.out.println("Total Members = " + members.size());
    }
    
}
