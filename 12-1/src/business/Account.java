package business;
import java.text.NumberFormat;
/**
 * Created by Adam Barrett on 2/18/2016.
 */
public class Account implements account.interfaces.Balanceable, account.interfaces.Depositable, account.interfaces.Withdrawable {
    //initiating the balance variable
    double balance = 0;
    //implementing the methods from the interfaces
    public void setBalance(double amount){
        this.balance = amount;
    }
    public String getBalanceFormatted(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String amt = formatter.format(this.getBalance());
        return  amt;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

}
