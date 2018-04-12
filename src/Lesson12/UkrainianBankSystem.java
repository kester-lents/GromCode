package Lesson12;

/**
 * Created by Ruslan on 12.04.2018.
 */
public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять -
        //проверить лимит
        //проверить достаточно ли денег
        //снять деньги
        if (!checkWithdraw(user, amount)) {
            return;
        } else user.setBalance(user.getBalance() - amount - (amount * user.getBank().getCommission(amount)));
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    @Override
    public void fund(User user, int amount) {
        if (!checkFunding(user, amount))
            return;
        user.setBalance(user.getBalance() + amount - amount * user.getBank().getCommission(amount));
    }

    private boolean checkFunding(User user, int amount) {
        return checkFundingLimits(user, amount, user.getBank().getLimitOfFunding());
    }

    private boolean checkFundingLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printFundingErrorMsg(user, amount);
            return false;
        }
        return true;
    }

    private void printFundingErrorMsg(User user, int amount) {
        System.err.println("Can't replenish on " + amount + " of user " + user.toString());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //1. Проверить, есть ли на счете и проходит ли лимит снятия фромюзер
        //2. Проверить, не превышен ли лимит пополнения у туЮзера.
        //3. Перевести.
        if (!checkWithdraw(fromUser, amount))
            return;
        if (!checkFunding(toUser, amount))
            return;
        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount - amount * toUser.getBank().getCommission(amount));
    }

    @Override
    public void paySalary(User user) {
        if (!(user.getSalary() > user.getBank().getLimitOfFunding()))
            return;
        user.setBalance(user.getBalance() + user.getSalary());
    }


}

