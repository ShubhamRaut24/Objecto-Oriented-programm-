package Abstraction;

abstract class DemoAbstractClass {

    public void name()
    {
        System.out.println("shubham");
    }

    public int number()
    {
        return 1;
    }
    abstract public void address();  //abstract mathod

}

class Demo2 extends DemoAbstractClass{

    @Override
    public void address() {
        System.out.println("pune");
    }

    public String msg()
    {
        return "Done";
    }
}
