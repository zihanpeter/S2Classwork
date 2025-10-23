/**
 * A class of some temperature operations.
 */
public class Temperature {
    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param c temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    /**
     * Converts Fahrenheit to Celsius
     *
     * @param f temperature in Fahrenheit
     * @return temperature in Celsius
     * */
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    /**
     * Converts Celsius to Kelvin
     *
     * @param c temperature in Celsius
     * @return temperature in Kelvin
     * */
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    /**
     * Converts Kelvin to Celsius
     *
     * @param k temperature in Kelvin
     * @return temperature in Celsius
     * */
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
    public static double fahrenheitToKelvin(double f) {
        return celsiusToKelvin(fahrenheitToCelsius(f));
    }
    public static double kelvinToFahrenheit(double k) {
        return celsiusToFahrenheit(kelvinToCelsius(k));
    }
    public static boolean isBoilingCelsius(double c) {
        return c >= 100;
    }
    public static boolean isFreezingCelsius(double c) {
        return c <= 0;
    }
    public static double difference(double t1, double t2) {
        return Math.abs(t1 - t2);
    }
}

