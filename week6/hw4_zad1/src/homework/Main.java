package homework;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int number1 = input.nextInt();
        System.out.printf("Bit representation of %d: %s", number1,
                BitRepresentation.display(number1));
        System.out.println();

        System.out.println("Enter the second integer:");
        int number2 = input.nextInt();
        System.out.printf("Bit representation of %d: %s", number2,
                BitRepresentation.display(number2));
        System.out.println();

        BitRepresentation.compare(BitRepresentation.display(number1),
                BitRepresentation.display(number2));


    }
}
