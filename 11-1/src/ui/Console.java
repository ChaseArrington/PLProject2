package ui;

import java.util.Scanner;

/**
 * Created by chase_000 on 2/14/2016.
 */
public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }
    public static String getSSN(String prompt) {
        System.out.print(prompt);
        String numb = sc.nextLine();
        String ssn = numb.substring(0,3) + "-" + numb.substring(3,6) + "-"+ numb.substring(6,9);
        return ssn;
        }


}
