package strategy;
import java.util.Random;
/**
 *  A Lineman position held by football player
 * @author Marietou Seck
 */
public class Lineman extends Player{

    /**
     * Creates a string representation for Lineman's name
     * @param firstName Lineman's first name
     * @param lastName Lineman's last name
     * @param offense Lineman's offense position
     */
    public Lineman(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }

    /**
     *  sets OffenseBahvior to new OBlockBehavior
     */
    public void setOffenseBehavior(){
        offenseBehavior = new OBlockBehavior();
    }

    /**
     * sets DefenseBehavior to a randomized behavior
     */
    public void setDefenseBehavior(){
        Random rand = new Random();

        int ran = rand.nextInt(3);
        if(ran==1){
            defenseBehavior = new BlockBehavior();
        }
        else if(ran==2){
            defenseBehavior = new StripBehavior();
        }
        else{
            defenseBehavior = new SackBehavior();
        }
    }
}