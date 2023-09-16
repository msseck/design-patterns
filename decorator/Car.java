package decorator;

/**
 * Represents a car, extending that extends to Vehicle and initializes the car's appearance based on lines from the file.
 * @author Marietou Seck
 */
public class Car extends Vehicle{

    /**
     * Constructs a new Car object to represent a car's appearance.
     * The appearance is initialized using lines obtained from a file.
     */
    public Car(){
        super(FileReader.getLines("decorator/car.txt"));
    }
}