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
//
          ShopService shop = new ShopService(pRepo);
//        for(int i = 0; i < shop.getProductRepo().getProducts().size(); i++)
//            System.out.println("[" + (i+1) + "] " + shop.getProductRepo().getProduct(i).getProductName());
        shop.listProducts();
    }
}