package Abstraction;

import java.util.ArrayList;

interface Mobile {

    public void calling(String contact);
    public void sendMessage(String msg);
}

class Samsung implements Mobile{


    private ArrayList<String> contacts=new ArrayList<>();

    public void addContact(String number)
    {
        contacts.add(number);
    }

    @Override
    public void calling(String contact) {
        System.out.println("Calling to...."+contact);
    }

    @Override
    public void sendMessage(String msg) {
     System.out.println("sending message...."+msg);
    }
}

 class Abstraction_demo{

    public static void main(String[] args) {

        Samsung s=new Samsung();
        s.addContact("7089254136");
        s.calling("7089254136");
        s.sendMessage("hello world");
    }
}