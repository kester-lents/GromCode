package lesson10.AbstractBigExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public class ManagerEmployee extends Employee {
    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth();
        newBalance += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);
    }
}
