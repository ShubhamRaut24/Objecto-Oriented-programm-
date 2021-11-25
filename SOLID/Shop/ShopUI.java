package Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopUI {

    public static void main(String[] args) {
     List<Product> list=new ArrayList<>();

     list.add(new Product("soap",25));
     list.add(new Product("oil",50));
     list.add(new Product("pen",20));
     list.add(new Product("chocolate",100));
     list.add(new Product("sugar",70));

     Shop shop=new Shop(list);
     System.out.println(shop.viewProduct().toString());

     shop.buyProduct("soap",new Cash());



    }
}
