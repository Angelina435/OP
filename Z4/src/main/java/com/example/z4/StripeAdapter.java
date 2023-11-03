package com.example.z4;
class StripeAdapter implements PaymentSystem {
    private StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.makePayment(amount);
    }
}
