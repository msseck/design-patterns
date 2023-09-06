package strategy;
import java.util.Random;

/**
 *  A Run Behavior for Offense position
 * @author Marietou Seck
 */
class RunBehavior implements OffenseBehavior{

    /** 
     * When OffenseBehavior is in RunBehavior 
     * @return A string representation of what the offense player runs
    */
    public String play(){

        String[] block=  {"drive (up the gut)", "draw", "pitch", "reverse"};

        
        Random rand = new Random();
        int ran=rand.nextInt(block.length);
        String fillIn=(block[ran]);

        return("runs a " + fillIn);

    }
}