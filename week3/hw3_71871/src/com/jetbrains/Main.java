package com.jetbrains;

import java.text.NumberFormat;
import java.util.Random;

public class Main {


    public static int drawRandomNumber() {
        Random randomNumbers = new Random();
        int random = 1 + randomNumbers.nextInt(100);
        if (random > 50) { return 3; }
        else if (random > 20) { return 2; }
        else { return 1; }
    }

    public static void main(String[] args) {
        NumberFormat fmtPercent = NumberFormat.getPercentInstance();
        double probabilityOneCounter = 0;
        double probabilityTwoCounter = 0;
        double probabilityThreeCounter = 0;
        double probabilityOneCounter6 = 0;
        double probabilityTwoCounter6 = 0;
        double probabilityThreeCounter6 = 0;
        for (int i = 0; i < 10_000; i++) {
            switch (drawRandomNumber()) {
                case 1:
                    ++probabilityOneCounter;
                    break;
                case 2:
                    ++probabilityTwoCounter;
                    break;
                case 3:
                    ++probabilityThreeCounter;
                    break;
            }
        }
        for (int i = 0; i < 60_000; i++) {
            switch (drawRandomNumber()) {
                case 1:
                    ++probabilityOneCounter6;
                    break;
                case 2:
                    ++probabilityTwoCounter6;
                    break;
                case 3:
                    ++probabilityThreeCounter6;
                    break;
            }
        }
        System.out.printf("%s\n", "10 000 times");
        System.out.println("Probability of 1:" + fmtPercent.format( probabilityOneCounter/ 10000));
        System.out.println("Probability of 2:" + fmtPercent.format( probabilityTwoCounter / 10000));
        System.out.println("Probability of 3:" + fmtPercent.format(probabilityThreeCounter / 10000));

        System.out.printf("%s\n", "60 000 times");
        System.out.println("Probability of 1:" + fmtPercent.format( probabilityOneCounter6/ 60000));
        System.out.println("Probability of 2:" + fmtPercent.format( probabilityTwoCounter6 / 60000));
        System.out.println("Probability of 3:" + fmtPercent.format(probabilityThreeCounter6 / 60000));

    }
}
