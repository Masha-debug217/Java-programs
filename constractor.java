/*This keyword */
class Student
{
    String name;
    int age;
    int rollno;
    double fee;

    Student(String name, int age, int rollno, double fee)
    {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.fee = fee;
    }
     void Display()
     {
      System.out.println("Name:"  + name);
      System.out.println("Age:"  + age);
      System.out.println("Rollno:"  + rollno);
      System.out.println("Fee: Ksh." + fee);

     }
}

public class  constractor
{
    public static void main (String[] args)
    {
        Student s1 = new Student("Asta", 20, 134265, 459000.0);
        Student s2 = new Student("Yuno", 21, 144265, 469000.0);

        s1.Display();
        s2.Display();

    }
}
