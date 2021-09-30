package Lab3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question3 {
    final static double CONSTANT1=1.8;
    final static int CONSTANT2 = 32;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your temperature in Celsius");
        double celsius = input.nextDouble();
        double fahrenheit ;
        fahrenheit = CONSTANT1 * celsius + CONSTANT2;
        System.out.println("Temperature " + celsius + " = " + fahrenheit + " Fahrenheit");
    }
}
