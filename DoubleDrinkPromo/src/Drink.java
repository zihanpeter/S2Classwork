public class Drink {
    private String name;
    private int size;
    private double price;
    private boolean ready;

    public Drink(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
        ready = false;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String toString() {
        String returnStr =  name + " (" + size + "ml)";
        if (ready) {
            return returnStr + " (ready for collection)";
        }
        else {
            return returnStr + " (order is being made)";
        }
    }
}
