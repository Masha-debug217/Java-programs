interface Student
{
    void apply();
}
class LocalStudent implements Student
{
    @Override
    public void apply()
    {
        System.out.println("Apply for National Id");
    }
}
class InternationalS implements Student
{
    @Override
    public void apply()
    {
        System.out.println("Apply for Visa");
    }
}
public class Interface
{
    public static void main(String [] args)
    {
        Student s1= new LocalStudent();
        Student s2= new InternationalS();
        s1.apply();
        s2.apply();
    }
}