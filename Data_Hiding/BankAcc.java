package Data_Hiding;

 class BankAcc
{
  final private int accNo=142524;
   private double balance=19634.652;
   public int dummyAccNo;
   public double dummyBalance;
   private String username="shubham";
   private String password="pass123";

   public BankAcc getinfo(String username, String password)
   {
       if(this.username.equals(username)&&this.password.equals(password))
       {
           BankAcc bankAcc=new BankAcc();
           bankAcc.dummyBalance=this.balance;
           bankAcc.dummyAccNo=accNo;
           return bankAcc;
       }
       else
           return null;
   }
}
 class User{
    public static void main(String[] args) {
        BankAcc b=new BankAcc();
        b=b.getinfo("shubham","pass123");
        System.out.println(b.dummyAccNo+" "+b.dummyBalance);
    }
}

