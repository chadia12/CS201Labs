package Lab4;

public class WeightConverter {
    private double gravity;

    public WeightConverter(double gravity) {
        this.gravity = gravity;
    }

    public double Convert(double weight) {

        weight = weight * this.gravity;
        System.out.println("your weight on the moon: " + weight);
        return weight;
    }

}