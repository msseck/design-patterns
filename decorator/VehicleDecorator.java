package decorator;
import java.util.ArrayList;

/**
 * Decorates and modifies vehicle
 * @author Marietou Seck
 */
public abstract class VehicleDecorator extends Vehicle{

    protected ArrayList<String> lines;

     /**
     * Constructs a new VehicleDecorator object with the provided list of lines.
     * @param lines A list of lines representing the vehicle's appearance.
     */
    public VehicleDecorator(ArrayList<String> lines){
        super(lines);
        this.lines = lines;

    }

    /**
     * Integrates decoration lines into the vehicle's lines, applying the decoration over the existing lines when needed.
     * @param decor A list of decoration lines to integrate into the vehicle's lines.
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for(int i = 0; i < lines.size(); i++ ){
            String line = "";
            for(int j = 0; j < lines.get(i).length(); j++){
                if(decor.get(i).length() > j && decor.get(i).charAt(j) != ' ')
                    line += decor.get(i).charAt(j);
                else
                    line += lines.get(i).charAt(j);
            }
            lines.set(i, line);
         }
    }

}