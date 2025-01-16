/*An example of polymorphism */
class Bank
{
    double display()
    {
        return 0.0;
    }
}
class KCB extends Bank
{
    @override
    double display()
    {
     return 0.10;
    }
}
class Equity extends Bank
{
    double display()
    {
        return 0.12;
    }
}
public class Banks
{
    public static void main(String[] args)
    {
        KCB Kc=new KCB ();
        Equity Eq= new Equity();
        System.out.println("KCB interest rate: "+Kc.display());
        System.out.println("Equity interest rate: "+Eq.display());
    }
}