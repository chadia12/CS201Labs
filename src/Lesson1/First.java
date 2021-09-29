package Lesson1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name and last name");
        String firstname= input.next();
        String lastname = input.next();

        System.out.println("your initials is: " + firstname.charAt(0)+ "" +lastname.charAt(0));
    }
}
