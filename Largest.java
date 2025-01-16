/*Implement a program to find the largest of three numbers */

import java.util.Scanner;
public class Largest
{
    public static void main(String [] args)
    {
      Scanner enter=new Scanner(System.in);
      System.out.println("Enter three numbers");
      int a= enter.nextInt();
      int b=enter.nextInt();
      int c=enter.nextInt();

      System.out.println("You have entered: a= " +a+ " "+ "b= " + b+ " " + "c= " +c);

      if (a>b && a>c)
      {
        System.out.println("a is the greatest number");
      }
        else if (b>a && b>c)
        {
          System.out.println("b is the greatest number");
        }
        else if (c>a && c>b)
        {
            System.out.println("c is the greatest number");
        }
    }
}