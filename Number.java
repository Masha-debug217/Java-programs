/*class Number{
    public static void main(String[] args){
   int[] Value= {10,20,30,40,50};
   for (int i=0; i<5; i++)
   {
    System.out.println(Value[i]);
   }
    }
}*/
import java.util.Scanner;
public class Number{
    public static void main(String [] args){
        Scanner enter= new Scanner (System.in);
        int[] number= new int[5];
        int i;
        int sum = 0;
        
        for(i=0; i<5; i++){
            System.out.println("Enter five numbers:");
            number[i] = enter.nextInt();
            sum += number[i];
     
        }
        System.out.println("sum: "+sum);
    }

}