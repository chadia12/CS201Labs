package Lab2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str=input.next();
        int s=str.length();
            System.out.println(str.charAt(s/2));
    }
}
