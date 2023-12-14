/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 9
*/

package vermp02_lab9;

import java.util.Random; // Random class for loadNumbers method

public class ArrayPractice {

	// three private data fields
	private int[] numbers;
	private Rectangle[] boxes;
	private String[] listOfNames;

	private final int baseLength = 10;
	// an additional constant field baseLength is assigned 10
// Problem 2
	public ArrayPractice() {
		// a constructor for this class such that it takes no parameters, and the
		// constructor instantiates all array fields to length baseLength.

		numbers = new int[baseLength];
		boxes = new Rectangle[baseLength];
		listOfNames = new String[baseLength];
	}// end of public ArrayPractice()

	// Problem 3
	public ArrayPractice(int numLength, int boxLength, String[] names) { // another constructor that takes three
																			// parameters
		numbers = new int[numLength];
		boxes = new Rectangle[boxLength];
		listOfNames = names;
		loadNumbers();
		loadBoxes();
	}// end of public ArrayPractice(int numLength, int boxLength, String[] names)

	// Problem 4
	public void loadNumbers() {
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++)
		// randomly selected integer numbers from the range -100 to 100
		{
			numbers[i] = rand.nextInt(201) - 100;
		}
	}// end of public void loadNumbers()

	
	// Problem 5
	public void loadBoxes() {
		Random rand = new Random();
		for (int i = 0; i < boxes.length; i++) {
			double len = rand.nextDouble();
			double wid = rand.nextDouble();
			boxes[i] = new Rectangle(len, wid);
		}
	}// end of public void loadBoxes()

	
	// Problem 6
	public void displayNumbers() {
		System.out.println("Displaying numbers:");

		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println();

	}// end of public void displayNumbers()

	public void displayBoxes() {
		System.out.println("Displaying Boxes:");

		for (Rectangle box : boxes) {
			System.out.println(box);
		}
		System.out.println();
	}// end of public void displayBoxes()

	public void displayList() {
		System.out.println("Displaying List:");

		for (String name : listOfNames)

		{
			System.out.println(name);
		}
		System.out.println();

	}// end of public void displayList()

}// end of public class ArrayPractice
