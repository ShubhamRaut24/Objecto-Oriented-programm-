package Shop;

class DebitCard implements PaymentType,SavePayment, SaveCard{

    @Override
    public void processPayment() {
        System.out.println("via debit card");
    }

    @Override
    public void savePaymentInfo() {
        System.out.println("card payment info");

    }
    @Override
    public void saveCardInfo() {
        System.out.println("debit card info is saved");
    }
}