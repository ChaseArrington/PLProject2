package business;

/**
 * Created by chase_000 on 2/14/2016.
 */
public abstract class Person {

    // Creates the instance variables
    private String firstName;
    private String lastName;
    private String email;

    // Creates the constructor
    public Person(){
    }

    // Creates the set and get methods for the firstName variable
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    //Creates the set and get methods for the lastName variable
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    // Creates the set and get methods for the email variable
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){return "Name: " + firstName + " " + lastName + "\n" + "Email: " + email;}
    abstract String getDisplayText();
}
