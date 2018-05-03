package by.it_academy;

import by.it_academy.ProductList.Bread;
import by.it_academy.ProductList.Meat;
import by.it_academy.ProductList.Milk;
import by.it_academy.ProductList.Water;

public class AddCustomer {
    public CustomerQueue add(){
        CustomerQueue customerQueue = new CustomerQueue()
                .addCustomer(new Customer()
                        .customerProductsAdd(new Water())
                        .customerProductsAdd(new Bread()))
                .addCustomer(new Customer()
                        .customerProductsAdd(new Milk()))
                .addCustomer(new Customer()
                        .customerProductsAdd(new Meat())
                        .customerProductsAdd(new Milk())
                        .customerProductsAdd(new Bread())
                        .customerProductsAdd(new Water()));
        return customerQueue;
    }
}
