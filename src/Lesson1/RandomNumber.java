package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the number of roles");
        int userInput = input.nextInt();

        for (int i=1;i<=userInput;i++) {
            int d1 = random.nextInt(6) + 1;
            int d2 = random.nextInt(6) + 1;
            System.out.println(" (" + d1 + "," + d2 + ")");
        }
    }
        }



