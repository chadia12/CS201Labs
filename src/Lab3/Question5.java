package Lab3;
/*
Write a program that inputs the year a person is born and outputs the age of the person in the
following format: You were born in 1990 and will be (are) 18 this year.
 */

import java.util.Scanner;

public class Question5 {
    final static int currentYear =2021;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year your are born in");
        int year = input.nextInt();
        int age;
        age = currentYear - year;
        System.out.println("you have " + age);
    }
}
