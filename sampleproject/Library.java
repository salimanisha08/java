package sampleproject;

import java.util.Scanner;



public class Library {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);



        // Input: User enters the number of days the book is overdue

        System.out.print("Enter the number of days the book is overdue: ");

        int daysOverdue = scanner.nextInt();

        int fine = 0;



        // Calculate the fine based on the number of overdue days

        if (daysOverdue == 0) {

            System.out.println("No fine.");

        } else if (daysOverdue >= 1 && daysOverdue <= 10) {

            fine = daysOverdue * 10; // 10 Rs per day

            System.out.println("Fine is " + fine + " Rs.");

        } else if (daysOverdue >= 11 && daysOverdue <= 20) {

            fine = (10 * 10) + ((daysOverdue - 10) * 20); // 10 days at 10 Rs + additional days at 20 Rs

            System.out.println("Fine is " + fine + " Rs.");

        } else if (daysOverdue >= 21 && daysOverdue <= 30) {

            fine = (10 * 10) + (10 * 20) + ((daysOverdue - 20) * 30); // 10 days at 10 Rs + 10 days at 20 Rs + additional days at 30 Rs

            System.out.println("Fine is " + fine + " Rs.");

        } else if (daysOverdue > 30) {

            System.out.println("Membership cancelled.");

        } else {

            System.out.println("Invalid input.");

        }



        scanner.close();



	}



}

