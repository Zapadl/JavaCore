package controller;


import module.Buyer;
import module.Order;
import module.Product;

public class ShopController {
    private Buyer[] buyers;
    private Product[] products;
    private Order[] orders;

    public ShopController() throws CustomerException{
         buyers = new Buyer[]{
            new Buyer("Щербаков Алексей Александрович",34,"+79510515465"),
            new Buyer("Галкин Никита Евгеньевич",25,"+79565445255") ,
                     };
        products = new Product[]{
            new Product("Йогурт", 50),
            new Product("Хлеб", 30),
            new Product("Бананы", 99),
            new Product("Курица", 150),
            new Product("Рыба", 200)
        };
        orders = new Order[5];
        orders[0] = ShopController.makeAPurchase(buyers, products, "Щербаков Алексей Александрович", "Хлеб", 2);
        orders[1] = ShopController.makeAPurchase(buyers, products, "Белов Даниил Маратович", "Рыба", 2);
        orders[2] = ShopController.makeAPurchase(buyers, products, "Галкин Никита Евгеньевич", "Ананас", 10);
        orders[3] = ShopController.makeAPurchase(buyers, products, "Щербаков Алексей Александрович", "Бананы", 10);
        orders[4] = ShopController.makeAPurchase(buyers, products, "Галкин Никита Евгеньевичч", "Йогурт", 50);


        for(Order order : orders){
            System.out.println(order);
        }
    }
    private static Order makeAPurchase(Buyer[] buyers, Product[] products, String fio, String productName, int quantity) throws CustomerException{
        Order order = null;
        Buyer buyer = null;
        Product product = null;
        try{
            for(Product temp : products){
                if(temp.getProductName().equals(productName))
                    product = temp;
            }
            if(product == null)
                throw new ProductException();
            try{
                if(quantity <= 0 || quantity >= 100)
                    throw new AmountException();
            }catch (AmountException ex) {
                System.out.println(ex);
                quantity = 1;
            }
            for(Buyer temp : buyers){
                if(temp.getFio().equals(fio))
                    buyer = temp;
                }
            if(buyer == null)
                throw new CustomerException();
            order = new Order(buyer, product, quantity);
        }catch(ProductException ex){
            System.out.println(ex);
        }
        return order;
    }
}
