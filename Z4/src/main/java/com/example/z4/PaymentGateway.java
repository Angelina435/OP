
package com.example.z4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class PaymentGateway {
    private Map<String, PaymentSystem> paymentSystems;
    private Scanner scanner;

    public PaymentGateway() {
        paymentSystems = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void registerPaymentSystem(String systemName, PaymentSystem paymentSystem) {
        paymentSystems.put(systemName, paymentSystem);
    }

    public void processPayment(String systemName, double amount) {
        PaymentSystem paymentSystem = paymentSystems.get(systemName);
        if (paymentSystem != null) {
            paymentSystem.processPayment(amount);
        } else {
            System.out.println("Invalid payment system: " + systemName);
        }
    }

    public void startPaymentProcess() {
        System.out.println("Available payment systems: PayPal, Stripe");
        System.out.print("Enter payment system: ");
        String systemName = scanner.next();

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        processPayment(systemName, amount);
    }

    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        PayPalPayment payPalPayment = new PayPalPayment();
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalPayment);
        gateway.registerPaymentSystem("PayPal", payPalAdapter);

        StripePayment stripePayment = new StripePayment();
        StripeAdapter stripeAdapter = new StripeAdapter(stripePayment);
        gateway.registerPaymentSystem("Stripe", stripeAdapter);


        while (true) {
            gateway.startPaymentProcess();

            System.out.print("Do you want to make another payment? (yes/no): ");
            String choice = gateway.scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting payment system. Goodbye!");
                break;
            }
        }
        gateway.scanner.close();
    }
}