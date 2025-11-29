public class Atom {
    private String name;
    private String symbol;
    private int protons;
    private int neurons;
    private int electrons;

    public Atom(String name, String symbol, int protons, int neurons, int electrons) {
        this.name = name;
        this.symbol = symbol;
        this.protons = protons;
        this.neurons = neurons;
        this.electrons = electrons;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getProtons() {
        return protons;
    }

    public int getNeurons() {
        return neurons;
    }

    public int getElectrons() {
        return electrons;
    }

    public int getOverCharge() {
        return protons - electrons;
    }

    public String toString() {
        return "The Atom name is " + name + ", symbol is " + symbol + ", number of protons are " + protons + ", number of neutrons are " + neurons + ", number of electrons are " + electrons + ", Over charge: " + getOverCharge();
    }

    static void main() {
        Atom atom = new Atom("Carbon", "C", 6, 6, 6);

        System.out.println(atom.toString());
    }
}
