package strategy;
import java.util.Random;

class RunBehavior implements OffenseBehavior{
public String play(){

    String[] block=  {"drive (up the gut)", "draw", "pitch", "reverse"};

    
    Random rand = new Random();
    int ran=rand.nextInt(block.length);
    String fillIn=(block[ran]);

    return("runs a " + fillIn);





}
}