package com.jetbrains;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        setSymbol(symbol);
        setName(name);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        if (symbol != null) {
            this.symbol = symbol;
        } else {
            this.symbol = "*";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "default";
        }
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        if (previousClosingPrice > 0) {
            this.previousClosingPrice = previousClosingPrice;
        } else {
            this.previousClosingPrice = 1;
        }
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        if (currentPrice > 0) {
            this.currentPrice = currentPrice;
        } else {
            this.currentPrice = 1;
        }
    }

    public double changePercent() {
        double temp;
        if (currentPrice > previousClosingPrice) {
            temp = currentPrice - previousClosingPrice;
            return (temp / previousClosingPrice) * 100;
        } else {
            temp = previousClosingPrice - currentPrice;
            return (temp / previousClosingPrice) * 100;
        }
    }
}
