
public class ScientificCalculator {

    // Square Root
    public double squareRoot(double number) {

        if (number < 0) {
            System.out.println("Error! Square root of a negative number is not possible.");
            return 0;
        }

        return Math.sqrt(number);
    }

    // Power
    public double power(double base, double exponent) {

        return Math.pow(base, exponent);
    }

}
