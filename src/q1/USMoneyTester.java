package q1;

import money.USMoney;

/**
 * Created by Lexie on 9/25/16.
 */
public class USMoneyTester {
    public void moneytest() {

        USMoney amt1 = new USMoney();
        System.out.println(amt1);
        amt1.setCents(250);
        System.out.println(amt1);
        amt1.setDollars(10);
        System.out.println(amt1);
        System.out.println(amt1.getCents());
        USMoney amt2 = amt1.add(new USMoney(2, 90));
        System.out.println(amt1);
        System.out.println(amt2);
        amt2.addTo(amt1.getDollars(), amt1.getCents());
        System.out.println(amt2);
        USMoney amt3 = new USMoney(99, 120);
        amt3.addTo(99, 120);
        System.out.println(amt3);

        /* The following test cases are not required.
           They are used to test concer cases when any input is negative (avoid the rule)
           these test cases will throw exceptions.
        */
/*
        USMoney amt4 = new USMoney(-1, 5);
        System.out.println (amt4);
        USMoney amt5 = new USMoney(10, -50);
        System.out.println (amt5);

        USMoney amt6 = new USMoney();
        amt6.setCents(-50);
        amt6.setCents(50);
        System.out.println (amt6);
        amt6.setDollars(-10);
        System.out.println (amt6);
        amt6.setDollars(10);
        System.out.println (amt6);
        amt6.addTo(10, -50);
        System.out.println (amt6);

        USMoney amt7 = amt6.add(amt3);
        System.out.println (amt7);

        USMoney amt8 = amt6.add(new USMoney(0, -50));
        amt8 = amt6.add(new USMoney(10, 60));
        System.out.println (amt8);
*/






    }
}
