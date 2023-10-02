package singleton;

/**
 * The Difficulty enum represents the difficulty levels for anagram puzzles.
 * @author Marietou Seck
 */

public enum Difficulty {
    /**
     * Represents the easy difficulty level.
     */
    EASY("singleton/txt/three.txt"), 
    /**
     * Represents the medium difficulty level.
     */
    MEDIUM("singleton/txt/four.txt"), 
    /**
     * Represents the hard difficulty level.
     */
    HARD("singleton/txt/five.txt");

     /**
     * The file name associated with the difficulty level.
     */
    public final String fileName;

    /**
     * Constructs a new Difficulty enum value with the specified file name.
     * @param fileName The file name associated with the difficulty level.
     */
    private Difficulty(String fileName) {
        this.fileName = fileName;
    }
}
