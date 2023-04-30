package de.neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;
    //##########
    public void startShopService(){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose by typing number:");
        System.out.println("    ----------");
        System.out.println("[1] listProducts");
        System.out.println("[2] addOrder");

        int num = sc.nextInt();
        if(num == 1) {
            while (num != 0) {
                listProducts();

                System.out.println("choose product-number:");
                System.out.println("    ----------");
                System.out.println("or");
                System.out.println("[0] go back");
                num = sc.nextInt();

                if (num == 0) {
                    startShopService();
                } else
                    getProduct(num - 1);
                System.out.println("    ----------");
            }
        }
        else System.out.println("----");
    }
    public void getProduct(int i){
        System.out.println("productId: " + productRepo.getProduct(i).getProductId() + " || name: " + productRepo.getProduct(i).getProductName());
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
