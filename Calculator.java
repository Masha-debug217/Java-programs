import java.util.Scanner;
/*class Calc
{
int a;
int b;
}*/
public class Calculator
{
    public static void main (String[] args)
    {

        /*double num1, num2;
        double answer;
        String operator;*/
      Scanner enter= new Scanner(System.in);
      System.out.println("You must write your numbers in the format of 0.0");
  
      System.out.print("Enter first number: " );
      double num1 = enter.nextDouble();
    
      System.out.print("Enter second number: " );
      double num2 = enter.nextDouble();

      System.out.println("Choose an operator ( +, -, /, *, %)");
      char operator = enter.next().charAt(0);

      double answer =0;

          if(operator == '+')
       {
           answer = num1+ num2;
           System.out.println(   num1+  " " +"+"+  " " + num2 + " " +"=" + " " +answer);
       }
          else if (operator == '-')
       {
           answer = num1- num2;
           System.out.println(   num1+  " " +"-"+  " " + num2 + " " +"=" + " " +answer);
       }
          else if(operator == '*')
       {
          answer = num1 * num2;
          System.out.println(  num1+  " " +"*"+  " " + num2 + " " +"=" + " " +answer);
       }
          else if(operator == '/')
       {
            if(num2!=0)
         {
             answer = num1 / num2;
             System.out.println(  num1+  " " +"/"+  " " + num2 + " " +"=" + " " +answer);
         }
            else 
         {
            System.out.println( "Division by zero results to a math error");
         }
        
        }
          else if(operator == '%')
      {
            if(num2!=0)
         {
            answer = num1 % num2;
            System.out.println(  num1+  " " +"%"+  " " + num2 + " " +"=" + " " +answer);
         } 
            else 
         {
            System.out.println( "Modulus by zero results to a math error");
         }
      }
        else
         {
            System.out.println( "Invalid operator");
         }
         enter.close();

}
    
   
}

