
/*
 * Prakhar Verma
 * CS16000-01 – 03, Fall Semester 2023
 * Project 4: Parking Management 
 * This program simulates the operations of a parking garage using multiple classes.
*/
public class Garage {

	private Car[] cars; // an array to store Car objects;
	// the array is instantiated in the constructor

	// accessor to the field
	public Car[] getCars() {
		return cars;
	}// end of public Car[] getCars()

	/**
	 * first the method prints all the indices of the cars array to the console in a
	 * single line; second, in the next line and below each index prints a letter E
	 * (empty) for a null, and a letter C (car) for a non-null array entry
	 */
	 void displayState() {
		for (int num = 0; num < cars.length; num++) {
			System.out.print(num + "\t");
		}
		System.out.println();

		for (int let = 0; let < cars.length; let++) {
			System.out.print(isEmpty(let) ? "E\t" : "C\t");
		}
		System.out.println();
	}// end of public void displayState()

	/**
	 * calls isEmpty( ) for each bay and counts the number of non-empty bays; if the
	 * garage is full (the counting is car.length), returns -1; the first time an
	 * empty bay is found at an index, adds (assigns) the parameter auto to the
	 * array at index; returns the index
	 * 
	 * @param car
	 * @return
	 */
	 int park(Car car) {
		for (int b = 0; b < cars.length; b++) {
			if (isEmpty(b)) {
				cars[b] = car;
				return b;
			}
		}
		return -1;
	}

	// returns the boolean value cars[k] = = null
	 boolean isEmpty(int k) {
		return cars[k] == null;
	}// end of public boolean isEmpty(int k)

	/**
	 * Finds and returns the index of the bay, where a car with a randomly selected
	 * serial number is parked
	 * 
	 */
	 int findBayOfCar(int carNumber) {
		int index = -1;
		for (int cnt = 0; cnt < carNumber; cnt++) {
			index++;

			while (isEmpty(index)) {
				index++;
			}
		}
		return index;
	}// end of public int findBayOfCar(int carNumber)

	// non-default constructor instantiates the
	// cars array to length capacity
	 Garage(int capacity) {
		cars = new Car[capacity];
	}// end of public Garage(int capacity)

	/**
	 * computes the elapsed parking time of the element cars[index]; assigns null to
	 * the bay of index; returns the elapsed time
	 * 
	 */
	public double remove(int index) {
		if (index >= 0 && index < cars.length && cars[index] != null) {
			double elapsedTime = (System.currentTimeMillis() - cars[index].getTime());
			cars[index] = null;
			return elapsedTime;
		} else {
			return 0;
		}
	}// end of public double remove(int index)

	// mutator method; adds auto to the array at the index

	public void setCars(Car car, int index) {
		cars[index] = car;
	}// end of public void setCars(Car car, int index)

}// end of public class Garage
