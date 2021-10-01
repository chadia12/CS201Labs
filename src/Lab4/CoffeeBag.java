package Lab4;
import java.text.DecimalFormat;


public class CoffeeBag {
    private double bagWeight;
    private int numberOfBags;
    final static private double PRICE_PER_UNIT = 5.99;
    final static private double TAX_RATE = 7.25;
    public CoffeeBag(double bagWeight , int numberOfBags){
        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
    }

    public double totalPrice(){
      double  total = this.bagWeight * this.numberOfBags * PRICE_PER_UNIT;
      double totalPriceWithTax = total + (total * TAX_RATE)/100;
return totalPriceWithTax;
    }

    public  void PrintResult(){
        DecimalFormat dec = new DecimalFormat("###.##");
        System.out.println(" Number of bags sold: "+this.bagWeight + "\n Weight per bag: " + this.numberOfBags +
                "\n Price per pound: " + PRICE_PER_UNIT +
                        "\n Sales tax: "+ TAX_RATE + "% " +
                                "\n Total price: $ " + dec.format(totalPrice()));

    }
}
