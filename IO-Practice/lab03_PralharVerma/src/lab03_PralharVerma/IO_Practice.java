
package lab03_PralharVerma;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Prakhar Verma
 * CS 16000-01 - 03 Fall Semester 2023
 * Lab 3
 * 
 */
public class IO_Practice {

	/*
	 * Main method starts here.
	 */
	public static void main(String[] args) {

		// Problem 2
		// Declare variables.
		int numberOfBooks;
		int titleLength;
		double unitPrice;
		double totalCost;
		String authorName;
		String bookTitle;
		String publisher;
		String edition;
		int yearPublished;
		String firstName;
		String middleName;
		String lastName;
		char middleInitial;
		String cFirstName, cMiddleName, cLastName;
		String streetAddress, cityName, stateName, zipCode;
		int thisYear;

		// Problem 3
		// Declare the Scanner class
		Scanner keyboardInput = new Scanner(System.in);

		// Problem 4
		// Input the number of books from the user.
		System.out.println("Number of books ordered? ");
		numberOfBooks = keyboardInput.nextInt();

		// Problem 5
		// Input & store unit price from user.
		System.out.println("Unit price of the book? ");
		unitPrice = keyboardInput.nextDouble();

		// Problem 6
		// Assigning totalCost
		totalCost = unitPrice * numberOfBooks;
		System.out.printf("The total cost of %d books of unit price " + "$%.2f is $ %,.2f\n", numberOfBooks, unitPrice,
				totalCost);

		// Problem 7
		// Solicit the customer’s name on the console.
		System.out.println("Enter the customer's first name, middle name and last name: ");
		cFirstName = keyboardInput.next();
		cMiddleName = keyboardInput.next();
		cLastName = keyboardInput.next().toUpperCase();
		
		keyboardInput.nextLine(); // consume remaining line
		
		// Getting the address from user.
	    System.out.print("Enter the customer's street address: ");
	    streetAddress = keyboardInput.nextLine();
	    System.out.print("Enter the name of the city: ");
	    cityName = keyboardInput.nextLine();
	    System.out.print("Enter the name of the state: ");
	    stateName = keyboardInput.nextLine();
	    System.out.print("Enter the zip code: ");
	    zipCode = keyboardInput.nextLine();
	    
	    // Problem 8 & 9
	    // Solicit the name of the customer's favorite author on the console.
	    // About the author, title, publisher, edition, and year of your favorite book.
	    System.out.print("Enter the customer's favorite author's first name, middle name and last name: ");
	    firstName = keyboardInput.next();
	    middleName = keyboardInput.next();
	    lastName = keyboardInput.next();

	    // Problem 10
	    // Extract the middle initial as a character from the middle name and store it in the middleInitial.
	    middleInitial = middleName.charAt(0);
	    
	    // Problem 11
	    // Re-assign all characters of the lastName to be all uppercase versions.
	    lastName = lastName.toUpperCase();
	    keyboardInput.nextLine(); // consume the remaining line.
	    
	    // Problem 12
	    // Re-build author name 
	    authorName = lastName + ", " + firstName + " " + middleInitial + ".";
	    
	    // Problem 13- Getting book title
	    // Problem 14- Using the nextLine( ) method read the title and store it in a variable bookTitle
	    System.out.print("Title of the customer's favorite book: ");
	    
	    // Problem 15
	    // Re-assign bookTitle its own all uppercase version.
	    bookTitle = keyboardInput.nextLine().toUpperCase();
	    // Find the length of the book title and store it in the variable titleLength.
	    titleLength = bookTitle.length();
	    
	    // Problem 16
	    // Get publisher and publication details
	    System.out.print("Enter the name of the publisher for the book: ");
	    publisher = keyboardInput.nextLine();
	    System.out.print("Enter the edition for the book: ");
	    edition = keyboardInput.nextLine();
	    System.out.print("Enter the year for publishing the book: ");
	    yearPublished = keyboardInput.nextInt();
	    System.out.print("What is this year? Such as 2023: ");
	    thisYear = keyboardInput.nextInt();

	    // Problem 17
	    // Printing information about book
	    System.out.println("\nInformation about the customer's Favorite Book:"); // authorName = lastName + ", " + firstName + " " + middleInitial; 
	    System.out.printf("The customer's favorite author is:\n\t%s\n",authorName);
	    System.out.printf("The customer's favorite book from %s is \n\t%s,\n",firstName, bookTitle);
	    System.out.printf("\t%s, %s Edition, %d.\n", publisher, edition,yearPublished);
	    System.out.printf("The length of the title is: %s.\n", titleLength);
	    
	    // How old is the book?
	    if((thisYear - yearPublished) > 1) {
	        System.out.println("It is a " + (thisYear - yearPublished) + " years old book."); 
	      } else {
	        System.out.println("It is a year old book.");
	      }
	    
	    // Problem 18
	    // Printing order summary
	    if(numberOfBooks > 1) {
	    	System.out.printf("The total cost of %d books of unit price $%,.2f is $%,.2f\nfrom the %s.\n",numberOfBooks, unitPrice, totalCost, publisher);
	      }
	    else {
	    	  System.out.printf("The total cost of %d book of unit price $%,.2f is $%,.2f\nfrom the %s.\n", numberOfBooks, unitPrice, totalCost, publisher);
	      }

	    // Problem 19
	    // Asking user if they want to re-enter.
	    numberOfBooks = 0;
	    int order = JOptionPane.showConfirmDialog(null, "Do you want to reorder the book? \n Yes or No? ", "Question?", JOptionPane.YES_NO_OPTION);
	    
	    // if(order==0)
	    if(order == JOptionPane.YES_OPTION) {
	    
	      // Get re-order details  
	      String input = JOptionPane.showInputDialog("Enter number of books re-ordered:");
	      numberOfBooks = Integer.parseInt(input);

	      input = JOptionPane.showInputDialog("Enter unit price of book:");
	      unitPrice = Double.parseDouble(input);

	      totalCost = numberOfBooks * unitPrice;
	    }
	    else {
	    	System.out.println("There is no reorder of book.");
	    }
	    
	    if (!(order == JOptionPane.NO_OPTION)) {
	    	System.out.println("\nInformation about Customer:"); 
	    	System.out.println("Name:\t" + cFirstName + " " + cMiddleName +""+ cLastName); 
	    	System.out.printf("Street Address:\t%s\nCity:\t%s\nState:\t%s\nZipCode: %s\n", streetAddress, cityName, stateName, zipCode);
	    

	     if (numberOfBooks > 1) {
	    	 System.out.printf("\nThe total cost for reordering %d books of unit price " + "$%,.2f is $ %,.2f \nfrom the %s.\n", numberOfBooks, unitPrice, totalCost, publisher);
	     }
	     else if (numberOfBooks == 1) {
	    	 System.out.printf("\n The total cost for reordering %d book of unit price " + "$%,.2f is $ %,.2f\nfrom the %s.\n", numberOfBooks, unitPrice, totalCost, publisher);
	     }
	     else {
	    	 System.out.print("\nThere is no reorder of book.");
	    	 }
	    }
	    
	    System.out.println("\nThe end of the invoice.");
	    
	    
	    System.exit(0); // JOptionPane operation ends here
	}// end of main

} // end of class
