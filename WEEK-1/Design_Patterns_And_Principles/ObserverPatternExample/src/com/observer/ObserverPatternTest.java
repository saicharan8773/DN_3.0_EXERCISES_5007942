package com.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
<<<<<<< HEAD
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(150.00);
        stockMarket.setPrice(155.50);

=======
        // Create stock market (subject)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price
        stockMarket.setPrice(150.00);
        stockMarket.setPrice(155.50);

        // Deregister an observer and change the price
>>>>>>> a40c4ee (WEEK 1 5007942)
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setPrice(160.00);
    }
}
