package Lab8and9;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String sentence;
        String reverse ="";
        do{
            System.out.println("enter a sentence");
            sentence = input.nextLine();
            if(sentence.isEmpty())
                break;
            for(int i=sentence.length()-1; i >= 0 ;i--){
               reverse +=sentence.charAt(i);
            }
            if(sentence.equals(reverse))
                System.out.println("True");
            else
            {
                System.out.println("False");
            }

        }while(true);
    }
    }

