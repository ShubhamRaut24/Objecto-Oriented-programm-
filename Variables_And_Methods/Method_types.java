package Variables_And_Methods;

public class Method_types {

    public static void main(String[] args) {

        Operation o=new Operation();
        o.add();
        o.sub(50,10);
        System.out.println(o.mul());
        System.out.println(o.div(10,2));
        System.out.println(Operation.send());   //calling the static method with static variable

    }
}

class Operation
{
   private static int a=100;
    public void add()
    {
        int a=this.a; int b=20;
        System.out.println(a+b);
    }

    public void sub(int a, int b)
    {

       System.out.println(a-b);
    }

    public int mul()
    {
        int a=10;
        int b=20;
        return a*b;
    }

    public int div(int a,int b)
    {
        return a/b;
    }

    public static int send()
    {
        return a;
    }

}