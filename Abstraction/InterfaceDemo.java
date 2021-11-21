package Abstraction;

public interface InterfaceDemo {

    static final String name="zemoso";

    public void info();
    public int getNumber();

    static void getSalary() {   //can have static methods but needs implementation for that methods
   }
    default int setName(){     //can have default methods but needs implementation for that methods
     return 0;
    }

    private void Name() {  //can have private methods but needs implementation for that methods

    }


}
class Demo implements InterfaceDemo{

    @Override
    public void info() {
        System.out.println("welcome");
    }


    @Override
    public int getNumber() {
        return 1;
    }
}
