package business;

/**
 * Created by chase_000 on 2/14/2016.
 */
public class Employee extends Person {

    private String socialSecurity;

    public Employee(){
        super();
        socialSecurity = "";
    }

    public void setSocialSecurity(String socialSecurity){
        this.socialSecurity = socialSecurity;
    }

    public String getSocialSecurity(){
        return socialSecurity;
    }

    @Override
    public String getDisplayText() { return toString() + "\n" + "Social security number: " + socialSecurity;}
}
