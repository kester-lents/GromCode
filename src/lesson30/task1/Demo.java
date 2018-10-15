package lesson30.task1;

import java.util.Timer;

/**
 * Created by Ruslan on 09.10.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Bank euBank = new USBank(1222, "Sweden", Currency.EUR, 100,
                1400, 4, 444343434);
        User user = new User(1001, "Denis", 1000, 40,
                "GMD", 1500, euBank);

        UkrainianBankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user,5);
       try {
           Thread.sleep(2000);
       }catch (Exception e){
           e.printStackTrace();
       }
        bankSystem.withdraw(user,10);

        System.out.println(bankSystem.getTransactions());
    }
}
