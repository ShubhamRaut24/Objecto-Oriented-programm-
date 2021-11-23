package SOLID.Interface_segeration_principle;

public class ISPUI_usingISP
 {
    public static void main(String[] args) {

        InternetPayments pay1=new Payments();
        Procurements procurement=new Procurements();
        procurement.savePayment(pay1);
        System.out.println("---------------------------");
        OnlinePayment payment1=new CreditCardPayments();
        Procurements procurement1=new Procurements();
        procurement1.saveCardDetails(payment1);


    }
}
interface InternetPayments{
    public void savePaymentDetails();

}
interface OnlinePayment extends InternetPayments{
    public void saveCreditCardDetails();
}

class Payments implements InternetPayments {

    @Override
    public void savePaymentDetails() {
        System.out.println("save details of payment");
    }

}
class CreditCardPayments implements OnlinePayment{


    @Override
    public void savePaymentDetails() {
        System.out.println("saves details of payment in database");
    }

    @Override
    public void saveCreditCardDetails() {

        System.out.println("Saves Details of credit card u used");

    }
}
class Procurements{

    public void savePayment(InternetPayments internetPayments)
    {
      internetPayments.savePaymentDetails();
    }
    public void saveCardDetails(OnlinePayment onlinePayment)
    {
        onlinePayment.saveCreditCardDetails();
        onlinePayment.savePaymentDetails();
    }

}


