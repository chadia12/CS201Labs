package Lab12;

public class Question2 {
    public static void main(String[] args) {
        int []num={3,5,2,6,5};
        int index= num.length;
        System.out.println(smallest(num,index));

    }
    public static int smallest (int [] num, int index){

        if(index==0)
            return num[0];
        else

            return Math.min(num[index-1], smallest(num, index-1));

    }
}
