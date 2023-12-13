
/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 10
*/
package lab10_PrakharVerma;

public class Letter {

	// Declare the fields
	String sender;
	boolean printedMatter;

	// initializer constructor
	public Letter(String send, boolean print) {
		this.sender = send;
		this.printedMatter = print;
	}// end of public Letter(String send, boolean print)

	// copy constructor; the fields of Letter object other copied to this fields
	public Letter(Letter other) {
		this.sender = other.sender;
		this.printedMatter = other.printedMatter;
	}// end of public Letter(Letter other)

	// creates and returns a String message containing the field values; it does not
	// print
	public String toString() {
		return this.sender + "\t\t" + this.printedMatter;
	}// end of public String toString()

	// compares two Letter objects for equality that is, it checks if the fields of
	// other are equal to this fields
	public boolean equals(Letter other) {
		if (this.sender.equals(other.sender) && this.printedMatter == other.printedMatter) {
			return true;
		} else {
			return false;
		}
	}// end of public boolean equals(Letter other)

}// end of public class Letter
