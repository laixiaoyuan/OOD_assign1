package salebin;

import money.USMoney;

/**
 * Created by Lexie on 10/3/16.
 */
public class SaleItem implements ItemType {
    private String itemName;
    private USMoney price;
    private double weight;
    private boolean fragile;

    // constructor
    public SaleItem(String itemName, USMoney price, double weight, boolean fragile) {
        this.itemName = itemName;
        this.price = price;
        this.weight = weight;
        this.fragile = fragile;
    }
    // default constructor
    public SaleItem() {
        this("", new USMoney(), 0, false);
    }

    @Override
    public boolean isFragile() {
        return this.fragile;
    }

    @Override
    public USMoney getPrice() {
        return this.price;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String getDetails() {
        return itemName + " " + price;
    }
}
