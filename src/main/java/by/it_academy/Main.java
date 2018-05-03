package by.it_academy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AddCustomer addCustomer = new AddCustomer();
        CashBox cashBox = new CashBox(addCustomer.add());
        cashBox.serve();
    }
}
