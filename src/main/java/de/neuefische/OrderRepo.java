package de.neuefische;

import java.util.List;
import java.util.Map;

public class OrderRepo {
    private List<Order> orders;
    //##########
    public List<Order> orderList(){
        return orders;
    }
    public Order getOrder(int i){
        return orderList().get(i);
    }
    public Order addOrder(Order order){
        orders.add(order);
        return order;
    }
}
