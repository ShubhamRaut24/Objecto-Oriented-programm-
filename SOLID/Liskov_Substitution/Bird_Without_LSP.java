package SOLID.Liskov_Substitution;

public class Bird_Without_LSP {

    public void fly()
    {
        System.out.println("i can fly");
    }
    public void info()
    {
        System.out.println("my info ");
    }

}

class Sparrows extends Bird_Without_LSP{



}
class Peacocks extends Bird_Without_LSP{

}
class Demo{
    public static void main(String[] args) {
        Peacocks peacocks=new Peacocks();
        peacocks.fly();
        peacocks.info();
    }
}
