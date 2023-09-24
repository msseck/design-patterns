package factory;

/**
 * Represents a type of bike designed for kids; extends the Bike class and
 *  provides specific attributes and values for kids' bikes.
 * @author Marietou Seck
 */
public class KidsBike extends Bike {
	
    /**
     * Creates a new instance of the KidsBike class.
     * Initializes the attributes specific to kids' bikes.
     */
	public KidsBike() {
		name = "Kids Bike";
		price = 59.99;
		numWheels = 2;
		hasPedals = true;
		hasTrainingWheels = true;
    }
}