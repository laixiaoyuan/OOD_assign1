import q1.USMoneyTester;
import q2.BinTester;

/**
 * Created by Lexie on 10/9/16.
 */
public class Main {
    public static void main(String[] args) {
        USMoneyTester testCase = new USMoneyTester();
        testCase.moneytest();

        BinTester bt = new BinTester();
        bt.binTest();

    }
}
