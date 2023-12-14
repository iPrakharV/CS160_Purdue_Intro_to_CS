/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 9
*/

package vermp02_lab9;

public class Rectangle {

	// Problem 1 a:
	// Two private data fields of type double, named length and width.
	private double length;
	private double width;

	// Problem 1 b:
	// Getter and Setter for length
	double getLength() {
		return length;
	}

	void setLength(double len) { // Mutator Method (Setter)
		if (len >= 0) {
			length = len;
			//// the mutator method takes a parameter and sets the field by passing the
			// parameter, but only if the parameter is not negative.
		} else {
			length = 0;
			// For negative parameter, the field is assigned zero
		}
	}

	// Getter and Setter for width
	double getWidth() {
		return width;
	}

	void setWidth(double w) { // Mutator Method (Setter)
		if (w >= 0) {
			width = w;
			// the mutator method takes a parameter and sets the field by passing the
			// parameter, but only if the parameter is not negative.
		} else {
			width = 0;
			// For negative parameter, the field is assigned zero
		}
	}


	// Problem 1 c:
	double computeArea() {
		// computes and returns the area of the rectangle.
		return length * width;
	}

	/// Problem 1 d:
	double computePerimeter() {
		// computes and returns the perimeter of the rectangle
		return 2 * (length + width);
	}

	// Problem 1 e:
	public String toString() {
		return "The length is: " + length + "\nThe width is: " + width + "\n"; // returns a string message.
	}

	// Problem 1 f:
	void displayRectangle() {
		System.out.println(toString());
		// The method calls the toString( ) method and prints the returned value to the
		// console.
	}

	// Problem 1 g:
	boolean equals(Rectangle other) {
		/**
		 * The method takes a Rectangle type parameter and compares the class fields to
		 * that of the parameter Rectangle. Returns true if the fields are equal and
		 * false otherwise.
		 */
		return length == other.length && width == other.width; // returns a boolean value
	}

	// Problem 1 h:
	// Default constructor
	Rectangle() {
		length = 0.0;
		width = 0.0;
		// Initialized with default values.
	}

	// Initializer constructor
	Rectangle(double len, double w) {
		length = len;
		width = w;
	}
	
	// Problem 1 i:
	Rectangle(Rectangle rectangle) {
		// a constructor for initializing a rectangle which is an instance of the class rectangle.
		this.length = rectangle.length;
		this.width = rectangle.width;
	}
}
