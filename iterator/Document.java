package iterator;
import java.util.Stack;

/**
 * The Document class represents a txt that can make changes,undo changes, and redo changes using stacks.
 * @author Marietou Seck
 */
public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

  /**
    * Constructs a new Document object with the specified title, undo, and redo.
    * @param title title of the document.
    */
    public Document(String title){
        this.title = title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

  /**
    * Makes a change to the txt and adds it to the undo stack.
    * @param change The change to be made to the document.
    * @return A message indicating the change that was made.
    */
    public String makeChange(String change){
        undoStack.push(change);
        redoStack.clear();
        return "Making change: " + change;
    }

     /**
     * Undoes the last change made to the txt by popping it from the undo stack and pushing it onto the redo stack.
     * @return A message displaying the change that was undone, or null if there are no changes to undo.
     */
    public String undoChange(){
        if(canUndo()){
            String undoneChange = undoStack.pop();
            redoStack.push(undoneChange);
            return "Undoing: " + undoneChange;
        }return null; 
    }

    /**
     * Checks if there are changes that can be undone.
     * @return true if there are changes to undo, false otherwise.
     */
    public boolean canUndo(){
        return !undoStack.isEmpty();
    }

   /**
     * Redoes the last undone change by popping it from the redo stack and pushing it back onto the undo stack.
     * @return A message indicating the change that was redone, or null if there are no changes to redo.
     */
    public String redoChange(){
        if(canRedo()){
            String redoneChange = redoStack.pop();
            undoStack.push(redoneChange);
            return "Redoing: " + redoneChange;
        }return null;
    }

    /**
     * Checks if there are changes that can be redone.
     * @return true if there are changes to redo, false otherwise.
     */
    public boolean canRedo(){
        return !redoStack.isEmpty();
    }

   /**
     * Returns an iterator for the undo stack, allowing iteration over the changes in the order they were made.
     * @return An iterator for the undo stack.
     */
    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }

    /**
     * Returns an iterator for the redo stack, allowing iteration over the undone changes in the order they were undone.
     * @return An iterator for the redo stack.
     */
    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
}
