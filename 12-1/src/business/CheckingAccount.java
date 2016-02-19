package business;
import java.text.NumberFormat;
/**
 * Created by Adam Barrett on 2/18/2016.
 */
public class CheckingAccount extends Account {
    double monthlyFee = 1;
    public void subtractMonthlyFee(){
        this.balance = this.balance - monthlyFee;
    }
    void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }
    double getMonthlyFee(){
        return monthlyFee;
    }
    public String getMonthlyFeeFormatted(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String amt = formatter.format(this.getMonthlyFee());
        return  amt;
    }
}
