package decorator;

/**
 * Represents a decorator that extends VehicleDecorator for adding rim decoration to a vehicle's appearance .
 * @author Marietou Seck
 */
public class Rims extends VehicleDecorator {

     /**
     * Constructs a new Rims object to decorate a vehicle with rim decoration.
     * @param vehicle The vehicle to decorate.
     */
    public Rims(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
    }
}