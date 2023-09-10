package observer;

/**
 *  Observers that recieve updates on golfer's scores
 * @author Marietou Seck
 */
interface  Observer {
    /**
     * Updates golfer's score based on their par and strokes
     * @param strokes number of strokes by golfer
     * @param par par for the hole
     */
    public void update(int strokes, int par);

    /**
     * Returns String representation of the observer
     */
    public String toString();
}
