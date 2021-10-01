package Lab3;
/*
Write a program that accepts a person’s weight and displays the number of calories the
person needs in one day. A person needs 19 calories per pound of body weight, so the formula
expressed in Java is
calories = bodyWeight * 19;
 */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight");
        int weight =input.nextInt();
        int calories;
        calories = weight * 19;
        System.out.println(weight + " weight you need " + calories + "per day");
    }
}
