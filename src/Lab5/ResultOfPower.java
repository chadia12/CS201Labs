package Lab5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ResultOfPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a power of number");
        int number = input.nextInt();
        if ( number < 6){
            System.out.println("less than a Million");
        }
        else if (number >= 6 && number < 9){
            System.out.println("Million");
        }
        else if(number >=9 && number < 12 ){
            System.out.println("Billion");

        }
        else if(number >= 12 && number < 15 ){
            System.out.println("Trillion");

        }
        else if(number >= 15 && number < 18 ){
            System.out.println("Quadrillion");

        }
        else if(number >= 18 && number < 21 ){
            System.out.println("Quintillion");

        }
        else if(number >= 21 && number < 30 ){
            System.out.println("Sextillion");

        }
        else if(number >= 30 && number < 100 ){
            System.out.println("Nonillion");

        }
        else{
            System.out.println("Googol");

        }
    }
}
