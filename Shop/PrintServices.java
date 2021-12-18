package Shop;

public class PrintServices {

    public void printPaymentInfo(SavePayment savePayment)
    {
      savePayment.savePaymentInfo();
      System.out.println("payment details printed");

    }
}
