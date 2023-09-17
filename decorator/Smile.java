package decorator;

/**
 * Represents a decorator that extends VehicleDecorator for adding a smile to a vehicle's appearance.
 * @author Marietou Seck
 */
public class Smile extends VehicleDecorator {

    /**
     * Constructs a new Smile object to decorate a vehicle with a smile.
     * @param vehicle The vehicle to decorate.
     */
    public Smile(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
        
    }
}