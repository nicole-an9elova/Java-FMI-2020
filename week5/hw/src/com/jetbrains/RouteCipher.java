package com.jetbrains;

import java.util.Arrays;

public class RouteCipher {
    private int key;
    private String sign;

    public RouteCipher() {
        setKey(1);
    }

    public RouteCipher(int key) {
        setKey(key);
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        if (key < 0) {
            sign = "negative";
            this.key = key * (-1);
        } else if (key > 0) {
            sign = "positive";
            this.key = key;
        }
    }

    //the following method helps me to fill the string in a matrix and fill the empty spaces with X
    public char[][] fillBlock(String plainText) {
        char[] cipherTextChars = plainText.toCharArray();
        int pos = 0;
        int temp = 0;
        if (plainText.length() % key == 0) {
            temp = plainText.length() / key;
        } else {
            temp = (plainText.length() / key) + 1;
        }
        char[][] letterBlock = new char[temp][key];
        for (int r = 0; r < temp; r++) {
            for (int c = 0; c < key; c++) {
                if (pos < plainText.length()) {
                    char substr = cipherTextChars[pos];
                    letterBlock[r][c] = substr;
                    pos++;
                } else {
                    letterBlock[r][c] = 'X';
                }
            }
        }

        return letterBlock;
    }

    public String encrypt(String plainText) {
        //using the help method to fill the matrix that i will be encrypting
        char[][] matrixPlain = fillBlock(plainText);
        String text = new String();

        int startingRowIndex = 0;
        int endingRowIndex = matrixPlain.length;
        int startingColumnIndex = 0;
        int endingColumnIndex = matrixPlain[0].length;
        //i'm creating two cases. the first one is used in case we have a key that is a positive number, second one is for a negative one
        if (sign.equals("positive")) {
            int iter;
            while (startingRowIndex < endingRowIndex &&
                    startingColumnIndex < endingColumnIndex) {
                //adding the elements to string text, from the first column from the remaining ones
                for (iter = startingRowIndex; iter < endingRowIndex; ++iter) {
                    text += matrixPlain[iter][startingColumnIndex];
                }
                startingColumnIndex++;
                //adding the elements to string text, from the last row from the remaining ones
                for (iter = startingColumnIndex; iter < endingColumnIndex; ++iter) {
                    text += matrixPlain[endingRowIndex - 1][iter];
                }
                endingRowIndex--;

                if (startingColumnIndex < endingColumnIndex) {
                    //adding the elements to string text, from the last column from the remaining ones
                    for (iter = endingRowIndex - 1; iter >= startingRowIndex; --iter) {
                        text += matrixPlain[iter][endingColumnIndex - 1];
                    }
                    endingColumnIndex--;
                }
                if (startingRowIndex < endingRowIndex) {
                    //adding the elements to string text, from the first row from the remaining ones
                    for (iter = endingColumnIndex - 1; iter >= startingColumnIndex; --iter) {
                        text += matrixPlain[startingRowIndex][iter];
                    }
                    startingRowIndex++;
                }
            }
        } else {
            int iter;
            while (startingRowIndex < endingRowIndex &&
                    startingColumnIndex < endingColumnIndex) {
                //adding the elements to string text, from the the last column from the remaining ones
                for (iter = endingRowIndex - 1; iter >= startingRowIndex; --iter) {
                    text += matrixPlain[iter][endingColumnIndex - 1];
                }
                endingColumnIndex--;
                //adding the elements to string text, from the first row of the remaining ones
                for (iter = endingColumnIndex - 1; iter >= startingColumnIndex; --iter) {
                    text += matrixPlain[startingRowIndex][iter];
                }
                startingRowIndex++;
                if (startingColumnIndex < endingColumnIndex) {
                    //adding the elements to string text, from the first column from the remaining ones
                    for (iter = startingRowIndex; iter <= endingRowIndex - 1; ++iter) {
                        text += matrixPlain[iter][startingColumnIndex];
                    }
                    startingColumnIndex++;
                }
                if (startingRowIndex < endingRowIndex) {
                    //adding the elements to string text, from the last row from the remaining ones
                    for (iter = startingColumnIndex; iter <= endingColumnIndex - 1; ++iter) {
                        text += matrixPlain[endingRowIndex - 1][iter];
                    }
                    endingRowIndex--;
                }
            }
        }
        //returning the encrypted text
        return text;
    }

    public String decrypt(String cipherText) {
        char[] cipherTextChars = cipherText.toCharArray();
        String text = new String();

        int temp = 0;
        if (cipherText.length() % key == 0) {
            temp = cipherText.length() / key;
        } else {
            temp = (cipherText.length() / key) + 1;
        }
        char[][] decryptedChars = new char[temp][key];
        int startingRowIndex = 0;
        int endingRowIndex = temp;
        int startingColumnIndex = 0;
        int endingColumnIndex = key;
        int pos = 0;

        int iter;
        while (startingRowIndex < endingRowIndex &&
                startingColumnIndex < endingColumnIndex) {
            //adding elements from an array of chars to a matrix
            //adding to the last column from the remaining ones
            for (iter = endingRowIndex - 1; iter >= startingRowIndex; --iter) {
                decryptedChars[iter][endingColumnIndex - 1] = cipherTextChars[pos];
                pos++;
            }
            endingColumnIndex--;
            //adding to the first row from the remaining ones
            for (iter = endingColumnIndex - 1; iter >= startingColumnIndex; --iter) {
                decryptedChars[startingRowIndex][iter] = cipherTextChars[pos];
                pos++;
            }
            startingRowIndex++;
            if (startingColumnIndex < endingColumnIndex) {
                //adding to the first column from the remaining ones
                for (iter = startingRowIndex; iter <= endingRowIndex - 1; ++iter) {
                    decryptedChars[iter][startingColumnIndex] = cipherTextChars[pos];
                    pos++;
                }
                startingColumnIndex++;
            }
            if (startingRowIndex < endingRowIndex) {
                //adding to the last row from the remaing ones
                for (iter = startingColumnIndex; iter <= endingColumnIndex - 1; ++iter) {
                    decryptedChars[endingRowIndex - 1][iter] = cipherTextChars[pos];
                    pos++;
                }
                endingRowIndex--;
            }
        }

        //depending on whether the key is negative or positive the letters are supposed to be added in a different way
        //that's why i'm using this conditional statement
        if (sign.equals("positive")) {
            for (int r = temp - 1; r >= 0; --r) {
                for (int c = key - 1; c >= 0; --c) {
                    text += decryptedChars[r][c];
                }
            }
        } else {
            for (int r = 0; r < temp; r++) {
                for (int c = 0; c < key; c++) {
                    text += decryptedChars[r][c];
                }
            }
        }

        //return the decrypted text
        return text;
    }
    @Override
    public String toString(){
        return String.format("Route Cipher code = %d", key);
    }
}
