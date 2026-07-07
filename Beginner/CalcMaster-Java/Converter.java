
public class Converter {

    // Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Rupees to Dollars
    public double rupeesToDollar(double rupees) {
        double exchangeRate = 86.0;   // 1 USD = 86 INR (fixed rate)
        return rupees / exchangeRate;
    }

    // Dollars to Rupees
    public double dollarToRupees(double dollars) {
        double exchangeRate = 86.0;
        return dollars * exchangeRate;
    }

}
