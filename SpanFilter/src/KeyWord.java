public class KeyWord {
    private String word;
    private int weight;

    public KeyWord(String word, int weight) {
        this.word = word;
        this.weight = weight;
    }

    public String getWord() {
        return word;
    }

    public int  getWeight() {
        return weight;
    }

    public String toString() {
        return word + " (" + weight + ")";
    }
}
