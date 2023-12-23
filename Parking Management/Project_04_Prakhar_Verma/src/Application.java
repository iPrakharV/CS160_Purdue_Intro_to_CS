
/*
 * Prakhar Verma
 * CS16000-01 – 03, Fall Semester 2023
 * Project 4: Parking Management 
 * This program simulates the operations of a parking garage using multiple classes.
*/
public class Application {

	public static void main(String[] args) {
		int c = 15;
		// stores garage capacity and the limit of iterations

		int l = 15;
		// NOTE: for testing purposes both variables are assigned 15

		Garage ob = new Garage(c);
		// declares and instantiates a Garage object with the given capacity

		int cnt = 0;
		// sets up a counter variable

		for (int x = 0; x < c; x++)
		/**
		 * runs a for loop to visit all the parking bays; at each bay, a new Car object
		 * is added to the bay with probability 0.5 and the counter is updated for every
		 * added car
		 */
		{
			if (Math.random() < 0.5) {
				Car car = new Car();
				ob.park(car);
				cnt++;
			}
		}

		Manager manager = new Manager(ob, cnt);
		// instantiates a Manager object with parameters garage and counter,

		manager.processParking(l);
		// object calls processParking( ) with parameter limit
	}// end of public static void main(String[] args)
}// end of public class Application
