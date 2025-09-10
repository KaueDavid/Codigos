public class Fahrenheit {
    public static void main(String[] args) {
        double celsius = 21;
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C eh igual a " + fahrenheit + "°F");

    }


    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
