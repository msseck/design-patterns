package factory;

/**
 * The BikeStore class represents a store that creates and assembles bikes based on user input.
 * @author Marietou Seck
 */
public class BikeStore {
	
	/**
     * Creates a new instance of the BikeStore class.
     */
	public BikeStore() {}
	
	 /**
     * Creates and assembles a bike of the specified type.
     * @param type The type of bike to create ( "tricycle", "strider", "kids bike").
     * @return A Bike object representing the assembled bike, or null if the type is not recognized.
     */
	public Bike createBike(String type) {
		Bike bike = null;
		
		if(type.equals("tricycle")){
			bike = new Tricycle();
		} else if(type.equals("strider")){
			bike= new Strider();
		}else if(type.equals("kids bike")){
			bike= new KidsBike();
		}else {
			System.out.println("We are sorry to hear you do not want a bike\nGoodbye");
		}
		
		if (bike != null) {
            bike.assembleBike();
            bike.getPrice();
        }
		
		return bike;
	}
	
}