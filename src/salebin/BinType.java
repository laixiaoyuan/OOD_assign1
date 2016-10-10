package salebin;

import money.USMoney;

/**
 * Created by Lexie on 10/3/16.
 */
public interface BinType {
    public void addItem(ItemType item);
    public USMoney calculatePrice();
    public double getWeight();
    public Integer getNoOfItems();
    public String showDetails();
}
