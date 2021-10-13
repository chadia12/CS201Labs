package Lab12;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(countCharacter("chadia" ));

    }
    public static int countCharacter(String sentence){
        if(sentence.isEmpty())
            return 0;
        else
   return 1 + countCharacter(sentence.substring(1));


    }
}
