package lab04_PrakharVerma;

/*
* Prakhar Verma
* CS 16000-01 – 03, Fall Semester 2023
* Lab 4
*
*/

import javax.swing.JOptionPane; //needed for JOptionPane class.

public class RomanNumerals {

	public static void main(String[] args) {

		int yesNo; // Set further data entry
		int decimal;

		String roman; 
		// Problem IV- Declare a String variable roman to save the input string returned by the window.
		// Setting title of window
		String title = "Conversion of Roman numerals";
		// Problem III- Declare a String variable title to store the title text such as “Conversion of Roman numerals”.
		//Declare a String variable task to store the input solicitation text, such as “Enter a Roman
		//numeral between “I” and “XX” ”

		String task = "Enter a Roman Numeral between \"I\" and \"XX\"";

		do {
			// Problem II- Input is solicited on a dialog window.

			roman = JOptionPane.showInputDialog(null, task, title, JOptionPane.QUESTION_MESSAGE);

			
			// Problem V- If press the Cancel button in the message box.
			if (roman == null) {
				JOptionPane.showMessageDialog(null, "You pressed cancel button!", title,
						JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "End of Program!", title, JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			// Problem VI- If you pressed OK without entering a Roman numeral in the message box.
			if (roman.equals("")) {
				JOptionPane.showMessageDialog(null, "You pressed OK without Roman numeral!", title,
						JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "End of Program!", title, JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			roman = roman.toUpperCase(); // Converting the user input to upper case.

			decimal = 0; // Problem VII- Default value of decimal is 0

			if (roman.charAt(0) == 'I') {
				if (roman.equals("I")) {
					decimal = 1;
				} else if (roman.equals("II")) {
					decimal = 2;
				} else if (roman.equals("III")) {
					decimal = 3;
				} else if (roman.equals("IV")) {
					decimal = 4;
				} else if (roman.equals("IX")) {
					decimal = 9;
				}
			}

			else if (roman.charAt(0) == 'V') {
				if (roman.equals("V")) {
					decimal = 5;
				} else if (roman.equals("VI")) {
					decimal = 6;
				} else if (roman.equals("VII")) {
					decimal = 7;
				} else if (roman.equals("VIII")) {
					decimal = 8;
				}
			}

			else if (roman.charAt(0) == 'X') {
				if (roman.equals("X")) {
					decimal = 10;
				} else if (roman.equals("XI")) {
					decimal = 11;
				} else if (roman.equals("XII")) {
					decimal = 12;
				} else if (roman.equals("XIII")) {
					decimal = 13;
				} else if (roman.equals("XIV")) {
					decimal = 14;
				} else if (roman.equals("XV")) {
					decimal = 15;
				} else if (roman.equals("XVI")) {
					decimal = 16;
				} else if (roman.equals("XVII")) {
					decimal = 17;
				} else if (roman.equals("XVIII")) {
					decimal = 18;
				} else if (roman.equals("XIX")) {
					decimal = 19;
				} else if (roman.equals("XX")) {
					decimal = 20;
				}
			}

			if (decimal != 0) {
				String outTask = String.format("The decimal value for roman numeral " + "\"%s\" is: \n ......%d......",
						roman, decimal);
				JOptionPane.showMessageDialog(null, outTask, title, JOptionPane.INFORMATION_MESSAGE);
			}

			else if (decimal == 0) {
				JOptionPane.showMessageDialog(null, "input" + roman + "is not an \n admissible Roman numerl", title,
						JOptionPane.INFORMATION_MESSAGE);
			} // Problem XI- If the input string is none of the twenty admissible Roman
				// numerals.

			// Problem XV- Asking if user wants to input more roman numeral.
			yesNo = JOptionPane.showConfirmDialog(null, "Any more roman numerals? \n Yes or No", title,
					JOptionPane.YES_NO_OPTION);

		} while (yesNo == 0);

		// Problem XVI- Finally, before the program ends, a message is displayed through the message box.
		JOptionPane.showMessageDialog(null, "End of Program!", title, JOptionPane.INFORMATION_MESSAGE);
		System.exit(0); // required JOptionPane class.

	} // end of main

} // end of class
