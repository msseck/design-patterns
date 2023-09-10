package observer;
import java.util.ArrayList;

/**
 *  A Golfer who is our subject
 * @author Marietou Seck 
 */

public class Golfer implements Subject {
    
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    protected String name;

    /**
     * Creates String Representation of golfer's name
     * @param name golfer's name
     */
    public Golfer(String name){
        this.name = name;
    }

    /**
     * Registers observers and adds them to a list to recieve score updates on the golfer
     * @param observer registered observer
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * Unregisters observers and removes them from a list to recieve score updates on the golfer
     * @param observer unregistered observer
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * Notifies observers with the strokes and par of the golfer
     * @param strokes the number of strokes by the golfer
     * @param par the par score of the golfer
     */
    public void notifyObservers(int strokes, int par){
        for(Observer observer : observers){
            observer.update(strokes,par);
        }
    }

    /**
     * Records strokes and par of the golfer and notifies observers
     * @param strokes the number of strokes by the golfer
     * @param par the par score of the golfer
     */
    public void enterScore(int strokes, int par){
        notifyObservers(strokes, par);
    }

    /**
     * String representation of golfer's name
     * @return name of golfer
     */
    public String getName(){
        return this.name;
    }
}
