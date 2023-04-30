package de.neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;
    //##########
    public Product getProduct(){
        return null;
    }
    public void listProducts(){
        for(int i = 0; i < productRepo.getProducts().size(); i++){
            System.out.println("[" + (i+1) + "] " + productRepo.getProduct(i).getProductName());
    }
}
    public Order addOrder(){
        return null;
    }
    public Order getOrder(){
        return null;
    }
    public OrderRepo listOrders(){
        return null;
    }
    //##########

    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    //##########

    public ProductRepo getProductRepo() {
        return productRepo;
    }
}
