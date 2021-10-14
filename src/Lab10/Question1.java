package Lab10;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Question1 {
    public static void main(String[] args) {
        double[] temps = new double[365];
        temps[1] = 100;
        temps[100] = -20;
        System.out.println("The coldest Temperature: " +getColdest(temps));
        System.out.println("The hottest Temperature: " +getHottest(temps));
        System.out.println("the difference of temperature: " +getDiff(temps));
        System.out.println(getTemp(2,23,temps));
    }


    public static double getHottest(double[] temps){
        double hottest = Double.MIN_VALUE;
        //logic
        for(int i = 0; i < temps.length; i++){
            if(temps[i] > hottest)
                hottest = temps[i];
        }
        return hottest;
    }

    public static double getColdest(double[] temps){
        double coldest = Double.MAX_VALUE;
        //logic
        for(int i = 0; i < temps.length; i++){
            if(temps[i] < coldest)
                coldest = temps[i];
        }
        return coldest;
    }

    public static double getDiff(double[] temps){
        return getHottest(temps) - getColdest(temps);
    }

    public static double getTemp(int month, int day, double[] temps){
        try{
            LocalDate date = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR), month, day);
            return temps[date.getDayOfYear() - 1];
        }catch (Exception e){
            return -1;
        }
    }
}
