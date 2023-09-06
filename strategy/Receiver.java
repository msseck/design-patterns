package strategy;

/**
 *  A Reciever position held by football player
 * @author Marietou Seck
 */
public class Receiver extends Player{

      /**
     * Creates a string representation for Reciever's name
     * @param firstName Reciever's first name
     * @param lastName Reciever's last name
     * @param offense Reciever's offense position
     */
    public Receiver(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }

     /**
     *  sets OffenseBehavior to new RecieveBehavior
     */
     
    public void setOffenseBehavior(){

        offenseBehavior = new ReceieveBehavior();
    }
    
     /**
     *  Set Defensebehavior to null
     */
    public void setDefenseBehavior(){
        
    }
}