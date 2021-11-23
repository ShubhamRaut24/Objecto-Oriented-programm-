package SOLID.Interface_segeration_principle;

public class ISPUI {
    public static void main(String[] args) {

        InternetPayment pay=new Payment();
        Procurement procurement=new Procurement(pay);
        procurement.calculatePayment();
        System.out.println("---------------------------");
        InternetPayment payment=new CreditCardPayment();
        Procurement procurement1=new Procurement(payment);
        procurement1.calculatePayment();


    }
}
interface InternetPayment{
    public void savePaymentDetails();
    public void saveCreditCardDetails();
}

class Payment implements InternetPayment{

    @Override
    public void savePaymentDetails() {
        System.out.println("save details of payment");
    }

    @Override
    public void saveCreditCardDetails() {
      System.out.println("NO NEED OF THIS METHOD");
    }
}
class CreditCardPayment implements InternetPayment{


    @Override
    public void savePaymentDetails() {
        System.out.println("saves details of payment in database");
    }

    @Override
    public void saveCreditCardDetails() {

        System.out.println("Saves Details of credit card u used");

    }
}
class Procurement{
    InternetPayment paymentHandler;

    public Procurement(InternetPayment paymentHandler)
    {
        this.paymentHandler=paymentHandler;
    }
    public void calculatePayment()
    {
        paymentHandler.savePaymentDetails();
        paymentHandler.saveCreditCardDetails();
    }
}

