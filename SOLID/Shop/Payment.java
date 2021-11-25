package Shop;

public class Payment {


    public void paymentProcessing(PaymentType paymentType)
    {
        paymentType.processPayment();

    }
    public void savePaymentInfo(SavePayment savePayment)
    {
        savePayment.savePaymentInfo();
    }



}
class Cash implements PaymentType, SavePayment{


    @Override
    public void processPayment() {
        System.out.println("via cash");
    }

    @Override
    public void savePaymentInfo() {
        System.out.println("saves payment info");

    }
}
class debitCard implements PaymentType,SavePayment{

    @Override
    public void processPayment() {
        System.out.println("via debit card");
    }
    @Override
    public void savePaymentInfo() {
        System.out.println("payment info");

    }

   }