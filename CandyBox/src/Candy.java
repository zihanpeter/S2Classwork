public class Candy {
    private String flavor;

    public Candy(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public String toString() {
        return "{\uD83C\uDF6C" + flavor +"}";
    }
}
