/* write a java program to create an array of 5 integers.
 Prompt the user to input each integer, store it in the array,
  and then display the array element in reverse order. */
  import java.util.Scanner;
  public class Array
  {
    public static void main(String[]args)
    {
        Scanner enter= new Scanner(System.in);
      
      int count=0;
      System.out.println("Enter your values:");
      for(int i=0; i<=5; i++)
      {
        System.out.println("Index" +count +":");
        count++;
      }
      enter.close();
    }
  }