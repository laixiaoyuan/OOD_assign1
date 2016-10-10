package salebin;

import money.USMoney;

/**
 * Created by Lexie on 10/3/16.
 */
public interface ItemType {
    public boolean isFragile();
    public USMoney getPrice();
    public double getWeight();
    public String getDetails();
}
