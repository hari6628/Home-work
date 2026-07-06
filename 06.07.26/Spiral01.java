/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package July.J06;

import java.util.Scanner;

public class Spiral01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        int[][] matrix = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
    }
    
}
