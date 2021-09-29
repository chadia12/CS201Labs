package Lab2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str=input.nextLine();
        int c =str.length()-1;
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(c));
    }
}
