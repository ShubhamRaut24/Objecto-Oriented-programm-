package Shop;

import java.util.List;

public class Shop {

    private List<Product> productList;
    protected Payment payment;

    private PrintServices printServices;

    Shop(List<Product> productList)
    {
        this.productList=productList;
    }
    public List<Product> viewProduct()
    {
        return productList;
    }
    public void buyProduct(String name,PaymentType paymentType)
    {
        System.out.println(name+" is bought");
        paymentType.processPayment();
        printServices=new PrintServices();
        printServices.printPaymentInfo(new Cash());

    }
}
