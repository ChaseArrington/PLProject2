
package ui;

import business.CheckingAccount;
import business.Transactions;

/**
 * Created by Adam Barrett on 2/18/2016.
 */

public class AccountApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Account Calculator");
        System.out.println();
        System.out.println("Starting Balance");

        CheckingAccount userAccount = new CheckingAccount();
        Transactions userTrans = new Transactions();
        userAccount.setBalance(1000);

        System.out.println("Checking: " + userAccount.getBalanceFormatted());
        System.out.println();
        System.out.println("Enter the transactions for the month");
        System.out.println();
        Console prompt = new Console();
        while (true){
            String pointer = prompt.getString("Withdrawal or deposit? (w/d): ");
            if(!pointer.equalsIgnoreCase("w") && !pointer.equalsIgnoreCase("d")){
                System.out.println("Invalid Input");
                System.out.println();
                continue;
            }
            double amount = prompt.getDouble("Amount: ");
            if(pointer.equalsIgnoreCase("w")){
                //userAccount.withdraw(amount);
                userTrans.withdraw(userAccount, amount);
                if (userAccount.getBalance() < 0){
                    userTrans.deposit(userAccount, amount);
                    System.out.println("Insufficient Funds");
                }
            } else if(pointer.equalsIgnoreCase("d")){
                //userAccount.deposit(amount);
                userTrans.deposit(userAccount, amount);
                if (amount > 10000){
                    userTrans.withdraw(userAccount, amount);
                    System.out.println("Sorry, you cannot deposit more than $10,000 per transaction");
                }
            }

            System.out.println();

            String contPro = prompt.getString("Continue? (y/n): ");
            if(contPro.equalsIgnoreCase("y")){
                System.out.println();
                continue;
            }

            System.out.println();
            System.out.println("Monthly Fees");
            System.out.println("Checking Fee:           " + userAccount.getMonthlyFeeFormatted());

            userAccount.subtractMonthlyFee();
            System.out.println();
            System.out.println("Final Balance");
            System.out.println("Checking: " + userAccount.getBalanceFormatted());
            break;
        }

    }
}