package SOLID.Liskov_Substitution;

public class Bird {

    public static void info()
    {
        System.out.println("mu info is");
    }

}
class FlyingBird extends Bird{
    public static void flying()
    {
        System.out.println("i can fly");
    }
}

class Sparrow extends FlyingBird{

    public static void main(String[] args)
    {
        flying();
        info();
    }

}
class Peacock extends Bird{
    public static void main(String[] args) {
        info();

    }
}

