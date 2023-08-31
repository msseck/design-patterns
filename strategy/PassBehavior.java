package strategy;
import java.util.Random;

class PassBehavior implements OffenseBehavior{
public String play(){

    String[] block=  {"slant route", "out route", "seem route", "screen pass", "hail mary"};

    
    Random rand = new Random();
    int ran=rand.nextInt(block.length);
    String fillIn=(block[ran]);

    return("throws a " + fillIn);





}
}