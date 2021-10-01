package Lab4;


import java.util.Scanner;

public class CoffeeBagMain {
    public static void main(String[] args) {
       /* CoffeeBag coffee = new CoffeeBag(32,5);
        coffee.PrintResult();*/

        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of bags ");
        double weightBag = input.nextDouble();
        System.out.println("Enter Weight bag");
        int bagNumber =input.nextInt();
        CoffeeBag coffee1 = new CoffeeBag(weightBag, bagNumber);
        coffee1.PrintResult();
    }
}
