package Access_and_Non_access_Modifiers;

class Vehicle {

    private String vehicleName = "Activa";  //only accessible inside class
    protected int speed=40;               //only accessible inside same package and subclass
    public String company= "honda";   // Everywhere
    int price=50000;                //


    private void setVehicleName(String name)  //only accessible inside class
    {
        vehicleName=name;
    }
    protected void setSpeed(int speed)
    {
        this.speed=speed;
    }
    void setPrice(int price)
    {
        this.price=price;
    }
    public void display()
    {
        System.out.println(vehicleName);
        System.out.println(speed);
        System.out.println(company);
        System.out.println(price);
    }

}
class Demo
{
    public static void main(String[] args) {
        Vehicle v=new Vehicle();

        v.setPrice(10000);
        v.setSpeed(50);
        v.display();
    }
}
