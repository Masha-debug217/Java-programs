
class furniture{
    String name;
    int number;
    String size;
    String shape;
    String price;

void insertRecord(String n, int no, String s, String sh, String p){
    name = n;
    number = no;
    size =s;
    shape = sh;
    price = p;
}

void displayRecord (){
    System.out.println (name +" "+ number+" "+ size + " "+ shape +" "+ price);
}
}
public class Main2 {
    public static void main (String [] args){
        furniture f1 = new furniture();
        furniture f2 = new furniture();
        furniture f3 = new furniture();
        
        f1.insertRecord("Table", 23, "small", "oval", "$45" );
        f1.displayRecord();
        f2.insertRecord("Chair", 34, "medium", "rectangular", "$64" );
        f2.displayRecord(); 
        f3.insertRecord("Bed", 45, "large", "circular", "$78" );
        f3.displayRecord();
        
}
}