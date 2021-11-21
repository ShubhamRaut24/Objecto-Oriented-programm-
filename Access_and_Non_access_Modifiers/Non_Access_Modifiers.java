package Access_and_Non_access_Modifiers;

class Fan{

    final int speed=40;

    static int price=1200;  // get

    int a=0;
    Fan(int speed)
    {
      //this.speed=speed;    shows erros here if try to change value of variable which is final
    }

    public Fan() {

    }

    final public void setSpeed()
    {
        System.out.println("here speed is set by user");
    }

    static void staticCheck()
    {
       // System.out.println("print a="+a);  // showing error becase int a is not static so we can not use that in static method
    }
}



final class Non_Access_Modifiers extends Fan {


   // public void setSpeed()  // show error that method is final so can not override
    {
        System.out.println("parent setSpeed method is override here ");
    }
}
//class Demo extends Non_Access_Modifiers{   // showing error because we can not extend class which is final

//}
