package Interfaces_PBL;

interface Payment {
    void process(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to credit card");
    }
}

class UPIPayment implements Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to UPI account");
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Payment[] payments = new Payment[2];
        payments[0] = new CreditCardPayment();
        payments[1] = new UPIPayment();

        double[] amounts = {250.75, 120.50};

        for (int i = 0; i < payments.length; i++) {
            payments[i].process(amounts[i]);
            payments[i].refund(amounts[i] / 2);
            System.out.println("----------------------");
        }
    }
}
