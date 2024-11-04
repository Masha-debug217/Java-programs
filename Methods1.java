/*object emp of type Employee
 * age, name, monthly salary
 */
class Employee{
    int age;
    double msalary;
    String name;

    void insertRecord(String n, int a, double m)
    {
        age=a;
        msalary=m;
        name=n;
    }

    void displayRecord(){
        System.out.println("name: "+  name);
        System.out.println("age: "+  age);
        System.out.println("msalary: "+  msalary);
        
    }

}
public class Methods1{
    public static void main(String[] args)
    {
        Employee emp= new Employee();

        emp.insertRecord("Edward Cullen", 19, 4500.0 );
        emp.displayRecord();
    }
}
