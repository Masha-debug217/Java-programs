 /*cat name, age,  */
 class Cat{
    String name;
    int age;

    public Cat(String n, int a)
    {
        name=n;
        age=a;
    }

    void displayRecord()
    {
        System.out.println("name: "+name);
        System.out.println("age: "+age);

    }
}
    public class Parameter{
        public static void main(String[] args){

            Cat c1= new Cat("Yuno", 2);

            c1.displayRecord();
        }
    }
