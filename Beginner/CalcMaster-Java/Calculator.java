
public class Calculator {

    // Addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public double divide(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }

        return num1 / num2;
    }
}
