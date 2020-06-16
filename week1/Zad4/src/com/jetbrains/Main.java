package com.jetbrains;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number:");
	    int number = input.nextInt();
	    String output = "";
	    int count = 0;
	    int copyNumber = number;
	    while(copyNumber > 0){
	        copyNumber /= 10;
	        ++count;
        }
	    if(count == 4){
	    	for(int i = 0; i < 4;i++){
	    		int digit = number % 4;
	    		switch (digit){
					case 0:
						output = 'A' + output;
						break;
					case 1:
						output = 'C' + output;
						break;
					case 2:
						output = 'G' + output;
						break;
					case 3:
						output = 'T' + output;
						break;
				}
				number /= 4;
			}
	    	System.out.print(output);
		}
	    else{
	    	System.out.print("The number must be 4 digits!");
		}
    }
}
