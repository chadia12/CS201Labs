package Lab7;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("FOR LOOP");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("FOR SUM: " + sum);

        System.out.println("DO WHILE LOOP");
        int j = 1;
        int sum1 = 0;
        do {
            sum1 += j;
            j++;
        } while (j <= 100);
        System.out.println("DO WHILE SUM " + sum1);
        System.out.println(" WHILE LOOP");
        int k = 1;
        int sum2 = 0;
        while (k <= 100) {
            sum2 += k;
            k++;
        }
        System.out.println("WHILE SUM: " + sum2);

        System.out.println("B");
        System.out.println("FOR LOOP");
        int sum11 = 0;
        for (int a = 5; a <= 50; a += 5) {
            sum11 += a;
        }
        System.out.println("FOR SUM: " + sum11);

        System.out.println("DO WHILE LOOP");
        int b = 5;
        int sum12 = 0;
        do {
            sum12 += b;
            b += 5;
        } while (b <= 50);
        System.out.println("DO WHILE SUM " + sum12);
        System.out.println(" WHILE LOOP");
        int c = 5;
        int sum13 = 0;
        while (c <= 50) {
            sum13 += c;
            c += 5;
        }
        System.out.println("WHILE SUM: " + sum13);
    }
}