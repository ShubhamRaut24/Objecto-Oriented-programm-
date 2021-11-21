package Abstraction;

import java.util.ArrayList;

abstract class Mobile1 {

private ArrayList<String> contact=new ArrayList<>();

    public void addContact(String number)
    {
        contact.add(number);
    }
  abstract public void calling(String contact);
  abstract public void sendMessage(String msg);
}
class Apple extends Mobile1{

    @Override
    public void calling(String contact) {
        System.out.println("Calling to...."+contact);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("sending message...."+msg);
    }

    }

    class AbstractionDemo1{
        public static void main(String[] args) {
            Apple apple=new Apple();

            apple.calling("7020773048");
            apple.sendMessage("hello pratik");
            apple.addContact("7020773048");
        }

    }
