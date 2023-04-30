package de.neuefische;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Order {
    private String orderId;
    private ArrayList<Product> orderProducts;
    //##########

    public Order(String orderId, ArrayList<Product> orderProducts) {
        this.orderId = orderId;
        this.orderProducts = orderProducts;
    }
    //##########

    public String getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getOrderProducts() {
        return orderProducts;
    }
}
