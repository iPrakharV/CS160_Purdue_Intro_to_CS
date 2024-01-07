/*
* Prakhar Verma
* CS 16000-01 – 03, Fall Semester 2023
* Project 2: Examination Statistics
*
* Description: To read the data of either of the three given files and perform the calculations and store the output in the file ScoreStatistics.txt and the console.
*
*/

import java.util.*;
import java.io.*;

public class ExamStatistics {

	final static int A_LOW = 90;
	final static int B_LOW = 80;
	final static int C_LOW = 65;
	final static int D_LOW = 50;

	public static void main(String[] args) throws IOException {

		// Declare variables
		int total = 0;
		int validInput = 0;

		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0; // to count score for each grade

		int minScore = 101, maxScore = -1; // Inverse value initialized, they would change if the condition is
											// satisfied.
		int nextScore;

		double sum = 0, average, psd;

		String output, inputFileName;

		// Declare and instantiate a Scanner object for console reading
		Scanner sc = new Scanner(System.in);

		// Declare and instantiate a File object to the file name solicited and received
		// from the console.
		System.out.println("Enter the file nameto be read: ");
		inputFileName = sc.nextLine();

		// Check if the file exists and repeat file name solicitation until the name is
		// accepted
		File inputFile = new File(inputFileName);

		while (!inputFile.exists()) { // Used while loop instead of a for loop
			System.out.print(inputFileName + " does not exist. \nPlease enter the correct file name again: ");
			inputFileName = sc.nextLine();
			inputFile = new File(inputFileName);
		} // End of while (!inputFile.exists())

		// Declare and instantiate another Scanner object reader to read data from the
		// file.
		Scanner reader = new Scanner(inputFile);

		while (reader.hasNext()) { // checks if there's any more data in file

			if (reader.hasNextInt()) { // checks if the next available data is an Int.

				nextScore = reader.nextInt(); // Save the currently read input in nextScore
				total++; // Update the total counter

				if (nextScore >= 0 && nextScore <= 100) { // Validate the input;
					validInput++;

					if (nextScore > maxScore) { // Check if nextScore is greater than maxScore, if so update maxScore
												// with nextScore
						maxScore = nextScore;
					}
					if (nextScore < minScore) { // Check if nextScore is lesser than minScore.
						minScore = nextScore;
					}
					sum += nextScore; // Add nextScore to sum

					// Apply a nested if else if structure to determine the grade group relevant for
					// nextScore
					// and update the group counter
					if (nextScore >= A_LOW) {
						aCount++;
					} else if (nextScore >= B_LOW) {
						bCount++;
					} else if (nextScore >= C_LOW) {
						cCount++;
					} else if (nextScore >= D_LOW) {
						dCount++;
					} else {
						fCount++;
					}
				} // end of if(nextScore >= 0 && nextScore <= 100)
			} // end of if(reader.hasNextInt())
			else {
				reader.next(); // wrong input is not processed, the loop turns to the next iteration.
			}

		} // end of while(reader.hasNext())

		reader.close(); // closing the File object.

		average = sum / validInput; // Calculating the Average.

		// To compute the value of psd, the file inputFileName must be read once more by
		// a new Scanner

		double psdSum = 0;
		Scanner reader2 = new Scanner(inputFile); // creating a second scanner.
		while (reader2.hasNext()) {
			if (reader2.hasNextInt()) {
				nextScore = reader2.nextInt();
				if (nextScore >= 0 && nextScore <= 100) {
					psdSum += Math.pow(average - nextScore, 2);
				}
			} else {
				reader2.next();
			}
		}
		reader2.close();

		psd = Math.sqrt(psdSum / validInput);

		// the output message containing the obtained results must be built; decimal
		// numbers in the output must be formatted and rounded to two digits after the
		// point
		output = "\nExam Statistics\n\n" + "Total number of (given) Scores: " + total + "\n"
				+ "Total number of valid scores: " + validInput + "\n\n\n"
				+ "Considering only the given valid scores:\n" + "Average score (of valid scores): "
				+ String.format("%.2f", average) + "\n" + "Population standard deviation of the valid scores: "
				+ String.format("%.2f", psd) + "\n\n" + "# of A, 85-100:\t" + aCount + "\t"
				+ String.format("%.2f", (aCount * 100.0 / validInput)) + "%\n" + "# of B, 75--84:\t" + bCount + "\t"
				+ String.format("%.2f", (bCount * 100.0 / validInput)) + "%\n" + "# of C, 65--74:\t" + cCount + "\t"
				+ String.format("%.2f", (cCount * 100.0 / validInput)) + "%\n" + "# of D, 50--64:\t" + dCount + "\t"
				+ String.format("%.2f", (dCount * 100.0 / validInput)) + "%\n" + "# of F, 00--49:\t" + fCount + "\t"
				+ String.format("%.2f", (fCount * 100.0 / validInput)) + "%\n\n" + "Minimum score: " + minScore + "\n"
				+ "Maximum score: " + maxScore + "\n";

		// Print the output to the console and write output to the file as required
		System.out.println(output);

		// Declare and instantiate a PrintWriter object to write the output to a file
		// named ScoreStatistics.txt
		File ExamStatFile = new File("ScoreStatistics.txt");
		PrintWriter fileOut = new PrintWriter(ExamStatFile);
		fileOut.println(output);
		fileOut.close();

	} // End of main method

} // End of class ExamStatistics
