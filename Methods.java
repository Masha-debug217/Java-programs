class Users{
    String name;
    int id;

    void insertRecord(String n, int i)
    {
    name=n;
    id=i;
    }

    void displayRecord(){
        System.out.println(name + " " + id);
    }
}
public class Methods{
    public static void main(String[] args)
    {
        Users u1= new Users();
        Users u2= new Users();

        u1.insertRecord("Winnie", 42143264);
        u2.insertRecord("Erick", 432254365);

        u1.displayRecord();
        u2.displayRecord();
    }
}