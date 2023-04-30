package de.neuefische;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductRepo {
    private ArrayList<Product> products;
    //##########
    public ProductRepo(ArrayList<Product> products) {
        this.products = products;
    }
    //##########
    public ArrayList<Product> getProducts() {
        return products;
    }
    public Product getProduct (int i){
        return products.get(i);
    }
    //##########
}
