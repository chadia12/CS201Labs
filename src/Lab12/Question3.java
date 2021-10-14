package Lab12;

public class Question3 {
    public static void main(String[] args) {
        int []sumOfNum={5,2,4};
        int index =sumOfNum.length;
        System.out.println(sumOfNumber(sumOfNum,index));

    }
    public static int sumOfNumber(int []sumOfNum,int index){

        if (index <= 0)
            return 0;
        else
            return sumOfNum[index-1] + sumOfNumber(sumOfNum,index-1);
    }
}
