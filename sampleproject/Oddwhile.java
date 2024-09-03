package sampleproject;

import java.util.Scanner;

public class Oddwhile {



		public static void main(String[] args) {

			// TODO Auto-generated method stub

	        Scanner scanner = new Scanner(System.in);

	        

	        // Input: User enters a number

	        System.out.print("Enter a number: ");

	        int number = scanner.nextInt();

	        

	        // Check if the number is odd or even using a while loop

	        int i = 0;

	        while (i < 1) {  // Loop runs just once

	            if (number % 2 == 0) {

	                System.out.println(number + " is even.");

	            } else {

	                System.out.println(number + " is odd.");

	            }

	            i++;

	        }

	        

	        scanner.close();




	}

}
