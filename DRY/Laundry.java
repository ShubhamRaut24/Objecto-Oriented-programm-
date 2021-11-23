package DRY;

public class Laundry {


    public void washWhiteCloths()
    {
        enterWater();
        System.out.println("code for wash white cloths");
        drainWater();
    }

    public void washColorCloths()
    {
        enterWater();
        System.out.println("code  for wash Colour cloths");
        drainWater();

    }
    private void enterWater()
    {
        System.out.println("code for enter water");
    }
    private void drainWater()
    {
        System.out.println("code for Draining water");
    }
}
class DemoLaundry{
    public static void main(String[] args)
    {
      Laundry laundry=new Laundry();
      laundry.washColorCloths();
      System.out.println("----------------------------");
      laundry.washWhiteCloths();

    }
}
