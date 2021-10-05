package Lab5;

import java.util.Scanner;

public class EmployeeMyJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double BASIC_WAGE = 7.25;
        final double OVERTIME_WAGE = 1.5;
        final  int BASIC_HOUR = 40;
        System.out.println("enter hours you worked");
        int workHours = input.nextInt();
        System.out.println("Enter sales");
        double totalSale = input.nextDouble();
        double wages ;
        double overTimeHours;
       if(workHours < BASIC_HOUR ) {
           wages = workHours * BASIC_WAGE;
       }
       else {
        overTimeHours = (workHours - BASIC_HOUR ) * (OVERTIME_WAGE * BASIC_WAGE);
        wages = overTimeHours + (BASIC_HOUR  * BASIC_WAGE);
       }

        if (totalSale <= 99.99) {
            wages = wages + (totalSale * 0.05)  ;

        }
        else if (totalSale >= 299.99){
            wages = wages + (totalSale * 0.1) ;

        }
        else{
            wages = wages + (totalSale * 0.15) ;

        }
        System.out.println("your Wage is: " +wages);
    }
}
