/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 10
*/
package lab10_PrakharVerma;

public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declares an int variable named size assigned 12
		int size = 12;

		// declares and instantiates a String array of length size
		String[] friendNames = { "Prakhar", "Akif", "Devansh", "Vaibhav", "Nalin", "Manya", "Navya", "Aryan", "Yash",
				"Eshna", "Tisca", "Mohit" };

		// instantiates a boolean array of length size
		boolean[] printMatters = new boolean[size];

		// false and true are randomly selected with equal chance
		for (int i = 0; i < size; i++) {
			printMatters[i] = Math.random() < 0.5;
		}

		// declares and instantiates a Letter array letters of length size
		Letter[] letters = new Letter[size];

		// runs a for loop to load the letters array
		for (int i = 0; i < size; i++) {
			letters[i] = new Letter(friendNames[i], printMatters[i]);
		}
		/**
		 * at each turn of the loop applies the initializer constructor for the
		 * individual Letter objects and for the parameter it takes the entries of the
		 * String and boolean arrays you instantiated above
		 */

		// The POBox object rand takes an array of Letter objects (letters) and a random
		// integer (rand) as parameters.
		int rand = (int) (Math.random() * 90000) + 10000;
		// instantiates a POBox object named box
		POBox box = new POBox(letters, rand);

		// creates a deep copy of the box using the copy constructor of the POBox class;
		// the copy is saved in a reference boxClone (local variable)
		POBox boxClone = new POBox(box);

		System.out.println("Check if the copy is deep!\n");
		System.out.println("Apply operator == to the 0 index entries");
		// applies the = = operator on the 0 index entries of the letters field of box
		// and boxClone, respectively, and prints the result to the console
		System.out.println("of the letters array and its clone: " + (box.getLetters()[0] == boxClone.getLetters()[0]));

		// prints to the console the return value of the toString( ) method applied for
		// both box and boxClone
		System.out.println("\nbox:");
		System.out.println(box);
		System.out.println("\nboxClone:");
		System.out.println(boxClone);

		// applies the equals( ) method to compare box and boxClone and prints to the
		// console the return value
		System.out.println("box and its copy tested for equality is: " + box.equals(boxClone));
	}// end of public static void main(String[] args)

}// end of public class Applications
