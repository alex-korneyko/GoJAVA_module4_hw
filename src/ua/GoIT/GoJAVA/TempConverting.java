package ua.GoIT.GoJAVA;

/**
 * Class {@code TempConverting} makes the conversion temperature
 */
public class TempConverting {

    /**
     * Conversion from Celsius to Fahrenheit
     * @param celsius temperature in degrees of Celsius
     * @return temperature in degrees of Fahrenheit
     */
    public static double ToFahrenheit(double celsius)
    {
        return (celsius * 1.8) +32;
    }

    /**
     * Conversion from Fahrenheit to Celsius
     * @param fahrenheit temperature in degrees of Fahrenheit
     * @return temperature in degrees of Celsius
     */
    public static double ToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) / 1.8;
    }
}
