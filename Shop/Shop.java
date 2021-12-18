package Shop;

import java.util.List;

public class Shop {

    private List<Product> productList;
    protected Payment payment;

    private PrintServices printServices = new PrintServices();;

    Shop(List<Product> productList)
    {
        this.productList=productList;
    }

    public List<Product> viewProduct()
    {
        return productList;
    }

    public void buyProduct(String name,PaymentType paymentType,SavePayment savePayment)
    {
        System.out.println(name+" is bought");
        paymentType.processPayment();

        printServices.printPaymentInfo(savePayment);

    }
}
