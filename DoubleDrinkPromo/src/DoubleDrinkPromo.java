/*
This class represents a drink promotion at a coffee and tea shop
A double drink promo costs only 19.90 and includes any two drinks
When a DoubleDrinkPromo object is created, the two drinks must be provided (Drink object references)
Alternatively, provide just one drink, and both drinks will be the same (but should still be distinct drinks)
The class has the following methods in addition to constructors:
- readyToCollect which takes in a number (1 or 2) and marks the drink that corresponds with that number to "ready"
- getSavings() which returns how much money was saved through the double drink promo
- toString which returns details of the two drinks in the format:

Drink 1: <Name>> (<Capacity>ml) (<ready for collection/order is being made>)
Drink 2: as above, for the second drink

You should inspect the methods available in the Drink class to assist you.
Do not rewrite functionality already provided by the Drink class.
You may not make any modifications to the Drink class.
 */

public class DoubleDrinkPromo {
    private Drink drink1;
    private Drink drink2;

    public DoubleDrinkPromo(Drink drink) {
        this.drink1 = drink;
        this.drink2 = new Drink(drink.getName(), drink.getSize(), drink.getPrice());
    }

    public DoubleDrinkPromo(Drink drink1, Drink drink2) {
        this.drink1 = drink1;
        this.drink2 = drink2;
    }

    public void readyToCollect(int num) {
        if (num == 1) {
            drink1.setReady(true);
        }
        else {
            drink2.setReady(true);
        }
    }

    public double getSavings() {
        return drink1.getPrice() + drink2.getPrice() - 19.9;
    }

    public String toString() {
        return drink1.toString() + "\n" + drink2.toString();
    }

    public static void main(String[] args) {
        Drink test1 = new Drink("Americano", 300, 15.67);
        Drink test2 = new Drink("Milk Tea", 350, 12.37);
        DoubleDrinkPromo promo = new DoubleDrinkPromo(test1, test2);
        promo.readyToCollect(2);
        System.out.println("Savings: " + promo.getSavings());
        System.out.println(promo.toString());
        /* Expected output:
            Savings: 8.14
            Drink 1: Americano (300ml) (order is being made)
            Drink 2: Milk Tea (350ml) (ready for collection)
         */

        System.out.println("----------");

        test1 = new Drink("Oat Milk Latte", 288, 14.45);
        promo = new DoubleDrinkPromo(test1);
        promo.readyToCollect(1);
        System.out.println("Savings: " + promo.getSavings());
        System.out.println(promo);

        /* Expected output:
            Savings: 9.0
            Drink 1: Oat Milk Latte (288ml) (ready for collection)
            Drink 2: Oat Milk Latte (288ml) (order is being made)
         */

        System.out.println("----------");
    }
}
