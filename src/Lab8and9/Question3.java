package Lab8and9;
import java.lang.*;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String sentence;

        do{
            System.out.println("sentence");
            sentence = input.nextLine();
            sentence = "GATTCGATC";
            if(sentence.isEmpty())
                break;
        String s1= sentence.replace('A','T');
        String s2= sentence.replace('G','C');
            System.out.println(" ");
            System.out.println(s1 +"[ ]"+ s2);

        }while(true);
    }
}
