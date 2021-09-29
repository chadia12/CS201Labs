package Lesson1;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your names");
        String fname= input.next();
        String lname= input.next();
      System.out.println("your email is: " +fname.charAt(0) +lname+ "@miu.edu") ;

    }

}
