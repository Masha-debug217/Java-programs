abstract class Student
{
   abstract void apply();
}
class Localstudent extends Student
{
  //  @ Override
    void apply()
    {
        System.out.println("Apply for National Id");
    }
}
class InternationalS extends Student
{
  // @Override
    void apply()
    {
        System.out.println("Apply for Visa");
    }
}
public class Abstract
{
public static void main(String[] args)
{
    Student SL= new Localstudent();
    Student IS= new InternationalS();
    SL.apply();
    IS.apply();
}

}