package Lab7;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        primeNumber();
    }

    public static void primeNumber() {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a number");
            num = input.nextInt();
            if (num < 1) {
                break;
            }
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("NOT PRIME");
            } else {
                System.out.println("PRIME");
            }
        } while (num > 0);
    }

}
