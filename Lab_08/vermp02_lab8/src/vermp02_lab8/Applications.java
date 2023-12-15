package vermp02_lab8;

/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 8
*
*/

import java.util.Scanner; // importing scanner package

public class Applications {

	public static void main(String[] args) {

		// Problem 2 a:
		double length;
		double width;
		// Declare local variables length and width of type double

		// Problem 2 b:
		// Using a Scanner object solicit two numbers from the console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		// save the values in the variables’ length and width
		length = scanner.nextDouble();
		System.out.println("Please enter the width: ");
		width = scanner.nextDouble();

		System.out.println(); // Leaves one blank line

		// Problem 2 c:
		// Declare and instantiate a Rectangle object named box
		// Use the initializer constructor; the parameters are the length and width
		Rectangle box = new Rectangle(length, width);

		// Problem 2 d:
		// Declare and instantiate another Rectangle object named box2
		Rectangle box2 = new Rectangle();
		// Note: Default constructor used.

		// Problem 2 e:
		// Use box2 to call the setLength() and setWidth() methods
		box2.setLength(5.0);
		box2.setWidth(3.0);
		// The numbers are chosen at will here.

		// Problem 2 f:
		// Call the display() method for box and box2
		System.out.println("Details of box are as follows:");
		box.displayRectangle();
		// Box displayed.

		System.out.println("\nDetails of box 2 are as follows:");
		box2.displayRectangle();
		// Box 2 displayed.

		// Problem 2 g:
		// Use box to call the equals() method, use box2 for the parameter
		System.out.println("\nAre box and box 2 equal?\n" + box.equals(box2));
		/**
		 * The output for Problem 2 g is: Are box and box 2 equal? false This is because
		 * they both have different values.
		 */

		// Problem 2 h:
		// Declare and instantiate a third Rectangle object named box3
		Rectangle box3 = new Rectangle();
		// Note: Default constructor used.

		// Problem 2 i:
		// Use box to call the getter methods and assign the local variables width and
		// length.
		length = box.getLength();
		width = box.getWidth();

		// Problem 2 j:
		// Use box3 to call the setters (like above for box2).
		box3.setLength(length);
		box3.setWidth(width);
		// Parameters are the local variables.

		// Problem 2 k:
		// Use box to call the equals method and use box3 for the parameter
		System.out.println("\nAre box and box 3 equal?\n" + box.equals(box3));

		// Problem 2 l:
		// Call the computeArea() and computePerimeter() methods with respect to all
		// your boxes

		// Box
		System.out.println("\nArea of box: " + box.computeArea());
		System.out.println("Perimeter of box: " + box.computePerimeter());

		// Box 2
		System.out.println("\nArea of box2: " + box2.computeArea());
		System.out.println("Perimeter of box2: " + box2.computePerimeter());

		// Box 3
		System.out.println("\nArea of box3: " + box3.computeArea());
		System.out.println("Perimeter of box3: " + box3.computePerimeter());

		/**
		 * Output for Problem 2 l: 
		 * 
		 * Area of box: 35.0 
		 * Perimeter of box: 24.0
		 * 
		 * Area of box2: 15.0 
		 * Perimeter of box2: 16.0
		 * 
		 * Area of box3: 35.0 
		 * Perimeter of box3: 24.0
		 */

		// Problem 2 m:
		// Declare and instantiate a Rectangle object named box4
		Rectangle box4 = new Rectangle(box2);
		//The instance is box2.

		// Use box4 to call the setLength() and setWidth() methods for printing out the length and the width of the box4
		box4.setLength(5.0);
		box4.setWidth(3.0);

		// Call the display() method for box4
		System.out.println("\nDetails of box 4 are as follows:");
		box4.displayRectangle();

		//Are box2 and box4 have the same length and width?
		System.out.println("\nAre box2 and box 4 equal?\n" + box2.equals(box4));
	}
}
/**
 * Problem 2 f:
 * Details of box are as follows: 
 * The length is: 5.0 
 * The width is:  6.0
 *
 * Details of box 2 are as follows: 
 * The length is: 5.0 
 * The width is: 3.0
 * 
 * 
 * Problem 2 k: 
 * Are box and box 3 equal? 
 * true 
 * This is true because the same length and width is used.
 * 
 **/
