package strategy;
import java.util.Random;

/**
 *  A Pass Behavior for Offense position
 * @author Marietou Seck
 */

class PassBehavior implements OffenseBehavior{

    /** 
     * When OffenseBehavior is in PassBehavior 
     * @return A string representation of what the offense player throws
    */
public String play(){

    String[] block=  {"slant route", "out route", "seem route", "screen pass", "hail mary"};

    
    Random rand = new Random();
    int ran=rand.nextInt(block.length);
    String fillIn=(block[ran]);

    return("throws a " + fillIn);





}
}