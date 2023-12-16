/*
* Prakhar Verma
* CS 16000-01 03, Fall Semester 2023
* Lab 7
*
*/
package colors;

import java.awt.Color;
import javax.swing.*;
import java.util.*;

public class ESPGame {
	private String chosenColor;

	public Color chooseColor(int input) { // return type: Color & takes an int type parameter
		Color color; // declares the local variables color of type Color

		// using switch case to select color
		/**
		 * Colors to be used are Blue, Yellow, Red, Green, Orange, Cyan, darkGray,
		 * lightGray, Gray, Pink, Magenta, White, Black, Brown, Beige
		 */
		switch (input) {
		case 1:
			// Set color to blue when input is 1.
			color = Color.BLUE;
			chosenColor = "blue";
			break;

		case 2:
			// Set color to yellow when input is 2.
			color = Color.YELLOW;
			chosenColor = "yellow";
			break;

		case 3:
			// Set color to red when input is 3.
			color = Color.RED;
			chosenColor = "red";
			break;

		case 4:
			// Set color to green when input is 4.
			color = Color.GREEN;
			chosenColor = "green";
			break;

		case 5:
			// Set color to orange when input is 5.
			color = Color.ORANGE;
			chosenColor = "orange";
			break;

		case 6:
			// Set color to cyan when input is 6.
			color = Color.CYAN;
			chosenColor = "cyan";
			break;

		case 7:
			// Set color to dark gray when input is 7.
			color = Color.darkGray;
			chosenColor = "dark gray";
			break;

		case 8:
			// Set color to gray when input is 8.
			color = Color.GRAY;
			chosenColor = "gray";
			break;

		case 9:
			// Set color to pink when input is 9.
			color = Color.PINK;
			chosenColor = "pink";
			break;

		case 10:
			// Set color to magenta when input is 10.
			color = Color.MAGENTA;
			chosenColor = "magenta";
			break;

		case 11:
			// Set color to white when input is 11.
			color = Color.WHITE;
			chosenColor = "white";
			break;

		case 12:
			// Set color to light gray when input is 12.
			color = Color.lightGray;
			chosenColor = "light gray";
			break;

		/**
		 * Note: We don't need to have the 13th case because it would go to the default
		 * case, and color would be assigned as black.
		 */
		default:
			// The color choice for the default case in the switch is Color.BLACK.
			color = Color.BLACK;
			chosenColor = "black";
			break;

		}// end of switch (input)
		return color;

	}// enf of public Color chooseColor(int input)

	public void showColor(Color color) {

		JFrame frame = new JFrame("Guess this color");

		frame.setSize(450, 450); // enlarged the frame because 200x200 is too small.
		frame.setLocation(350, 350); // same for location.

		JPanel panel = new JPanel(); // Creating object named panel for class JPanel
		panel.setBackground(color); // We will get the colour from the previous method.

		frame.add(panel);
		frame.setVisible(true); // Turning value to "true" to display the colour to user.

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // We need the colour window to disappear.

	}// end of public void showColor(Color color)

	/**
	 * This method, "showColor," creates a JFrame displaying a color received as a
	 * parameter. The color is set as the background of a JPanel, providing a visual
	 * representation, and the frame ensures proper closure.
	 */

	public void guessColor() {

		int GameCount = 0; // Total count of ESP played
		int CorrectGameCount = 0; // No of correct ESP game

		int yesNO = JOptionPane.showConfirmDialog(null, "Enter the ESP Game?", "ESP Game", JOptionPane.YES_NO_OPTION);

		while (yesNO == JOptionPane.YES_OPTION) {
			// GameCount++;
			// Count the number of tries
			Random rand = new Random();
			// Using the random class and making an object for it

			int num = rand.nextInt(13) + 1;
			// randomly selects an integer between 1 and 13

			showColor(chooseColor(num));
			// calls the showColor( ) method with the color value returned by chooseColor(
			// ), as parameter

			String str01 = "Choose the name of the color you see:";
			// This will be the title for JOptionPane dialog box.

			String str02 = "\nbrown\nred\ngreen\nblue\nmagenta\ncyan\nblack"
					+ "\norange\nyellow\nbeige\nlight gray\ngray\ndark gray\npink" + "\nwhite";
			// Using /n to list all colors vertically.

			String[] str03 = { "beige", "black", "blue", "brown", "cyan", "dark gray", "gray", "green", "light gray",
					"magenta", "orange", "pink", "red", "white", "yellow" };
			// Creating a string array with all the colors.

			String user_input = (String) JOptionPane.showInputDialog(null, str02, str01, JOptionPane.QUESTION_MESSAGE,
					null, str03, str03[7]); // green selected.
			// Getting the input from the user.

			if (user_input != null) {
				GameCount++;

				if (user_input.equals(chosenColor)) {
					CorrectGameCount++;
					JOptionPane.showMessageDialog(null, "You guessed correctly!", "Your guess is",
							JOptionPane.INFORMATION_MESSAGE);
				} // end of if (user_input.equals(chosenColor))
				else {
					JOptionPane.showMessageDialog(null, "Sorry, incorrect guess.", "Your guess is",
							JOptionPane.WARNING_MESSAGE);
				}

			} // end of if (user_input != null)
			else {
				break;
			} // end of else

		} // end of while (yesNO == JOptionPane.YES_OPTION)
		String output;
		double CorrectGuessPercent = 100 * (double) CorrectGameCount / (double) GameCount;
		if (GameCount > 0) {
			output = String.format(
					"Out of %d games,you have guessed %d correctly.\n"
							+ "The percentage for your correct guesses is %.2f",
					GameCount, CorrectGameCount, CorrectGuessPercent);
			System.out.println(output);
			JOptionPane.showMessageDialog(null, output, "Your ESP Test Result", JOptionPane.INFORMATION_MESSAGE);

		} // end of if (GameCount>0)

		else {
			output = "No game was played.";
			JOptionPane.showMessageDialog(null, output, "Your ESP Test Result", JOptionPane.INFORMATION_MESSAGE);
			System.out.println(output);
		}
		System.exit(0);
	}// end of public void guessColor()

	/**
	 * The "guessColor" method initiates an ESP color guessing game. It prompts
	 * users to identify a randomly displayed color, tracks their correct guesses,
	 * and provides a final percentage accuracy summary. The game loop continues
	 * until the user opts out.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // end of public static void main(String[] args)

}
