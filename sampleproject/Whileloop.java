package sampleproject;

import java.util.Scanner;



public class Whileloop {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        

        // Input: Table name and limit

        System.out.print("Enter the table number: ");

        int tableNumber = scanner.nextInt();

        System.out.print("Enter the limit: ");

        int limit = scanner.nextInt();

        

        // Generating multiplication table using while loop

        int i = 1;

        while (i <= limit) {

            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));

            i++;

        }

        

        scanner.close();



	}



}

