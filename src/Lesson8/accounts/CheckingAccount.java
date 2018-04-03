package Lesson8.accounts;



/**
 * Created by Ruslan on 11.09.2017.
 */
public class CheckingAccount extends Account {
    int limitOFExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExpenses = limitOFExpenses;
    }

    void withdraw(int amount) {
        if (amount > limitOFExpenses)
            return;
        moneyAmount -= amount;
    }


}