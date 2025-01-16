class Student
{
 int age;
 String name;
 int rollno;
 double fee;

 Student(String n, int a, int r, double f)
{
    name=n;
    age=a;
    rollno=r;
    fee=f;
}
void Display ()
{
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Roll number: "+rollno);
    System.out.println("Fee: Ksh."+fee);
}
}
public class Constractor
{
public static void main (String [] args)
{
    Student s1= new Student("Yuno", 19, 14356, 723000.0);
    s1.Display();
    
}
}