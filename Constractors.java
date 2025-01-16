/*breed name age height */
class Dog
{
    String name;
    String breed;
    int age;
    double height;

    public Dog()
    {
        name="Asta";
        breed="Germanshephard";
        age=2;
        height=1.5;
    }
    
}
public class Constractors{
    public static void main(String[] args)
    {
        Dog d1= new Dog();
        System.out.println("name: "+d1.name);
        System.out.println("breed: "+d1.breed);
        System.out.println("age: "+d1.age);
        System.out.println("height: "+d1.height);

    }
}