package com.jetbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Decryption
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        int copyNumber = number;
        int count = 0;
        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;
        if(digit1 == 0){
            ++count;
        }
        while(copyNumber > 0){
            copyNumber /= 10;
            ++count;
        }
        if(count != 4){
            System.out.print("The number must be 4 digits!");
        }
        else{
            int newDigit1 = (digit1 + 3) % 10;
            int newDigit2 = (digit2 + 3) % 10;
            int newDigit3 = (digit3 + 3) % 10;
            int newDigit4 = (digit4 + 3) % 10;
            System.out.printf("%s: %d%d%d%d", "Decrypted number", newDigit3, newDigit4, newDigit1, newDigit2);
        }
    }
}
