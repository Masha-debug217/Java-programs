

class Scanner {
    String name;
    int number;
    String size;
    String shape;
    String price;

    void insertRecord(String n, int no, String s, String sh, String p) {
        name = n;
        number = no;
        size = s;
        shape = sh;
        price = p;
    }

    void displayRecord() {
        System.out.println(name + " \n" + number + " " + size + " " + shape + " " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner f1 = new Scanner();
        Scanner f2 = new Scanner();
        Scanner f3 = new Scanner();

        f1.insertRecord("Table", 23, "small", "oval", "$45");
        f1.displayRecord();
        f2.insertRecord("Chair", 34, "medium", "rectangular", "$64");
        f2.displayRecord();
        f3.insertRecord("Bed", 45, "large", "circular", "$78");
        f3.displayRecord();
    }
}