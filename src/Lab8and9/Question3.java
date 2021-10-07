package Lab8and9;


import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        do {
            System.out.println("Enter a sentence ");
            String sentence = key.nextLine();
            if(sentence.isEmpty()){
                break;}
            StringBuffer sent = new StringBuffer(sentence);
            sent.setCharAt(0, 'C');
            sent.setCharAt(1, 'T');
            sent.setCharAt(2, 'A');
            sent.setCharAt(3, 'A');
            sent.setCharAt(4, 'G');
            sent.setCharAt(5, 'C');
            sent.setCharAt(6, 'T');
            sent.setCharAt(7, 'A');
            sent.setCharAt(8, 'G');
            System.out.println(sent);
        }while(true);
    }
}
