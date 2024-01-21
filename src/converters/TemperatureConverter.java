package converters;//import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        String massageFormat = "%7d\t\t\t%10.2f\n";

        System.out.println("Convert Celsius to Fahrenheit.");
        System.out.println();
        System.out.println("Celsius" + "\t\t\t" + "Fahrenheit");
        for (int i = 0; i <= 300; i += 21) {
            double solve = convertCelsToFahr(i);
            System.out.printf(massageFormat, i, solve);

        }
    }

    private static double convertCelsToFahr (int cels) {
        //System.out.println("Call Function with arg: " + cels);
        return cels * 9.0 / 5.0 + 32;
    }
}