package strategy;
import java.util.Random;

/**
 * Quarterback position held by football player
 * @author Marietou Seck
 */
public class QuarterBack extends Player{

    /**
     * Creates a string representation for Quarterback's name
     * @param firstName Quarterback's first name
     * @param lastName Quarterback's last name
     * @param offense Quarterback's offense position
     */
    public QuarterBack(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }


    /**
     * Set OffenseBehavior to randomized behavior;PassBehavior or RunBehavior
     */
    public void setOffenseBehavior(){
        Random rand = new Random();
        if(rand.nextBoolean())
        {
            offenseBehavior = new PassBehavior();
        }
        else
        {
            offenseBehavior = new RunBehavior();
        }
    }

    /**
     *  Set Defensebehavior to null
     */
    public void setDefenseBehavior(){
        defenseBehavior = null;
    }
}