/*Create a program to calculate the sum of two numbers entered by the user. */
import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        Scanner enter= new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = enter.nextDouble();

        System.out.println("Enter b: ");
        double b = enter.nextDouble();

        double sum= a+b;
        System.out.println("Sum: " + sum);

        enter.close();
    }
    
}
