package factory;

/**
 * Representation of different types of bikes.
 * @author Marietou Seck
 */
public abstract class Bike {
	protected String name;
	protected double price;
	protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;
	
     /**
     * Assemble the bike, including its frame, wheels, pedals and display its price.
     * @return A string describing the assembly process.
     */
	public String assembleBike() {
        String assemblyResult = "Creating a " + name + "\n";
        assemblyResult += "- " + createFrame() + "\n";
        assemblyResult +=  addWheels() + "\n";
        assemblyResult +=  addPedals() + "\n";
        assemblyResult +=  "- The price of a " + name + " is: $" + getPrice() + "\n";
        return assemblyResult;
	}
	
    /**
     * Create the frame of the bike.
     * @return A string describing the frame assembly process.
     */
	private String createFrame() {
		return "Assembling " + name + " frame";
        
	}
	
    /**
     * Add the wheels to the bike.
     * @return A string describing the wheel assembly process.
     */
	private String addWheels() {
        if(hasTrainingWheels==true){
            return "- Adding " + numWheels + " wheel(s)\n- Adding training wheels";
        }else{
            return "- Adding " + numWheels + " wheel(s)";
        } 
	}
	
    /**
     * Add the pedals to the bike.
     * @return A string describing the pedal assembly process.
     */
	private String addPedals() {
        if(hasPedals==true){
            return "- Adding pedals ";
        }
            return "";
	}
	
    /**
     * Get the price of the bike.
     * @return The price of the bike.
     */
	public double getPrice() {
		return price;
	}

}