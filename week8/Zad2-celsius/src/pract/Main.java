package pract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fahrenheitTemp;
        double celsiusTemp;
        do {
            System.out.print("Enter Fahrenheit temperature:");
            fahrenheitTemp = input.next();
        }while(!fahrenheitTemp.matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$"));
        float fahrenheit = Float.parseFloat(fahrenheitTemp);

        celsiusTemp = (5.0 / 9.0 * (fahrenheit - 32));
        System.out.print("This is the Celsius temperature:" + celsiusTemp);
    }
}
