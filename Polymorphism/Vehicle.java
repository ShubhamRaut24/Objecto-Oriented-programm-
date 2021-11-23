package Polymorphism;

 class Vehicle {

  public  void run(){
   System.out.println("vehicle is running....");
  }
  final public  void start(){             // we can not override this method because its final
   System.out.println("vehicle is running....");//And aslo we can not override method which is static.
  }
}
class Car extends Vehicle
{
 public  void run(){
  System.out.println("car is running....");
 }

}

class Bike extends Vehicle
{
 public  void run(){
  super.run();       // we call parent class method here using this super keyword
  System.out.println("Bike is running....");
 }

}
class OverridingDemo{
 public static void main(String[] args) {
    Vehicle vehicle=new Vehicle();
    vehicle.run();
  System.out.println("--------------------------------");
    Car car=new Car();
    car.run();
  System.out.println("--------------------------------");
    Vehicle vehicle1=new Car();
    vehicle1.run();
    System.out.println("--------------------------------");
    Bike bike=new Bike();
    bike.run();

 }
}
