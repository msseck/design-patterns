package observer;

/**
 * Display and updates the golfer's overall round score 
 * @author Marietou Seck
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Registered observers that will observe the golfer
     * @param golfer the golfer that is being observed
     */
    public RoundScoreDisplay(Subject golfer){
        this.golfer=golfer;
        golfer.registerObserver(this);
    }

    /**
     * updates the round score display with the total number of strokes and par by golfer
     * @param strokesTotal golfer's total strokes for the round
     * @param parTotal golfer's total par for the round
     */
    public void update(int strokesTotal, int parTotal){
        this.strokesTotal+=strokesTotal;
        this.parTotal+=parTotal;
    }

    /**
     * String representation of the overall hole stats based on the golfer's total par/strokes and being over/ under / or equal to par in the round
     * @return a string representation of the overall round stats
     */
    public String toString(){
        String spTotal;
        if(strokesTotal > parTotal){
            spTotal = strokesTotal - parTotal + " over par ";
        }
        else if(strokesTotal < parTotal) {
            spTotal = parTotal - strokesTotal + " under par ";
        }
        else{
            spTotal = " made par ";
        }
        return "Overall Hole stats: Par (" + parTotal + ") Strokes (" + strokesTotal +"), " + spTotal;
    }

}
