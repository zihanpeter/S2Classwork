public class TriviaQuestion {
    private int difficultyLevel;

    public TriviaQuestion(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public String toString() {
        return "Rating: " + difficultyLevel;
    }
}
