package com.adapter;

public class StripePaymentGateway {
    public void charge(double amount) {
        System.out.println("Charging $" + amount + " through Stripe.");
    }
}
