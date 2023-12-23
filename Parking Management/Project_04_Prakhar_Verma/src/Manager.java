
/*
 * Prakhar Verma
 * CS16000-01 – 03, Fall Semester 2023
 * Project 4: Parking Management 
 * This program simulates the operations of a parking garage using multiple classes.
*/

import javax.swing.JOptionPane; // Imported Joptionpane package
import java.util.Random; // Imported random package

public class Manager {

	private Garage garage;
	// a Garage type reference variable

	private final double FEE_PER_HOUR = 1.50;
	// named constant for hourly parking rate; assign 1.50

	private double feeTotal;
	// stores the running total of collected fees

	private int manyCars;
	// stores the number of cars currently parked in the garage

	 void processParking(int limit) {
		// displays the welcoming message
		JOptionPane.showMessageDialog(null,
				"Welcome to the garage parking simulation!!\nSee the initial state of the garage on the console",
				"Parking Management", JOptionPane.INFORMATION_MESSAGE);

		// calls displayState( )
		garage.displayState();

		for (int i = 0; i < limit; i++)
		/**
		 * runs a for loop to limit, at each iteration either the parkACar( ) or the
		 * chooseACarToLeave( ) method is called, each selected with probability 0.5
		 */
		{
			if (Math.random() < 0.5) {
				parkACar();
			} else {
				chooseACarToLeave();
			}
		}

		System.out.println("\nThe total parking fee collected is $" + String.format("%.2f", feeTotal));
		System.out.println("After 15 parking operations, the process is terminated.");
	}// end of public void processParking(int limit)

	 void chooseACarToLeave() {
		if (manyCars == 0)
		/**
		 * if the garage is empty (manyCars == 0), Figures 6 and 8 are displayed and the
		 * program terminates
		 */
		{
			JOptionPane.showMessageDialog(null, "The garage is empty.\nThe parking process terminates");
			System.out.println("After 15 parking operations, the process is terminated");
			System.exit(0);
		} else
		/**
		 * else a parked car to leave is selected randomly; for instance, if manyCars is
		 * 7, use rd.nextInt to choose one of the numbers 1,2,3,4,5,6,7
		 */
		{
			Random rd = new Random();
			int randomIndex = rd.nextInt(manyCars);

			/**
			 * call findBayOfCar(4 ) returns the index, where the fourth car is stored in
			 * the array
			 */
			int index = garage.findBayOfCar(randomIndex);

			// remove(index) is called the method that receives the elapsed time
			double elapsedTime = garage.remove(index);
			double fee = elapsedTime / 1000.00 * FEE_PER_HOUR;
			feeTotal += fee;
			JOptionPane.showMessageDialog(null,
					"The car from Bay#" + index + " is leaving the garage.\nParking fee paid: $" + String.format("%.2f", fee));
			// the method computes the fee, updates feeTotal,
			garage.displayState();
			// displays the message

			manyCars--;
			// manyCars is updated
		}
	}// end of public void chooseACarToLeave()

	 void parkACar() {
		int index = garage.park(new Car());
		// calls the park method of the Garage class
		// the parameter is new Car( )
		// stores the return value in the local variable index

		if (index != -1)
		/**
		 * if the index is not -1, Figure 4 is displayed, manyCars is updated and the
		 * displayState( ) of Garage is called;
		 */
		{
			JOptionPane.showMessageDialog(null,
					"A car is arriving at Bay#" + index + "\nGarage displayed on console.");
			manyCars++;
			garage.displayState();

		}
		if (index == -1)
		/**
		 * if index = -1, Figure 5 and Figure 7 are displayed, and the program
		 * terminates
		 */
		{
			JOptionPane.showMessageDialog(null, "The garage is full.\nThe parking process terminates.");
			System.out.println("The garage is full.\nThe parking process terminates.");

			System.out.println("The total parking fee collected is: $" + String.format("%.2f", feeTotal));
			System.exit(0);
		}
	}// end of public void parkACar()

	public Manager(Garage garr, int many)
	// The constructor initializes the garage
	{
		garage = garr;
		manyCars = many;
	}// end of public Manager(Garage gar, int many)
}//end of public class Manager