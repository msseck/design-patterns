package factory;

/**
 * Represents a type of bike known as a tricycle; extends the Bike class and 
 * provides specific attributes and values for tricycles.
 * @author Marietou Seck
 */
public class Tricycle extends Bike {
	
    /**
     * Creates a new instance of the Tricycle class.
     * Initializes the attributes specific to tricycles.
     */
	public Tricycle() {
		name = "Tricycle";
		price = 99.99;
		numWheels = 3;
		hasPedals = true;
		hasTrainingWheels = false;
    }
}