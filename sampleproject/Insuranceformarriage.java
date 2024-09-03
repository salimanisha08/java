package sampleproject;

import java.util.Scanner;

public class Insuranceformarriage {


			// TODO Auto-generated method stub

			public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);



		        // Input: User enters marital status

		        System.out.print("Enter your marital status (M for Married, U for Unmarried): ");

		        char maritalStatus = scanner.next().charAt(0);



		        // Check marital status

		        if (maritalStatus == 'M' || maritalStatus == 'm') {

		            System.out.println("Eligible for marriage insurance.");

		        } else if (maritalStatus == 'U' || maritalStatus == 'u') {

		            // If unmarried, ask for gender

		            System.out.print("Enter your gender (Male/Female): ");

		            String gender = scanner.next();



		            // Check gender and corresponding age eligibility

		            if (gender.equalsIgnoreCase("Female")) {

		                System.out.print("Enter your age: ");

		                int age = scanner.nextInt();

		                if (age > 20) {

		                    System.out.println("Eligible for marriage insurance.");

		                } else {

		                    System.out.println("Not eligible for marriage insurance.");

		                }

		            } else if (gender.equalsIgnoreCase("Male")) {

		                System.out.print("Enter your age: ");

		                int age = scanner.nextInt();

		                if (age > 30) {

		                    System.out.println("Eligible for marriage insurance.");

		                } else {

		                    System.out.println("Not eligible for marriage insurance.");

		                }

		            } else {

		                System.out.println("Invalid gender input.");

		            }

		        } else {

		            System.out.println("Invalid marital status input.");

		        }



		        scanner.close();

		    



		}



	}



	


