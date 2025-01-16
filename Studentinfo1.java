class Users{
    int id;
    String name;
    }
    public class Studentinfo1{
        public static void main(String[] args){
            Users u1= new Users();
            Users u2= new Users();

            u1.name="Eric Mwangu";
            u1.id=42143264;
            u2.name="Winnie Wanjiku";
            u2.id=42242364;

            System.out.println( "User1: "+u1.name);
            System.out.println("Id: "+u1.id);

            System.out.println( "User2: "+u2.name);
            System.out.println("Id: "+u2.id);
        }
    } 