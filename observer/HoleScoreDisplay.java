package observer;

/**
 * Display that observes and updates hole scores
 * @author Marietou Seck
 */

public class HoleScoreDisplay implements Observer {
    
    private Subject golfer;
    private int strokes;
    private int par=3;

    /**
     * Registered observers that will observe the golfer
     * @param golfer the golfer that is being observed
     */
    public HoleScoreDisplay(Subject golfer){
        this.golfer=golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates golfers holescore display based on their strokes and par
     * @param strokes number of stroke by golfer
     * @param par par for the hole
     */
    public void update(int strokes, int par){
        this.strokes=strokes;
        this.par=par;
    }

    /**
     * String representation of the current hole stats based on the golfer's par and strokes and  being over/ under / or equal to par 
     * @return a string representation of the current hole stats
     */
    public String toString(){
        String numPar;
        if(strokes > par){
            numPar=strokes-par + " over par";
        }
        else if(strokes==par){
            numPar = " made par";
        }
        else{
           numPar=par-strokes + " under par";
        }
        return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), " + numPar;
    }
}
