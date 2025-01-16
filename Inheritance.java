class Student{
    int age;
    String name;

}
class Localstudent extends Student{
    int id;

}
public class Inheritance{
    public static void main(String [] args)
    {
        Localstudent s1= new Localstudent();
        s1.name="Anold";
        s1.age= 19;
        s1.id= 42365;

        System.out.println("name: " +s1.name);
        System.out.println("age: " +s1.age);
        System.out.println("id: " +s1.id);

    }
}