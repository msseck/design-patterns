package strategy;
import java.util.Random;

/**
 *  A Block behavior for defense position
 * @author Marietou Seck
 */

class BlockBehavior implements DefenseBehavior{

    /** 
     * When DefenseBehavior is in BlockBehavior 
     * @return A string representation of what the defense player blocks
    */
    public String play(){

        String[] block=  {"kick", "punt", "pass", "catch"};

        Random rand = new Random();
        int ran=rand.nextInt(block.length);
        String fillIn=(block[ran]);

        return("block a " + fillIn);

    }
}