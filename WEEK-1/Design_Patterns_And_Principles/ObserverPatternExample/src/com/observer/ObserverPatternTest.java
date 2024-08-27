package com.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(150.00);
        stockMarket.setPrice(155.50);
        // Create stock market (subject)
        StockMarket stockMarket1 = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp();
        Observer webApp1 = new WebApp();

        // Register observers
        stockMarket1.registerObserver(mobileApp1);
        stockMarket1.registerObserver(webApp1);

        // Change stock price
        stockMarket1.setPrice(150.00);
        stockMarket1.setPrice(155.50);

        // Deregister an observer and change the price
        stockMarket1.deregisterObserver(mobileApp1);
        stockMarket1.setPrice(160.00);
    }
}
