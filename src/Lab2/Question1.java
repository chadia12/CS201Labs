package Lab2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First, middle and last name");
        String firstName=input.next();
        String middleName=input.next();
        String lastName=input.next();
        System.out.println(firstName+ " " + middleName.charAt(0) +". " + lastName);
    }
}
