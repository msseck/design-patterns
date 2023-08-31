package strategy;
import java.util.Random;

class BlockBehavior implements DefenseBehavior{

    public String play(){

        String[] block=  {"kick", "punt", "pass", "catch"};

        
        Random rand = new Random();
        int ran=rand.nextInt(block.length);
        String fillIn=(block[ran]);

        return("block a" + fillIn);





    }
}