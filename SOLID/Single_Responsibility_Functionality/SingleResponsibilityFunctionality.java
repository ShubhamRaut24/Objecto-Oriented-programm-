package SOLID.Single_Responsibility_Functionality;

 class BankServices  {  //SingleResponsibilityFunctionality


     public String deposit(int amt, String accNumber)
     {
       return "deposit successful";
     }

     public String withdrawal(int amt, String accNumber)
     {
         return "withdrawal successful";
     }

     public long checkBalance(String accNumber){
      // check your balance here
        long balance=4000;
        return balance;
     }

//     public void printPassbook()
//     {
//       // update transaction and print it
//     }
//
//     public void getLoanInterestInfo()
//     {
//      // show info various types of loans
//     }
//
//     public void sendOTP()
//     {
//      // send otp via mail
//     }
}
class PrintService {

    public void printPassbook() {
        // update transaction and print it
    }
}
 class LoanService
 {
  public void getLoanInterestInfo()
  {
   // show info various types of loans
  }
 }
 class NotificationsService{

  public void sendOTP()
  {
   // send otp via mail
  }

 }




