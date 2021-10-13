package Lab10;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size of array");
        int N= input.nextInt();
        double []arr =new double [N];
      double sum=0;
        double mean=0;
        double deviation=0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter a values");
            arr[i] = input.nextDouble();
            sum += arr[i];
        }
        mean= sum / N;
        for (int i = 0; i < N; i++) {
            deviation += Math.pow((arr[i]-mean),2);
        }

        double sandardDeviation= Math.sqrt(deviation / N);
        System.out.println("Sandard Deviation: "+sandardDeviation);
        }

    }

