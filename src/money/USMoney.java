package money;

/**
 * Created by Lexie on 9/25/16.
 */
public class USMoney {
    private int dollars;
    private int cents;

    // constructor
    // If the input of dollars or cents are negative, will throw exception.
    public USMoney(int dollars, int cents) {
        if (dollars < 0) {
            throw new IllegalArgumentException("Dollars should be a non-negtive number!");

        }
        else if (cents < 0) {
            throw new IllegalArgumentException("Cents should be a non-negtive number!");
        }
        else if (cents > 99) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        }
        else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }
    // default constructor
    public USMoney() {
        this(0, 0);
    }

    // setter
    // If the input number is negative, will print out a warning, and set the number to 0.
    public void setDollars(int dollars) {
        if (dollars < 0) {
            System.out.println("Dollars should be a non-negtive number!");
            dollars = 0;
        }
        this.dollars = dollars;
    }
    public void setCents(int cents) {
        if (cents < 0) {
            System.out.println("Cents should be a non-negtive number!");
            cents = 0;
        }
        this.cents = cents;
        if (this.cents > 99) {
            this.dollars = this.dollars + this.cents / 100;
            this.cents = this.cents % 100;
        }
    }


    // getter
    public int getDollars() {
        return this.dollars;
    }
    public int getCents() {
        return this.cents;
    }

    // add the parameter values to the data members
    // if any of the inputs are negative, will set the input of both dollars and cents to 0.
    public void addTo(int dollars, int cents) {
        if (dollars < 0) {
            System.out.println("Dollars should be a non-negtive number!");
            dollars = 0;
            cents = 0;
        }
        if (cents < 0) {
            System.out.println("Cents should be a non-negtive number!");
            dollars = 0;
            cents = 0;
        }
        int curDollars = this.getDollars() + dollars;
        int curCents = this.getCents() + cents;
        if (curCents > 99) {
            curDollars = curDollars + curCents / 100;
            curCents = curCents % 100;
        }
        this.setDollars(curDollars);
        this.setCents(curCents);

    }

    // create and returns a new money.USMoney object
    public USMoney add(USMoney money) {
        int newDollars = this.getDollars() + money.getDollars();
        int newCents = this.getCents() + money.getCents();
        USMoney newMoney = new USMoney(newDollars, newCents);
        return newMoney;
    }

    // return a string representation of the object
    public String toString() {
        int curDollars = this.getDollars();
        int curCents = this.getCents();
        if (curCents > 99) {
            curDollars = curDollars + curCents / 100;
            curCents = curCents % 100;
        }

        return "$" + curDollars + "." + String.format("%02d", cents);
    }
}