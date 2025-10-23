public class WorkOrder {
    private int numHours;
    private String details;
    private boolean completed;

    public WorkOrder(int numHours, String details) {
        this.numHours = numHours;
        this.details = details;
        completed = false;
    }

    public int getNumHours() {
        return numHours;
    }

    public String getDetails() {
        return details;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeOrder() {
        if (completed) {
            System.out.println("This order was completed at an earlier time.");
        }
        else {
            completed = true;
            System.out.println("Work order completed in " + numHours + " hours.");
        }
    }
}
