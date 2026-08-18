/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counthashandstar;

import java.util.Scanner;

public class Counthashandstar {

    
    public static void main(String[] args) 
    {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int starCount = 0;
        int hashCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*') {
                starCount++;
            } 
            else if (s.charAt(i) == '#') {
                hashCount++;
            }
        }

        int result = starCount - hashCount;

        System.out.println(result);
        
    }
    
}
