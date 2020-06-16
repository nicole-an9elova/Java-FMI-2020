package com.jetbrains;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int originalNumber = input.nextInt();
	    int copyNumber = originalNumber;
	    int count = 0;
		String resultsString = "";
		int digit1 = originalNumber / 10_000;
		int digit2 = originalNumber / 1000 % 10;
		int digit3 = originalNumber / 100 % 10;
		int digit4 = originalNumber / 10 % 10;
		int digit5 = originalNumber % 10;
	    while(copyNumber > 0){
	        copyNumber /= 10;
            ++count;
        }
	    if(count != 5){
	    	System.out.print("Error!The number must be five digits!");
		}
	    else{
	    	if(digit1 == digit5 && digit2 == digit4) {
				resultsString = "The number is a palindrome!";
			}
	    	else{
	    		resultsString = "The number is not a palindrome!";
			}
		}
	    System.out.print(resultsString);
    }
}
