package Lab3;

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
