/*
* Prakhar Verma
* CS 16000-01 – 03, Fall Semester 2023
* Lab 5
*
*/

package lab05_PrakharVerma;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Order3Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int yesNo;
		int countChar = 0; // Problem 5- Check 3 names
		int numberWords = 0; // Problem 5- Check 3 names

		String names = null;
		String name1, name2, name3; // Problem 6
		String namesOrdered; // Problem 10 & Problem 11- Saves names in order as a String

		final String title = "3 Strings Comparision";
		String title1, task;

		final String terminateTask = "\nThe program terminates!\n" + "End of this program.";
		final String cancelTask = "You pressed cancel button!";
		final String InvalidInputTask = "This program terminates" + "for invalid input.";

		task = "Do you want to compare strings?";
		yesNo = JOptionPane.showConfirmDialog(null, task, title, JOptionPane.YES_NO_OPTION);

		while (yesNo == JOptionPane.YES_OPTION) {
			names = JOptionPane.showInputDialog(null, "Enter 3 names with blank(s) in between:",
					"Welcome to the name ordering program", JOptionPane.QUESTION_MESSAGE);

			if (names == null) {
				JOptionPane.showMessageDialog(null, cancelTask, title, JOptionPane.INFORMATION_MESSAGE);
				System.out.println(cancelTask);
				JOptionPane.showMessageDialog(null, terminateTask, title, JOptionPane.INFORMATION_MESSAGE);
				System.out.println(terminateTask);
				System.exit(0);
			}

			else if (names.equals("")) {
				JOptionPane.showMessageDialog(null, "You pressed OK without three names!", title,
						JOptionPane.INFORMATION_MESSAGE);
				System.out.println("You pressed OK without three names!");
				JOptionPane.showMessageDialog(null, terminateTask, title, JOptionPane.INFORMATION_MESSAGE);
				System.out.println(terminateTask);
				System.exit(0);
			}

			else {
				countChar = 0;
				numberWords = 0;

				for (; countChar < names.length() && names.charAt(countChar) == ' '; countChar++) {
				}

				while (countChar < names.length()) {
					for (; countChar < names.length() && names.charAt(countChar) != ' '; countChar++) {
					}

					numberWords++;
					for (; countChar < names.length() && names.charAt(countChar) == ' '; countChar++) {
					} // end of for loop
				} // end of while (countChar< names.length())

				if (numberWords == 0) {
					if (names.length() == 1) {
						System.out.println("The names is a blank-space.");
					} else {
						System.out.println("The names is a string of blank-space.");
					}

					System.out.println(InvalidInputTask);
					JOptionPane.showMessageDialog(null, InvalidInputTask, title, JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				} // end of if (numberWords==0)

				else if (names.equals("null") || (numberWords < 3)) {
					System.out.println(InvalidInputTask);
					JOptionPane.showMessageDialog(null, InvalidInputTask, title, JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				} // end of else if (names.equals("null") || (numberWords <3))

				Scanner sc = new Scanner(names);

				name1 = sc.next();
				name2 = sc.next();
				name3 = sc.next();

				if (name1.equals("null") || name2.equals("null") || name3.equals("null")) {
					System.out.println("\n3." + InvalidInputTask);
					System.out.println("The word \"null\" should not be a name.");
					JOptionPane.showMessageDialog(null, InvalidInputTask, title, JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
				task = String.format("X1: The input three name strings are " + "%s, %s, and %s. \n", name1, name2,
						name3);

				displayInConsole(task, title, name1, name2, name3);

				name1 = name1.toLowerCase();
				char firstChar = Character.toUpperCase(name1.charAt(0));
				String substr = name1.substring(1);
				name1 = firstChar + substr;

				name2 = name2.toLowerCase();
				firstChar = Character.toUpperCase(name2.charAt(0));
				substr = name2.substring(1);
				name2 = firstChar + substr;

				name3 = name3.toLowerCase();
				firstChar = Character.toUpperCase(name3.charAt(0));
				substr = name3.substring(1);
				name3 = firstChar + substr;

				task = String.format("X2: The input three words " + "(all begins with an upper-case alphabet) "
						+ "are %s, %s, %s. \n", name1, name2, name3);
				title1 = "Proper specification for names";
				displayInConsole(task, title1, name1, name2, name3);

				namesOrdered = sortWords(name1, name2, name3);

				task = String.format("Х3: The names in lexicographic order " + "are \n%s. \n", namesOrdered);
				title1 = "The names in order";
				System.out.print(task);
				JOptionPane.showMessageDialog(null, task, title1, JOptionPane.INFORMATION_MESSAGE);

			}
			task = "DO you want to continue to compare strings?";
			yesNo = JOptionPane.showConfirmDialog(null, task, title, JOptionPane.YES_NO_CANCEL_OPTION);

		}
		if (yesNo == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, terminateTask, title, JOptionPane.INFORMATION_MESSAGE);
			System.out.println(terminateTask);
		}

		System.exit(0); // To end JOptionPane
	} // end of main method

	public static String sortWords(String w1, String w2, String w3) {
	    String wio1, wio2, wio3;
	    int w1_w2, w2_w3, w1_w3;

	    wio1 = w3;
	    wio2 = w3;
	    wio3 = w3;

	    w1_w2 = w1.compareToIgnoreCase(w2);
	    w1_w3 = w1.compareToIgnoreCase(w3);
	    w2_w3 = w2.compareToIgnoreCase(w3);

	    System.out.printf("\n%d %d %d\n", w1_w2, w1_w3, w2_w3);

	    if (w1_w2 == 0) { // w1=w2
	        if (w1_w3 == 0) {
	            wio1 = w1;
	            wio2 = w2;
	            wio3 = w3;
	        } else {
	            if (w1_w3 < 0) { // w1 < w3 ; case 2
	                wio1 = w1;
	                wio2 = w2;
	                wio3 = w3;
	            } else {
	                // w1 > w3; case 3
	                wio1 = w3;
	                wio2 = w1;
	                wio3 = w2;
	            }
	        }
	    } 
	    else {
	        if (w1_w2 < 0) {
	            // w1< w2
	            if (w2_w3 == 0) {
	                wio1 = w1;
	                wio2 = w2;
	                wio3 = w3;
	            } 
	            else { // w2 != w3
	                if (w2_w3 < 0) {
	                    wio1 = w1;
	                    wio2 = w2;
	                    wio3 = w3;
	                } 
	                else {
	                    // w2 > w3
	                    if (w1_w3 == 0) {
	                        // w1 = w3
	                        wio1 = w1;
	                        wio2 = w3;
	                        wio3 = w2;
	                    } 
	                    else {
	                        // w1 != w3
	                        if (w1_w3 < 0) {
	                            // w1 < w3; case 9
	                            wio1 = w1;
	                            wio2 = w3;
	                            wio3 = w2;
	                        } 
	                        else {
	                            // w1 > w3; case 10
	                            wio1 = w3;
	                            wio2 = w1;
	                            wio3 = w2;
	                        }
	                    }
	                }
	            }
	        }
	        else {
	            // w2 < w1
	            if (w2_w3 == 0) {
	            // w2 = W3; case 4
	                wio1 = w2;
	                wio2 = w3;
	                wio3 = w1;
	                } 
	            else {
	                // w2 != w3
	                if (w2_w3 < 0) {
	                // w2 < w3;
	                    if (w1_w3 == 0) {
	                        // w1 = w3; case 7
	                        wio1 = w2;
	                        wio2 = w1;
	                        wio3 = w3;
	                    } 
	                    else {
	                        // w1 != w3;
	                            if (w1_w3 < 0) {
	                                // w1 ‹ w3; case 13
	                                wio1 = w2;
	                                wio2 = w1;
	                                wio3 = w3;
	                            } 
	                            else {
	                            // w1 > w3; case 12
	                            wio1 = w2;
	                            wio2 = w3;
	                            wio3 = w1;
	                            }
	                        }
	                    }
	                    else {
	                        // w2 > w3; case 11.
	                        wio1 = w3;
	                        wio2 = w2;
	                        wio3 = w1;
	                    }
	                }
	            }
	        }
	    String orderedNames = wio1 + " " + wio2 + " " + wio3;
	    return orderedNames;
	}
	
	public static void displayInConsole(String str, String title,String namel, String name2, String name3) {
		
		System.out.println("From displayinConsole:");// testing
		System.out.print (str);
		JOptionPane. showMessageDialog (null, str, title,JOptionPane. INFORMATION_MESSAGE);
	}


}
