public class Poster {
    private int size;
    private boolean fullColour;
    private boolean printed;

    public Poster() {
        size = (int) (Math.random() * 5) + 1; // A1, A2, A3, A4 or A5 sizes
        fullColour = Math.random() < 0.5;
        printed = false;
    }

    public int getSize() {
        return size;
    }

    public boolean isFullColour() {
        return fullColour;
    }

    public boolean isPrinted() {
        return printed;
    }

    public void print() {
        printed = true;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "size=" + size +
                ", fullColour=" + fullColour +
                ", printed=" + printed +
                "}\n";
    }
}
