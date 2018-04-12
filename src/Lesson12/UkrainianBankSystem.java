package Lesson12;

/**
 * Created by Ruslan on 12.04.2018.
 */
public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        if (!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        if (!checkLimitOfFunding(user, amount, user.getBank().getLimitOfFunding()))
            return;
        user.setBalance(user.getBalance() + amount + amount * user.getBank().getCommission(amount));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //1. Проверить, есть ли на счете и проходит ли лимит снятия фромюзер
        //2. Проверить, не превышен ли лимит пополнения у туЮзера.
        //3. Перевести.
        if (!checkWithdraw(fromUser, amount))
            return;
        if (!checkLimitOfFunding(toUser, amount, toUser.getBank().getLimitOfFunding()))
            return;
        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount - amount * toUser.getBank().getCommission(amount));
        ////////////Check!!!!! - amount&
    }

    @Override
    public void paySalary(User user) {
        if (!checkLimitOfFunding(user, user.getSalary(), user.getBank().getLimitOfFunding()))
            return;
        user.setSalary(user.getSalary());
    }

    private void printWithdrawalErrorMsd(int amount, User user) {
        System.out.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsd(amount, user);
            return false;
        }
        return true;
    }

    private boolean checkLimitOfFunding(User user, int amount, double limit) {
        if (amount - amount * user.getBank().getCommission(amount) > limit) {
            printFundingErrorMsg(user, amount);
            return false;
        }
        return true;
    }

    private void printFundingErrorMsg(User user, int amount) {
        System.err.println("Can't replenish on " + amount + " of user " + user.toString());
    }
}

