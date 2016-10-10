package q2;

import money.USMoney;
import salebin.*;

/**
 * Created by Lexie on 10/4/16.
 */
public class BinTester {
    public void binTest() {

        // a) create 5 instances of SaleItems
        ItemType si1 = new SaleItem("Shoes", new USMoney(30, 99), 20.50, false);
        ItemType si2 = new SaleItem("Mug", new USMoney(20, 0), 25.49, true);
        ItemType si3 = new SaleItem("Textbook", new USMoney(80, 50), 40.64, false);
        ItemType si4 = new SaleItem("Bowl", new USMoney(10, 98), 16.98, true);
        ItemType si5 = new SaleItem("Kitchen table", new USMoney(200, 0), 60.20, false);

        // b) create an instance of a Bin
        BinType bin1 = new Bin();

        // c) add the instances of SaleItems from a) to the Bin instance in b)
        bin1.addItem(si1);
        bin1.addItem(si2);
        bin1.addItem(si3);
        bin1.addItem(si4);
        bin1.addItem(si5);

        // d) show details on the Bin instance in b)
        System.out.println(bin1.showDetails());

        // e) Create at least 5 more instances of SaleItems
        ItemType si6 = new SaleItem("Boots", new USMoney(60, 59), 30.30, false);
        ItemType si7 = new SaleItem("Cup", new USMoney(8, 0), 15.49, true);
        ItemType si8 = new SaleItem("Comic book", new USMoney(5, 50), 5.80, false);
        ItemType si9 = new SaleItem("Window", new USMoney(40, 68), 30.98, true);
        ItemType si10 = new SaleItem("Office chair", new USMoney(200, 0), 80.20, false);

        // f) create an instance of a SmartBin
        BinType bin2 = new SmartBin();

        // g) add the instances of SaleItems from e) to the Bin instance in f)
        bin2.addItem(si6);
        bin2.addItem(si7);
        bin2.addItem(si8);
        bin2.addItem(si9);
        bin2.addItem(si10);

        // h) show details on the Bin instance in f)
        System.out.println(bin2.showDetails());

        // i) create an instance of a Bin as follows: Bin bin3 = new SmartBin();
        Bin bin3 = new SmartBin();

        // j) can you add fragile SaleItems to bin3? ---- yes!
        bin3.addItem(si7);
        System.out.println(bin3.showDetails());

        /*
        The following test cases are not required
        They are used to test when the number of items added to the bin exceeds the amount of items it can hold,
        since in the constructor we set a max number of items a bin can hold.
        */

/*
        ItemType s1 = new SaleItem("1", new USMoney(1, 0), 1, false);
        ItemType s2 = new SaleItem("2", new USMoney(1, 0), 1, false);
        ItemType s3 = new SaleItem("3", new USMoney(1, 0), 1, false);
        ItemType s4 = new SaleItem("4", new USMoney(1, 0), 1, false);
        ItemType s5 = new SaleItem("5", new USMoney(1, 0), 1, false);
        ItemType s6 = new SaleItem("6", new USMoney(1, 0), 1, false);
        ItemType s7 = new SaleItem("7", new USMoney(1, 0), 1, false);
        ItemType s8 = new SaleItem("8", new USMoney(1, 0), 1, false);
        ItemType s9 = new SaleItem("9", new USMoney(1, 0), 1, false);
        BinType b1 = new Bin();
        b1.addItem(s1);
        b1.addItem(s2);
        b1.addItem(s3);
        b1.addItem(s4);
        b1.addItem(s5);
        b1.addItem(s6);
        b1.addItem(s7);
        b1.addItem(s8);
        b1.addItem(s9);
        BinType b2 = new SmartBin();
        b2.addItem(s1);
        b2.addItem(s2);
        b2.addItem(s3);
        b2.addItem(s4);
        b2.addItem(s5);
        b2.addItem(s6);
        b2.addItem(s7);
        b2.addItem(s8);
        b2.addItem(s9);
*/

    }
}
