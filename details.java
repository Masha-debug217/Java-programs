import java.util.Scanner;
public class details {
    public static void main(String[] args){
        Scanner enter=new Scanner (System.in);
        
        String name;
        String regno;
        String course;
        String faculty;
        int age;
    
    
    System.out.println("Enter your name");
    name=enter.nextLine();    

    System.out.println("Enter your regno");
    regno=enter.nextLine();

    System.out.println("Enter your course");
    course=enter.nextLine();

    System.out.println("Enter your faculty");
     faculty=enter.nextLine();

    System.out.println("Enter your age");
    age= enter.nextInt();

}
}