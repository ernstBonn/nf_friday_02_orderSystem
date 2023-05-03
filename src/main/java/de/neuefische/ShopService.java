package de.neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;
    //##########

    //##########
    public void choose(){
        System.out.println("choose by typing number:");
    }
    public void line(){
        System.out.println("    ----------");
    }
    public void back(){
        System.out.println("[0] go back");
    }

    public void startShopService(){
        System.out.println("choose: [1] listProducts || [2] addOrder");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1) {
            while (num != 0) {
                listProducts();

                choose();
                line();
                System.out.println("or");
                back();
                num = sc.nextInt();

                if (num == 0) {
                    startShopService();
                } else
                    getProduct(num - 1);
                line();
            }
        }
        else if(num == 2) {
            getOrder();
            }

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
    public void getOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("type orderId");
        String orderId = sc.nextLine();
        orderRepo.getOrderById(orderId);
    }
    public OrderRepo listOrders(){
        return null;
    }
    //##########

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }
    //##########

    public ProductRepo getProductRepo() {
        return productRepo;
    }
}
