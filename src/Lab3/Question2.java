package Lab3;
/*
Write a program to convert centimeters (input) to feet and inches (output). 1 in = 2.54 cm.
 */

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter your centimeters");
        double cent = keyboard.nextDouble();
        feetToInches(cent);

    }
    public static void feetToInches(double cent){
        double inch= cent / 2.54;
        int feet = (int)inch /12;
        double remainder= inch % 12;
        System.out.print(cent+ " centimeters = " +feet+ " Feet " +remainder+ " inches");
    }
}
