class Override
{
    void display()
    {
        System.out.println("Main class");
    }
}
class Overri extends Override
{
    void display()
    {
        System.out.println("Come next");
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
        Overri ov=new Overri();
        ov.display();
    }
}