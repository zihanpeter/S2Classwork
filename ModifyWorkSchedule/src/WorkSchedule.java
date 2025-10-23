public class WorkSchedule {
    /* modify
    modify enoughTime so that, if either parameter is already completed, it is not
    factored into the calculation.

    write two new methods -
    static void printDetails(WorkOrder order)
    outputs the details, hours required, and whether completed for order

    static boolean paintingRequired(WorkOrder order)
    returns true if the order is NOT completed and it involves painting
    by searching for the "paint" keyword
    */

    // 1. change this method so that, if order1 or order2 is already 'completed'
    // it is not considered in the calculation
    // e.g. if order1 needs 20 hours but is completed, order2 needs 13 hours and is not
    // then enoughTime(15, order1, order2) should return TRUE
    public static boolean enoughTime(int time, WorkOrder order1, WorkOrder order2) {
        if (order1.isCompleted() && order2.isCompleted()) return true;
        if (order1.isCompleted()) return order2.getNumHours() <= time;
        if (order2.isCompleted()) return order1.getNumHours() <= time;
        return order1.getNumHours() + order2.getNumHours() <= time;
    }

    // 2. output the details, hours required, and whether completed for the 'order' parameter
    // the output should be meaningful and readable
    public static void printDetails(WorkOrder order) {
        // to be implemented
        System.out.println("Details: " + order.getDetails());
        System.out.println("Hours required: " + order.getNumHours());
        System.out.println("Completed: " + order.isCompleted());
    }

    // 3. return true if the details of 'order' contains the substring "paint"
    public static boolean paintingRequired(WorkOrder order) {
        // to be implemented
        return order.getDetails().indexOf("paint") != -1;
    }


    // DO NOT MODIFY
    public static void main(String[] args) {
        int hoursAvailable = 25;
        // old test data - do not modify
        WorkOrder item1 = new WorkOrder(12, "repair decking");
        WorkOrder item2 = new WorkOrder(11, "refuel trucks");
        WorkOrder item3 = new WorkOrder(14, "paint walls");
        WorkOrder item4 = new WorkOrder(8, "buy painting equipment");

        System.out.println(enoughTime(hoursAvailable, item1, item3)); // false
        item3.completeOrder();
        System.out.println(enoughTime(hoursAvailable, item1, item3)); // true

        System.out.println(paintingRequired(item2)); // false
        System.out.println(paintingRequired(item3)); // true
        System.out.println(paintingRequired(item4)); // true

        printDetails(item4);
        // example output:
        // buy painting equipment
        // hours required: 8
        // completed: false

    }
}
