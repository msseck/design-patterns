package decorator;

/**
 * Represents a decorator that extends VehicleDecorator for changing the color of a vehicle's appearance.
 * @author Marietou Seck
 */
public class Paint extends VehicleDecorator{

    /**
     * Constructs a new Paint object to decorate a vehicle by changing its color.
     * @param vehicle The vehicle to decorate.
     * @param color The color to be applied to the vehicle.
     */
    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);
        paintingCar(color);
       
    }

    /**
     * Gets the color code for a given color.
     * @param color The color name.
     * @return The color code for the chosen color.
     */
    public String getColorCode(String color){
        if(color.equalsIgnoreCase("black"))
            return "\u001B[0m";
        if(color.equalsIgnoreCase("red"))
            return "\u001B[31m";
        if(color.equalsIgnoreCase("green"))
            return "\u001B[32m";
        if(color.equalsIgnoreCase("yellow"))
            return "\u001B[33m";
        if(color.equalsIgnoreCase("blue"))
            return "\u001B[34m";
        if(color.equalsIgnoreCase("purple"))
            return "\u001B[35m";
        if(color.equalsIgnoreCase("cyan"))
            return "\u001B[36m";
        return "";
    }

    /**
     * Changes the vehicle's color.
     * @param color The color to be applied to the vehicle.
     */
    private void paintingCar(String color){
        String newLine = getColorCode(color) + lines.get(0);
        lines.set(0, newLine);

        String backToNormal = lines.get(lines.size()-1) + getColorCode( "black");
        lines.set(lines.size()-1, backToNormal);
    }
}