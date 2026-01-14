import java.util.Arrays;

public class TriviaGame {
    private TriviaQuestion[] allQuestions;

    // constructor: do not adjust
    public TriviaGame(int numQuestions) {
        allQuestions = new TriviaQuestion[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            int randomDifficulty = (int) (Math.random() * 100) + 1;
            allQuestions[i] = new TriviaQuestion(randomDifficulty);
        }
        System.out.println(Arrays.toString(allQuestions)); // for testing purposes
    }

    public int getMostDifficult() {
        return 0;
    }

    public int getLeastDifficult() {
        return 0;
    }

    public String getRating() {
        return null;
    }

    public boolean isDifficultyIncreasing() {
        return false;
    }

    public static void main(String[] args) {
        // check that the following tests output what you would expect before submitting.
        TriviaGame game1 = new TriviaGame(4);
        System.out.println(game1.getLeastDifficult());
        System.out.println(game1.getMostDifficult());
        System.out.println(game1.getRating());
        System.out.println(game1.isDifficultyIncreasing());

        System.out.println();

        Solutions.TriviaGame game2 = new Solutions.TriviaGame(7);
        System.out.println(game2.getLeastDifficult());
        System.out.println(game2.getMostDifficult());
        System.out.println(game2.getRating());
        System.out.println(game2.isDifficultyIncreasing());

        System.out.println();

        Solutions.TriviaGame game3 = new Solutions.TriviaGame(2);
        System.out.println(game3.isDifficultyIncreasing());
    }
}
