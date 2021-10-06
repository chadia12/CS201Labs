package Lab8and9;
import java.lang.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String sentence;
        int count = 0;
        do{
            System.out.println("enter a sentence");
            sentence = input.nextLine();
            if(sentence.isEmpty())
                break;
            for(int i=0;i< sentence.length();i++){
                if(Character.isUpperCase(sentence.charAt(i)))
                    count++;
            }
            System.out.println(count);
        }while(true);
    }
}
