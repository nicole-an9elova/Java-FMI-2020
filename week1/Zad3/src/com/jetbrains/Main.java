package com.jetbrains;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //Encryption
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        int copyNumber = number;
        int count = 0;
        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;
        while(copyNumber > 0){
            copyNumber /= 10;
            ++count;
        }
        if(digit1 == 0){
            ++count;
        }
        if(count != 4){
            System.out.print("The number must be 4 digits!");
        }
        else{
            int newDigit1 = (digit1 + 7) % 10;
            int newDigit2 = (digit2 + 7) % 10;
            int newDigit3 = (digit3 + 7) % 10;
            int newDigit4 = (digit4 + 7) % 10;
            System.out.printf("%s: %d%d%d%d", "Encrypted number", newDigit3, newDigit4, newDigit1, newDigit2);
        }
    }
}
