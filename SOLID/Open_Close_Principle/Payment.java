package SOLID.Open_Close_Principle;

public class Payment {


    public void paymentProcessing(int amt, String mode)
    {
        if(mode.equals("cash"))
        {
            // cash logic
        }
        else if(mode.equals("debitCard"))
        {
            //debit card logic
        }
//        else if(mode.equals("creditCard"))    this is a wrong way to add new functionality in exiting class
//          {                                   it does not follow OCP
//            //credit card logic
//        }
    }


    public void paymentProcessing(PaymentType type)    // this is a right way to do it add new functionality by creating new interface
    {
        type.processPayment();
    }
}
