package Shop_violation;

public class Payment implements PaymentType{


    public void paymentProcessing(String paymentType)
    {

        if(paymentType.equals("cash") )
        {
           System.out.println("via cash");

        }
       else if(paymentType.equals("debitCard"))
        {
            System.out.println("via debitCard");

        }

    }


    @Override
    public void processPayment() {

    }

    @Override
    public void savePaymentInfo() {

    }

    @Override
    public void saveCardInfo() {

    }
}

