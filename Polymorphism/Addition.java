package Polymorphism;

 class Addition {

     public void sum(int a,int b)
     {
         System.out.println("Addition is "+(a+b));
     }
     public void sum(int a,int b,int c)
     {
         System.out.println("Addition is "+(a+b+c));
     }
     public void sum(float a,int b)
     {
         System.out.println("Addition is "+(a+b));
     }

}
class OverloadingDemo{
    public static void main(String[] args) {
        Addition addition=new Addition();
        addition.sum(5,4);
        addition.sum(2.4f,8);
        addition.sum(2, 4,6);
    }
}

//getDetails