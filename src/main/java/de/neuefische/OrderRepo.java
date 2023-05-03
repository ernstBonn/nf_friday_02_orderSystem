package de.neuefische;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderRepo {
    private ArrayList<Order> orders;
    //##########

    public OrderRepo(ArrayList<Order> orders) {
        this.orders = orders;
    }

    //##########
    public ArrayList<Order> orderList(){
        return orders;
    }
    public Order getOrderById(String orderId) {
        int index = -1;
        for (int i = 0; i < orders.size(); i++) {

            if (orderId == orders.get(i).getOrderId()) {
                index = i;
            }
        }
        return orders.get(index);
    }

//    public Order addOrder(String orderId){
//        ArrayList<Product> productList = new ArrayList<>();
//        boolean flag = true;
//        while (flag = true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("type productId");
//            String productId = sc.nextLine();
//            for (int i = 0; i < )
//        }
//        productList.add(order);
//        Order newOrder = new Order(orderId, productList);
//        return newOrder;
//    }
    //##########

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
