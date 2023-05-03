package de.neuefische;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product screwdriver = new Product("p1", "screwdriver");
        Product mirror = new Product("p2", "mirror");

        ArrayList<Product> stuff = new ArrayList<>();

        stuff.add(screwdriver);
        stuff.add(mirror);
//        for (int i = 0; i < stuff.size(); i++) {
//            System.out.println("[" + (i+1) + "] " + stuff.get(i).getProductName());
//        }
        ProductRepo pRepo = new ProductRepo(stuff);
//        System.out.println(pRepo.getProduct(0).getProductName());
        Order order1 = new Order("o1", stuff);
        Order order2 = new Order("o2", stuff);

        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);
        OrderRepo oRepo = new OrderRepo(orders);
        ShopService shop = new ShopService(pRepo, oRepo);
//        for(int i = 0; i < shop.getProductRepo().getProducts().size(); i++)
//            System.out.println("[" + (i+1) + "] " + shop.getProductRepo().getProduct(i).getProductName());

//        System.out.println(oRepo.getOrderById("o1"));
//        System.out.println(oRepo.getOrderById("o2"));
        shop.getOrder();
    }
}