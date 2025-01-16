/*Write a program to check if a given number is even or odd */

import java.util.Scanner;
public class EvenOdd
{
    public static void main (String [] args)
    {
      Scanner enter= new Scanner (System.in);

      System.out.println("Enter a number");
      int a= enter.nextInt();
      double b= a%2;

      if(b==0)
      {
        System.out.println( a + " is an even number");

      }
        else
         {
            System.out.println( a + " is an odd number");
         }
      
         enter.close();
    }
}