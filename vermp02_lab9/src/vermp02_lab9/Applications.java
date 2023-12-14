/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 9
*/

package vermp02_lab9;
//Problem 7
public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayPractice ob = new ArrayPractice();
		// Declare and instantiate an ArrayPractice object

		System.out.println("Printing ArrayPractice object with the no-arg " + "constructor:\n");
		// Call display methods
		ob.displayNumbers();
		ob.displayBoxes();
		ob.displayList();

		/**
		 * When the Printing of ArrayPractice object with the no-arg constructor is
		 * done, all the output displayed in the console have a null value.
		 */

		// Create string array of names
		String[] list = { "Prakhar", "Akif", "Devansh", "Vaibhav", "Nalin" };

		// Declare and instantiate ArrayPractice with parameterized constructor
		ArrayPractice ob2 = new ArrayPractice(50, 6, list);

		System.out.println("Printing ArrayPractice object with the parameterized " + "constructor:\n");
		// Call display methods
		ob2.displayNumbers();
		ob2.displayBoxes();
		ob2.displayList();

		/**
		 * When the Printing of ArrayPractice object with the parameterised constructor
		 * is done, all the output displayed in the console have a value. This value is
		 * either randomly generated or previously assigned, depending on the menthod in
		 * question
		 * 
		 */
	}

}
