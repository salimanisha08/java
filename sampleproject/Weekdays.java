package sampleproject;

import java.util.Scanner;


public class Weekdays {


		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);



	        // Input: User enters a number

	        System.out.print("Enter a day number (1-31): ");

	        int day = scanner.nextInt();



	        // Check the week based on the day number

	        if (day >= 1 && day <= 31) {

	            if (day >= 1 && day <= 7) {

	                System.out.println(day + " falls in the 1st week.");

	            } else if (day >= 8 && day <= 14) {

	                System.out.println(day + " falls in the 2nd week.");

	            } else if (day >= 15 && day <= 21) {

	                System.out.println(day + " falls in the 3rd week.");

	            } else if (day >= 22 && day <= 28) {

	                System.out.println(day + " falls in the 4th week.");

	            } else if (day >= 29 && day <= 31) {

	                System.out.println(day + " falls in the 5th week.");

	            }

	        } else {

	            System.out.println("Invalid day number. Please enter a number between 1 and 31.");

	        }



	        scanner.close();




	}

}
