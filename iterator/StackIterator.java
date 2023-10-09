package iterator;
import java.util.Stack;
import java.util.Iterator; 

/**
 * The StackIterator class is an iterator implementation for iterating over elements in a stack of strings.
 * @author Marietou seck
 */
public class StackIterator implements Iterator<String> { 
    private Stack<String> items;
    private int position = 0;

    /**
     * Constructs a new StackIterator with the specified stack of strings.
     * @param items The Stack of Strings to be iterated over.
     */
    public StackIterator(Stack<String> items) {
        this.items = items;
    }

    /**
     * Returns the next element in the stack and advances the iterator position.
     * @return The next element in the stack.
     */
    public String next() {
        String nextItem = items.get(position); 
        position = position + 1;
        return nextItem;
    }

   /**
     * Checks if there are more elements to iterate over in the stack.
     * @return true if there are more elements to iterate over, false otherwise.
     */
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
    
}
