package Shop_violation;

import java.util.List;

public class Shop {

    private List<Product> productList;
    protected Payment payment;



    Shop(List<Product> productList)
    {
        this.productList=productList;
    }

    public List<Product> viewProduct()
    {
        return productList;
    }

    public void buyProduct(String name,String paymentType)
    {
        System.out.println(name+" is bought");
        payment.paymentProcessing(paymentType);

    }
    public void printPaymentInfo()
    {
        System.out.println("print all payment details");
    }
}
