
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Converter converter = new Converter();

        int choice;
        double num1, num2, result;
        char continueChoice;

        do {

            try {

                System.out.println("\n========================================");
                System.out.println("      ENHANCED JAVA CALCULATOR");
                System.out.println("========================================");

                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square Root");
                System.out.println("6. Power");
                System.out.println("7. Temperature Converter");
                System.out.println("8. Currency Converter");
                System.out.println("9. Exit");

                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter First Number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter Second Number: ");
                        num2 = sc.nextDouble();

                        result = calculator.add(num1, num2);

                        System.out.println("Result = " + result);
                        break;

                    case 2:

                        System.out.print("Enter First Number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter Second Number: ");
                        num2 = sc.nextDouble();

                        result = calculator.subtract(num1, num2);

                        System.out.println("Result = " + result);
                        break;

                    case 3:

                        System.out.print("Enter First Number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter Second Number: ");
                        num2 = sc.nextDouble();

                        result = calculator.multiply(num1, num2);

                        System.out.println("Result = " + result);
                        break;

                    case 4:

                        System.out.print("Enter First Number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter Second Number: ");
                        num2 = sc.nextDouble();

                        result = calculator.divide(num1, num2);

                        System.out.println("Result = " + result);
                        break;

                    case 5:

                        System.out.print("Enter Number: ");
                        num1 = sc.nextDouble();

                        result = scientificCalculator.squareRoot(num1);

                        System.out.println("Result = " + result);
                        break;

                    case 6:

                        System.out.print("Enter Base: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter Exponent: ");
                        num2 = sc.nextDouble();

                        result = scientificCalculator.power(num1, num2);

                        System.out.println("Result = " + result);
                        break;

                    case 7:

                        System.out.println("\nTemperature Converter");
                        System.out.println("1. Celsius to Fahrenheit");
                        System.out.println("2. Fahrenheit to Celsius");

                        System.out.print("Enter Choice: ");
                        int tempChoice = sc.nextInt();

                        if (tempChoice == 1) {

                            System.out.print("Enter Celsius: ");
                            num1 = sc.nextDouble();

                            result = converter.celsiusToFahrenheit(num1);

                            System.out.println("Result = " + result + " °F");

                        } else if (tempChoice == 2) {

                            System.out.print("Enter Fahrenheit: ");
                            num1 = sc.nextDouble();

                            result = converter.fahrenheitToCelsius(num1);

                            System.out.println("Result = " + result + " °C");

                        } else {

                            System.out.println("Invalid Choice!");

                        }

                        break;

                    case 8:

                        System.out.println("\nCurrency Converter");
                        System.out.println("1. Rupees to Dollar");
                        System.out.println("2. Dollar to Rupees");

                        System.out.print("Enter Choice: ");
                        int currencyChoice = sc.nextInt();

                        if (currencyChoice == 1) {

                            System.out.print("Enter Rupees: ");
                            num1 = sc.nextDouble();

                            result = converter.rupeesToDollar(num1);

                            System.out.printf("Dollar = %.2f%n", result);

                        } else if (currencyChoice == 2) {

                            System.out.print("Enter Dollars: ");
                            num1 = sc.nextDouble();

                            result = converter.dollarToRupees(num1);

                            System.out.printf("Rupees = %.2f%n", result);

                        } else {

                            System.out.println("Invalid Choice!");

                        }

                        break;

                    case 9:

                        System.out.println("\nThank you for using the Enhanced Calculator!");
                        sc.close();
                        return;

                    default:

                        System.out.println("Invalid Choice!");

                }

            } catch (InputMismatchException e) {

                System.out.println("\nInvalid input! Please enter numeric values only.");
                sc.nextLine(); // Clear invalid input

            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            continueChoice = sc.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("\nThank you for using the Enhanced Calculator!");
        sc.close();
    }
}
