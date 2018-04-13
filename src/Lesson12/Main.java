package Lesson12;

/**
 * Created by Ruslan on 12.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        Bank euBank = new USBank(1222, "Sweden", Currency.EUR, 100,
                1400, 4, 444343434);
        User user = new User(1001, "Denis", -1000, 40,
                "GMD", 1500, euBank);
        UkrainianBankSystem ukrainianBankSystem = new UkrainianBankSystem();
        /*ukrainianBankSystem.withdraw(user, 1000);
        System.out.println(user.getBalance());*/

        ukrainianBankSystem.fund(user, 11000);
        System.out.println(user.getBalance());

    }
}
