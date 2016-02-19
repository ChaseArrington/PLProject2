package business;

/**
 * Created by Adam Barrett on 2/18/2016.
 */
public class Transactions {
    public static void deposit(account.interfaces.Depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw(account.interfaces.Withdrawable account, double amount) {
        account.withdraw(amount);
    }
}
