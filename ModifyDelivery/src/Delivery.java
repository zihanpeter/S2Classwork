

/*
Modify:

Add an instance variable that tracks the price of the order

Modify the constructor so that only the address, rider name, and price need to be provided
Delivered should always be false when created

Modify the constructor so that the parameter names match the attributes
Use the this keyword to differentiate within the constructor, but only when necessary

Add a second constructor that takes zero parameters
Address and rider should be "Unknown", price should be 0.0, delivered false

Modify showDetails to also output the price

Modify the main method to properly demonstrate the behaviour of both constructors
By creating two different objects and calling showDetails

 */
public class Delivery {
    private String address;
    private String rider;
    private boolean delivered;
    private double price;

    public Delivery(String address, String rider, double price) {
        this.address = address;
        this.rider = rider;
        this.price = price;
    }

    public Delivery() {
        this.rider = "Unknown";
    }

    public void showDetails() {
        System.out.println("Address: " + address);
        System.out.println("Rider: " + rider);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Delivery d = new Delivery("19C Building 1 Main Street", "Kurt Angle", 100.0);
        d.showDetails();

        Delivery d1 = new Delivery();
        d1.showDetails();
    }
}
