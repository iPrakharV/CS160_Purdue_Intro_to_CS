package lab06_PrakharVerma;

/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 6
*
*/

import java.io.*;
import java.util.*;

public class LoopsFilesPennies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int days;
		long pennies = 1; // Declares an integral type variable pennies
		double wages; //Declares a double type variable wages
		String comment = "";

		Scanner sc = new Scanner(System.in);
		//Creates the Scanner object to read from the console.

		System.out.println("Please enter the number of days worked between 21-30: ");
		days = sc.nextInt(); //Input is saved in a variable named days
		sc.nextLine();

		//Solicits to enter an integer number between 21 and 30 as the days worked.
		while (days < 21 || days > 30) {
			System.out.print("Invalid input.\nPlease re-enter number of days worked (21-30): ");
			days = sc.nextInt();
		} // end of while (days < 21 || days > 30)

		System.out.println("\n\nPay Rate for Option II vs Option I:");
		System.out.println("Days Worked\t\t Option II (Cents)\tOption I ($)\n");

		//Runs a for loop that iterates days many times
		for (int i = 1; i <= days; i++) {
			if (i < 18) {
				System.out.printf("Day %d:\t\t\t %,d\t\t\t%,.02f\n", i, pennies, i * 1000.0);// the comma separator
				pennies *= 2;
			} else {
				System.out.printf("Day %d:\t\t\t %,d\t\t%,.02f\n", i, pennies, i * 1000.0); //the comma separator
				pennies *= 2;

			}

		}
		wages = pennies * 0.01; // dollar value that corresponds to pennies

		System.out.printf("\nFor %d days worked, the CS major earned $%,f and the XX major earned $%,.2f\n", days,
				wages, days * 1000.0);

		/**
		 * Problem 3: Input validation works correctly. Penny iteration works with all
		 * the values between 21-30.
		 */

        // Compare the earnings of the CS major with the XX major and provide a comment.
		if (wages < (days * 1000.0)) {
			comment = String.format(
					"\nIf the CS Major works for %d days, their choice isn't justifiable because they earned $%,f,\n which is less than $%,.2f, the amount earned by the XX Major.\n\n",
					days, wages, days * 1000.0);

		} // end of if (wages> (days* 1000.0))

		else {
			comment = String.format(
					"\nIf the CS Major works for %d days, their choice is justifiable because they earned $%,f,\nwhich is more than $%,.2f, the amount earned by the XX Major.\n\n",
					days, wages, days * 1000.0);

		}

		PrintWriter fileOut = new PrintWriter(new FileWriter("wages.txt", true));
		// fileOut.println("My Comments on the Exponential Penny Pay Project:");

		fileOut.println("\n\nPay Rate for Option II vs Option I:");
		fileOut.println("Days Worked\t\t Option II (Cents)\tOption I ($)\n");

		for (int i = 1; i <= days; i++) {
			if (i < 10) {
				fileOut.printf("Day %d:\t\t\t %,d\t\t\t%,.02f\n", i, pennies, i * 1000.0);
				pennies *= 2;
			} else {
				fileOut.printf("Day %d:\t\t\t %,d\t\t%,.02f\n", i, pennies, i * 1000.0);
				pennies *= 2;

			}

		} // end of for (int i = 1; i <= days; i++)
		fileOut.printf("\nFor %d days worked, the CS major earned $%,f and the XX major earned $%,.2f\n", days, wages,
				days * 1000.0);

		fileOut.println(comment);

		fileOut.close(); // closing the printwriter object.

	} // end of main

} // end of class
