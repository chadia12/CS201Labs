package Lab3;

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
