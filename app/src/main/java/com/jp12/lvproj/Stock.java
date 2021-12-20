package com.jp12.lvproj;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Stock {
    String stockSymbols;
    String stockNames;
    String stockDescriptions;
    double stockPrices;
    Drawable stockImages;
    public Stock(String stockSymbols, String stockNames, String stockDescriptions, double stockPrices, Drawable stockImages) {
        this.stockSymbols = stockSymbols;
        this.stockNames = stockNames;
        this.stockDescriptions = stockDescriptions;
        this.stockPrices = stockPrices;
        this.stockImages = stockImages;

    }

    public String getStockSymbols() {
        return stockSymbols;
    }

    public void setStockSymbols(String stockSymbols) {
        this.stockSymbols = stockSymbols;
    }

    public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public String getStockDescriptions() {
        return stockDescriptions;
    }

    public void setStockDescriptions(String stockDescriptions) {
        this.stockDescriptions = stockDescriptions;
    }

    public double getStockPrices() {
        return stockPrices;
    }

    public void setStockPrices(double stockPrices) {
        this.stockPrices = stockPrices;
    }

    public Drawable getStockImages() {
        return stockImages;
    }

    public void setStockImages(Drawable stockImages) {
        this.stockImages = stockImages;
    }
}
