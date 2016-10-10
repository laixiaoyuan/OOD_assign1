package salebin;

import money.USMoney;

/**
 * Created by Lexie on 10/4/16.
 */
public class SmartBin extends Bin {
    private String label;
    private String binNumber;
    private ItemType[] items;
    private double curWeight;
    private int curArrayIndex;


    // create a unique smartBin number that starts with a "SM"
    // suppose no bins can hold more than 7 items.
    public SmartBin() {
        items = new ItemType[7];
        curWeight = 0;
        curArrayIndex = 0;
        binNumber = "SM" + generateBinNumber();
    }

    // set the label
    public void setLabel(String label) {
        this.label = label;
    }

    // check the weight of the item and if adding it to the bin does not exceed Bin's maxWeight, adds to the array items
    // if the added item is fragile, set the bin's label to "Fragile - handle with Care"
    @Override
    public void addItem(ItemType item) {
        if (curArrayIndex > items.length - 1) {
            System.out.println(item.getDetails() + " - This bin is full. Item cannot be added!");
        }
        else if (item.getWeight() + curWeight <= maxWeight) {
            curWeight += item.getWeight();
            items[curArrayIndex++] = item;
        }
        else {
            System.out.println(item.getDetails() + " - Overweighted. This item cannot be added!");
        }
        if (item.isFragile()) {
            setLabel("Fragile - Handle with Care");
        }

    }

    // calculate total price of all items in items array and adds $100.00 as the bin cost
    // if there are fragile items in the bin, adds $10 extra for each of the fragile items
    // return the total price
    @Override
    public USMoney calculatePrice() {
        USMoney sumPrice = new USMoney();
        for (int i = 0; i < curArrayIndex; i++) {
            sumPrice = sumPrice.add(items[i].getPrice());
            if (items[i].isFragile()) {
                sumPrice.addTo(10, 0);
            }
        }
        sumPrice.addTo(100, 0);
        return sumPrice;
    }

    @Override
    public String showDetails() {
        return "binNumber: " + binNumber + ", label: \"" + label + "\", current weight: " + curWeight + ", total cost: " + calculatePrice();
    }

}
