package decorator;
import java.util.ArrayList;

/**
 * Represents vehicles with an appearance of their list of lines
 * @author Marietou Seck
 */
public abstract class Vehicle{
    protected ArrayList<String> lines;

    /**
     * Constructs a new Vehicle object with the provided list of lines.
     * @param lines A list of lines representing the vehicle's appearance.
     */
    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Returns a string representation of the vehicle's appearance by concatenating all lines with newline characters.
     * @return A string representing the vehicle's appearance.
     */
    public String toString(){

        String result = "";

        for(int i = 0; i < lines.size(); i++)
            result += lines.get(i) + "\n";

        return result;
    }

}