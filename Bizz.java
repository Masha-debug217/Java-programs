/*Using a medhod, initialize the object emp of type Employee 
that has employee age, name and monthly salary. Display employee Record */
class Employee
{
    int age;
    String name;
    double msalary;

    void insert(String n, int a, double ms)
    {
        age=a;
        name= n;
        msalary=ms;
    }

    void display()
    {
        System.out.println(" Employee name: "+ name);
        System.out.println(" Employee age: "+ age);
        System.out.println(" Employee monthly salary: Ksh."+msalary);
    }

}

public class Bizz
{
    public static void main(String[] args)
    {
        Employee emp= new Employee();
        emp.insert("Noell Silva", 19, 14500.0);
        emp.display();
    }
}