class Student
{
    static String Institution = "Egerton University" ;
    int rollno;
    String name;
    double fee;

    Student(String n, int r, double f)
    {
        name=n;
        rollno=r;
        fee=f;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Fee: Ksh." + fee);
        System.out.println("Institution: " + Institution);
    }
}
public class StaticKeyword
{
    public static void main (String[] args)
    {
        Student s1 = new Student("Nozel Silva", 3456, 45900.00);
        s1.display();
    }
}