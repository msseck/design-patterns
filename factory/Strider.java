package factory;

/**
 * Represents a type of bike known as a strider; extends the Bike class and
 *  provides specific attributes and values for strider bikes.
 * @author Marietou Seck
 */
public class Strider extends Bike {
	
    /**
     * Creates a new instance of the Strider class.
     * Initializes the attributes specific to strider bikes.
     */
	public Strider() {
		name = "Strider";
		price = 109.99;
		numWheels = 2;
		hasPedals = false;
		hasTrainingWheels = false;
    }
}
