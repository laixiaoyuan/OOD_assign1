package salebin;

import money.USMoney;

/**
 * Created by Lexie on 10/3/16.
 */
public class Bin implements BinType {
    private String binNumber;
    private ItemType[] items;
    protected final double maxWeight = 100;
    private static int counter = 0;
    private double curWeight;
    private int curArrayIndex;

    // every time when we create an object, counter increases by 1
    {
        counter++;
    }

    // create unique bin number
    // suppose no bins can hold more than 7 items.
    public Bin() {
        items = new ItemType[7];
        curWeight = 0;
        curArrayIndex = 0;
        binNumber = "A" + generateBinNumber();

    }

    // generate a unique binNumber
    protected static Integer generateBinNumber() {
        return counter;
    }

    // check the weight of the item and if adding it to the bin does not exceed Bin's maxWeight,
    // and if the item is not fragile, add it to the array, items
    @Override
    public void addItem(ItemType item) {
        if (curArrayIndex > items.length - 1) {
            System.out.println(item.getDetails() + " - This bin is full. Item cannot be added!");
        }
        else if (item.getWeight() + curWeight <= maxWeight && !item.isFragile()) {
            curWeight += item.getWeight();
            items[curArrayIndex++] = item;
        }
        else if (item.isFragile()){
            System.out.println(item.getDetails() + " - This item is fragile. Cannot be added to the bin!");
        }
        else {
            System.out.println(item.getDetails() + " - Overweighted. This item cannot be added!");
        }
    }

    // calculate the total price of all items in items array
    // and adds $100.00 as the bin cost and returns the total
    @Override
    public USMoney calculatePrice() {
        USMoney sumPrice = new USMoney();
        for (int i = 0; i < curArrayIndex; i++) {
            sumPrice.addTo(items[i].getPrice().getDollars(), items[i].getPrice().getCents());
        }
        sumPrice.addTo(100, 0);
        return sumPrice;
    }

    @Override
    public double getWeight() {
        return curWeight;
    }

    @Override
    public Integer getNoOfItems() {
        return curArrayIndex - 1;
    }

    @Override
    public String showDetails() {
        return "binNumber: " + binNumber + ", current weight: " + curWeight + ", total cost: " + calculatePrice();
    }
}
