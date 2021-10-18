package Lab12;

public class Question4 {
    public static void main(String[] args) {
       reverseString("chadia",0);
        System.out.println("");
        reversStringOption("Hello");

    }
    public static void reverseString(String sentence,int i){
        if(sentence.length()==i)
            return;
        else
            reverseString(sentence,i+1);
            System.out.print(sentence.charAt(i));


    }
    public static void reversStringOption(String  word){
        String reverse=" ";
        for (int i = word.length()-1; i >=0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
