package singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game() {
        // Initialize your game state here
        rand = new Random();
        level = Difficulty.EASY;
        anagrams = new HashMap<>();
        score = 0;
    }

    public static Game getInstance() {
        if (game == null) {
            game= new Game();
        }
        return game;
    }

    public String getQuestion() {
        while (true) {
            ArrayList<Anagram> levelAnagrams = anagrams.get(level);
    
            // Check if levelAnagrams is null or empty, and if so, transition to the next difficulty level
            while (levelAnagrams == null || levelAnagrams.isEmpty()) {
                // Transition to the next difficulty level based on the score
                if (score > 10) {
                    level = Difficulty.HARD;
                } else if (score > 6) {
                    level = Difficulty.MEDIUM;
                } else {
                    level = Difficulty.EASY;
                }
    
                // Ensure that the anagrams HashMap is initialized for the new difficulty level
                if (anagrams.get(level) == null) {
                    anagrams.put(level, FileReader.getAnagrams(level));
                }
    
                levelAnagrams = anagrams.get(level);
            }
    
            int randIndex = rand.nextInt(levelAnagrams.size());
            Anagram randAnagram = levelAnagrams.remove(randIndex);
            currentAnagram = randAnagram;
    
            String question = currentAnagram.getQuestion();
            if (question != null && !question.isEmpty()) {
                return question;
            }
        }
    }
    
    
    
    
    
    
    public boolean isCorrect(String userAnswer) {
      boolean correct = currentAnagram.isCorrect(userAnswer);
  
      if (correct) {
        score++;
    }
    return correct;

    }

    public int getScore() {
        return score;
    }
}
