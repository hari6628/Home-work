/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spiral;


public class Spiral01 
{
    public static void main(String[] args) 
    {
        int ar[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

int top = 0;
        int bottom = ar.length - 1;
        int left = 0;
        int right = ar[0].length - 1;

        while (top <= bottom && left <= right)
        {
            for (int i = left; i <= right; i++)
            {
                System.out.print(ar[top][i] + " ");
            }
        
        
    }
    
}
