package Lesson1;

import java.util.Random;

public class RandomC {
    public static void main(String[] args) {
        Random random = new Random();
        char c = (char)(random.nextInt(10)+ 'A');
        for(int i=1;i<10;i++) {
            System.out.print(c);
        }
    }
}
