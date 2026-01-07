public class RaffleTicketMachine {
    private int[] tickets;

    public RaffleTicketMachine(int ticketsNum) {
        this.tickets = new int[ticketsNum];
        for (int i = 0; i < ticketsNum; i++) {
            this.tickets[i] = (int)(Math.random() * 49) + 1;
        }
    }

    public void displayTickets() {
        for (int ticket : tickets) {
            System.out.print(ticket);
            System.out.print(" ");
        }
        System.out.println();
    }

    public int lowestTicket() {
        int min = Integer.MAX_VALUE;
        for (int ticket : tickets) {
            if (ticket < min) {
                min = ticket;
            }
        }
        return min;
    }

    public int highestTicket() {
        int max = Integer.MIN_VALUE;
        for (int ticket : tickets) {
            if (ticket > max) {
                max = ticket;
            }
        }
        return max;
    }

    public boolean containsNumber(int number) {
        for (int ticket : tickets) {
            if (ticket == number) {
                return true;
            }
        }
        return false;
    }

    public boolean allEven() {
        for (int ticket : tickets) {
            if (ticket % 2 == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RaffleTicketMachine machine1 = new RaffleTicketMachine(5);
        RaffleTicketMachine machine2 = new RaffleTicketMachine(10);

        System.out.println("Machine 1 tickets: ");
        machine1.displayTickets();
        System.out.println("Machine 2 tickets: ");
        machine2.displayTickets();

        System.out.println("Machine 1 lowest ticket: " + machine1.lowestTicket());
        System.out.println("Machine 2 lowest ticket: " + machine2.lowestTicket());
        System.out.println("Machine 1 highest ticket: " + machine1.highestTicket());
        System.out.println("Machine 2 highest ticket: " + machine2.highestTicket());

        System.out.println("Machine 1 contains number 10: " + machine1.containsNumber(10));
        System.out.println("Machine 2 contains number 10: " + machine2.containsNumber(10));

        System.out.println("Machine 1 all even: " + machine1.allEven());
        System.out.println("Machine 2 all even: " + machine2.allEven());
    }
}
