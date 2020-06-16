package com.jetbrains;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("$$$","nicole");
        stock.setPreviousClosingPrice(121);
        stock.setCurrentPrice(456);
        System.out.printf("%.2f%s", stock.changePercent(),"%");

    }
}
