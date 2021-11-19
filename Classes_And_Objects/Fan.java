package Classes_And_Objects;

 class Fan {

  private boolean isOn;

  public void setOn()
  {
   isOn = true;
   System.out.println("fan is on");
  }
  public void setOff()
  {
   isOn = false;
   System.out.println("fan is off");
  }
 }

 class Demo{

  public static void main(String[] args) {

   Fan fan=new Fan();

   fan.setOn();
   fan.setOff();
  }
 }
