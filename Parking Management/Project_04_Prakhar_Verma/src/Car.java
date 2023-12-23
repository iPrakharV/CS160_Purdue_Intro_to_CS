
/*
 * Prakhar Verma
 * CS16000-01 – 03, Fall Semester 2023
 * Project 4: Parking Management 
 * This program simulates the operations of a parking garage using multiple classes.
*/

 class Car {

	private long timeIn;
	// the field stores the arrival time;
	// the value assigned in the constructor

	// accessor associated with the field
	 long getTime() {
		return timeIn;
	}

	// no-arg constructor; calls currentTimeMillis( ) to initialize the field timeIn
	 Car() {
		timeIn = System.currentTimeMillis();
	}// end of public Car()
}//end of public class Car