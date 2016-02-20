package business;

/**
 * Created by chase_000 on 2/14/2016.
 */
public class Customer extends Person {

    private String customerNumber;

    public Customer(){
        super();
        customerNumber = "";
    }

    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String getDisplayText() { return super.toString() + "\n" + "Customer Number: " + customerNumber;}

}
