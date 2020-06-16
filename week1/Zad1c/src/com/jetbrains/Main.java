/*An application that enables the user either to enter a Fahrenheit temperature and display 
the Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.*/
package com.jetbrains;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("What temperature do you want to convert?(c or f):");
        char choiceOfTemp = input.next().charAt(0);
        double fahrenheitTemp;
        double celsiusTemp;
        if(choiceOfTemp == 'f') {
            System.out.print("Enter Fahrenheit temperature:");
            fahrenheitTemp = input.nextDouble();
            celsiusTemp = (5.0 / 9.0 * (fahrenheitTemp - 32));
            System.out.print("This is the Celsius temperature:" + celsiusTemp);
        }
        else if(choiceOfTemp == 'c') {
            System.out.print("Enter Celsius temperature:");
            celsiusTemp = input.nextDouble();
            fahrenheitTemp = (9.0 / 5.0 * (celsiusTemp + 32));
            System.out.print("This is the Fahrenheit temperature:" + fahrenheitTemp);
        }
        else{
            System.out.print("No such temperature! :)");
        }
    }
}
