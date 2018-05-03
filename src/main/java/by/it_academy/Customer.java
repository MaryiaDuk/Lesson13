package by.it_academy;

import by.it_academy.ProductList.Products;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<Products> productsList = new ArrayList<>();

    public Customer customerProductsAdd(Products products){
        productsList.add(products);
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "productsList=" + productsList +
                '}';
    }
}
