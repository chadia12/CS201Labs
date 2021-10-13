package Lab10;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number as month");
        int month= input.nextInt();
        System.out.println("enter a number as day");
        int day = input.nextInt();
        double[][] years = new double[month][day];
        for (int i = 0; i < years[month].length; i++) {
            for (int j = 0; j < years[i].length; j++) {
                if(years[i][j] <0 || years[i][j] >12)
                    month= input.nextInt();
            }
        }
        double temp =years[0][0];
        double max = temp;
        for (int i = 0; i < years.length; i++) {
            for (int j = 0; j < years[i].length; j++) {
                if (years[i][j] > max)
                    max = years[i][j];
            }

        }
        System.out.println("the hottest: " + max);
        double min = temp;
        for (int i = 0; i < years.length; i++) {
            for (int j = 0; j < years[i].length; j++) {
                if (years[i][j] < min)
                    min = years[i][j];
            }

        }
        System.out.println("the coldest is: " + min);
        double sum = 0;

        for (int i = 0; i < years.length; i++) {
            for (int j = 0; j < years[i].length; j++) {
                sum += years[i][j];
            }
            double average = sum /years[i].length;
            System.out.println("The average of temperature is: " + average);
        }


    }
}