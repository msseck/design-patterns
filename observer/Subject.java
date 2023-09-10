package observer;

/**
 * Golfers that are observed by observers
 * @author Marietou Seck
 */
interface Subject {
    /**
     * Registers observers and adds them to a list to recieve score updates on the golfer
     * @param observer registered observer
     */
    public void registerObserver(Observer observer);

    /**
     * Unregisters observers and removes them from a list to recieve score updates on the golfer
     * @param observer unregistered observer
     */
    public void removeObserver(Observer observer);

     /**
     * Notifies observers with the strokes and par of the golfer
     * @param strokes the number of strokes by the golfer
     * @param par the par score of the golfer
     */
    public void notifyObservers(int strokes, int par);
}
