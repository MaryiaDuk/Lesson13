package by.it_academy;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<Customer> list = new LinkedList<>();

    public CustomerQueue addCustomer(Customer customer) {
        list.add(customer);
        return this;
    }

    public Customer getCustomer() {
        return list.poll();
    }

    @Override
    public String toString() {
        return "CustomerQueue{" +
                "list=" + list +
                '}';
    }
}
