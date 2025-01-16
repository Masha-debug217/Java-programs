/* write a java program to initialize an array with the following values
...5, 10,15, 20, 25, 30, then print each element in the array with its index */
public class topic
{
    public static void main(String[]args)
    {
        int []myValue= {5, 10, 15, 20, 25, 30};
        int count=0;
        for(int i=0; i<6; i++ )
        {
          System.out.println("Index "+ count + ": " +myValue[i]);  
          count++;
        }
    }
}