package Lab7;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
primeNumberBetween();
    }
    public static void primeNumberBetween() {
        Scanner input = new Scanner(System.in);
        int n;
        int count = 0;
        int temp=0;
            System.out.println("Enter a number");
            n = input.nextInt();
            for (int i = 2; i <= n; i++) {
                for( int j=2; j <= n ;j++){
                if (i % j == 0) {
                    count++;
                }
                }
                if(count == 1){
                    temp++;
                    count =0;

                }
                count =0;
        }
        System.out.println(temp);
    }
}