package com.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of payment gateways
        PayPalPaymentGateway payPalGateway = new PayPalPaymentGateway();
        StripePaymentGateway stripeGateway = new StripePaymentGateway();
        SquarePaymentGateway squareGateway = new SquarePaymentGateway();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        PaymentProcessor squareAdapter = new SquareAdapter(squareGateway);

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter1 = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter1 = new StripeAdapter(stripeGateway);
        PaymentProcessor squareAdapter1 = new SquareAdapter(squareGateway);

        // Process payments using the adapters
        payPalAdapter1.processPayment(100.0);
        stripeAdapter1.processPayment(150.0);
        squareAdapter1.processPayment(200.0);
    }
}
