package strategy;
import java.util.Random;

/**
 *  A Recieve Behavior for Offense position
 * @author Marietou Seck
 */
class ReceieveBehavior implements OffenseBehavior{

     /** 
     * When OffenseBehavior is in RecieveBehavior 
     * @return A string representation of what the Offense player runs
    */
    public String play(){

        String[] block=  {"slant route", "out route", "seem route", "screen pass", "hail mary"};

        
        Random rand = new Random();
        int ran=rand.nextInt(block.length);
        String fillIn=(block[ran]);

        return("runs a " + fillIn);

    }
}