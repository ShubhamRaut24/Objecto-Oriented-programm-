package Variables_And_Methods;

class Fan {


     boolean isOn=true;   //instace variable example;
     static int speed=10;    // static variable
    public void setOn()
    {
        int var=10;   // local variable
        speed=50;
        System.out.println("fan is on "+isOn);
        System.out.println(var);
        System.out.println(speed);
        System.out.println("---------------------------------");
    }
    public void setOff()
    {
        isOn = false;
        speed=0;
        System.out.println("fan is off "+isOn);
        System.out.println(speed);
        System.out.println("---------------------------------");
    }
}

class Demo {

    public static void main(String[] args) {

        Fan fan = new Fan();
        fan.setOn();
        fan.setOff();

        //created new obj
        Fan myfan=new Fan();
        System.out.println(myfan.isOn);

        //myfan.speed=100;
        System.out.println(myfan.speed);

    }
}