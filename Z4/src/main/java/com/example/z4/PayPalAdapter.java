package com.example.z4;

class PayPalAdapter implements PaymentSystem {
    private PayPalPayment paypalPayment;

    public PayPalAdapter(PayPalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    @Override
    public void processPayment(double amount) {
        paypalPayment.sendPayment(amount);
    }
}