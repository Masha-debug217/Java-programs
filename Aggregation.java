class Address
{
    String street;
    String city;

Address(String s, String c)
{
    street=s;
    city=c;
}
}
class Student
{
int age;
String name;
Address address;

Student( String n, int a, Address ad)
{
    age= a;
    name=n;
    address=ad;
}
void Display()
{
    System.out.println("name: " +name);
    System.out.println("age: " +age);
    System.out.println("street: " +address.street);
    System.out.println("city: " +address.city);
}
}
public class Aggregation
{
    public static void main(String[] args)
 {
    Address a1= new Address ("Whitehouse", "Nakuru");
    Address a2= new Address ("Thika", "Nairobi");
    Student s1= new Student ("Yuno", 20, a1);
    Student s2= new Student ("Asta", 19, a2);
    s1.Display();
    s2.Display();
 }   
}