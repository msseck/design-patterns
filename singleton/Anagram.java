package singleton;
import java.util.ArrayList;

/**
 * The Anagram class represents an anagram puzzle with a question and possible answers.
 * @author Marietou Seck
 */
public class Anagram {
    
    private String question;
    private ArrayList<String> answers;

     /**
     * Constructs a new Anagram object with the specified question and answers.
     * @param question The question for the anagram puzzle.
     * @param answers  The list of possible answers for the anagram puzzle.
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Gets the question for the anagram puzzle.
     * @return The question for the anagram puzzle.
     */
    public String getQuestion() {
        return question;
    }

     /**
     * Checks if a user's answer is correct for the anagram puzzle.
     * @param userAnswer The user's answer to check.
     * @return {@code true} if the user's answer is correct, {@code false} otherwise.
     */
    public boolean isCorrect(String userAnswer) {
        String userAnswerLower = userAnswer.toLowerCase();
        return answers.contains(userAnswerLower);
    }
}

