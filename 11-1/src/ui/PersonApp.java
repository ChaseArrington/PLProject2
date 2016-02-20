package ui;

import java.util.Scanner;
import java.lang.*;
import business.Customer;
import business.Employee;
import business.Person;

/**
 * Created by chase_000 on 2/9/2016.
 */
public class PersonApp {

    public static void main(String args[]) {

        System.out.println("Welcome to the Person Tester application");
        System.out.println();

        Scanner user_input = new Scanner( System.in );
        Customer cust = new Customer();
        Employee emp = new Employee();
        Console prompt = new Console();
        while(true) {
            String pointer = prompt.getString("Create customer or employee? (c/e): ");
            if (!pointer.equalsIgnoreCase("c") && !pointer.equalsIgnoreCase("e")) {
                System.out.println("Invalid Input");
                System.out.println();
                continue;
            }
            if (pointer.equalsIgnoreCase("c")) {
                String firstName = prompt.getString("Enter first name: ");
                cust.setFirstName(firstName);
                String lastName = prompt.getString("Enter last name: ");
                cust.setLastName(lastName);
                String email = prompt.getString("Enter email address: ");
                cust.setEmail(email);
                String customerNumber = prompt.getString("Customer number: ");
                cust.setCustomerNumber(customerNumber);

                System.out.println("\n" + "You entered:" + "\n" + cust.getDisplayText());

            } else if (pointer.equalsIgnoreCase("e")) {
                String firstName = prompt.getString("Enter first name: ");
                emp.setFirstName(firstName);
                String lastName = prompt.getString("Enter last name: ");
                emp.setLastName(lastName);
                String email = prompt.getString("Enter email address: ");
                emp.setEmail(email);
                String ssn = prompt.getSSN("Social security number: ");
                emp.setSocialSecurity(ssn);

                System.out.println("\n" + "You entered:" + "\n" + emp.getDisplayText());
            }
            System.out.println();
            String cont = prompt.getString("Continue? (y/n): ");
            if (cont.equalsIgnoreCase("y")) {
                System.out.println();
                continue;

            }
            break;

        }
    }
}
