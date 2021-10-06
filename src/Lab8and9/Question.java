package Lab8and9;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        do{
            System.out.println("Enter sentence");
            sentence = input.nextLine();
            if(sentence.isEmpty())
                break;
            for(int i=0; i<sentence.length(); i++) {
                if (sentence.charAt(i) == 'a') {
                    count++;
                }
                if (sentence.charAt(i) == 'e') {
                    count1++;
                }
                if (sentence.charAt(i) == 'i') {
                    count2++;
                }
                if (sentence.charAt(i) == 'u') {
                    count3++;
                }
                if (sentence.charAt(i) == 'o') {
                    count4++;
                }
            }
            System.out.println("# of 'a': " +count);
            System.out.println("# of 'e': " +count1);
            System.out.println("# of 'i': " +count2);
            System.out.println("# of 'u': " +count3);
            System.out.println("# of 'o': " +count4);
        } while(true);

    }
}
