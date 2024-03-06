package com.dto;

public class Stock {
    private String stockTitle;
    private int stockPrice;
    private int stockCount;

    public Stock() {

    }
    public Stock(String stockTitle, int stockPrice) {
        this.stockTitle = stockTitle;
        this.stockPrice = stockPrice;
    }

    public Stock(String stockTitle,int stockCount, int stockPrice) {
        this.stockTitle = stockTitle;
        this.stockCount = stockCount;
        this.stockPrice = stockPrice;
    }

    public String getStockTitle() {
        return stockTitle;
    }



    public void setStockTitle(String stockTitle) {
        this.stockTitle = stockTitle;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void minusStockCount(int stockCount) {
        this.stockCount -= stockCount;
    }
    public void addStockCount(int stockCount) {
        this.stockCount += stockCount;
    }
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "종목 이름 = '" + stockTitle + '\'' +
                ", 종목 가격 = " + stockPrice +
                ", 종목 개수 = " + stockCount +
                '}';
    }
}
