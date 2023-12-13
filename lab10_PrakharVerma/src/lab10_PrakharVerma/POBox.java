
/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 10
*/
package lab10_PrakharVerma;

public class POBox {

	// Declare the fields
	int boxNumber;
	Letter[] letters;

	// accessor for the boxNumber fields
	public int getBoxNumber() {
		return boxNumber;
	}//end of public int getBoxNumber()

	// accessor for the letters field; it must return a copy of the array
	public Letter[] getLetters() {
		return letters.clone();
	}//end of public Letter[] getLetters()

	// creates and returns a String message containing the field values; the method
	// must run a loop to include the array entries and must use the toString method
	// of the Letter class for each entry
	public String toString() {
		String str = "boxNumber: " + boxNumber + "\n\n" + "sender\t\tprintedMatter\n";
		for (int i = 0; i < letters.length; i++) {
		    str +=  letters[i].toString() + "\n";
		}

		return str;
	}//end of public String toString()

	// Compares two POBox objects for equality
	public boolean equals(POBox other) {
		if (this.boxNumber != other.boxNumber) {
			return false;
		}
		if (this.letters.length != other.letters.length) {
			return false;
		}
		for (int i = 0; i < letters.length; i++) {
			if (!this.letters[i].equals(other.letters[i])) {
				return false;
			}
		}
		return true;
	}//end of public boolean equals(POBox other)

	// default constructor
	public POBox() {
		this.boxNumber = 0;
		this.letters = new Letter[0];
	}// end of public POBox() 

	// initializer constructor
	public POBox(Letter[] lt, int bn) {
		this.boxNumber = bn;
		this.letters = lt;
	}//end of public POBox(Letter[] lt, int bn) 

	// copy constructor
	public POBox(POBox box) {
		this.boxNumber = box.getBoxNumber();
		this.letters = box.getLetters().clone();
	}// end of public POBox(POBox box)
}// end of public class POBox
