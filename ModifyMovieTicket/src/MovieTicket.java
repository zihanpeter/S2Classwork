

/*
Modifications:

Add an accessor for durationMins

Add a mutator for durationMins. Allow only durations between 1 minute and 240 minutes, inclusive.

Add an accessor for the start time, but return it as a String, e.g. "18:30"
You should not create a new instance variable for this!

Add an accessor for the time the movie ends. Return it as a string.
You can calculate this using existing variables.
e.g. if the start time is 18:30 and it's a 95 minute movie, return "20:05"
You can assume the end time will not go past 23:59

Modify the main method to test all your new functionality properly
 */

public class MovieTicket {
    private String movieName;
    private int timeHr;
    private int timeMin;
    private int durationMins;

    public MovieTicket(String movieName, int timeHr, int timeMin, int durationMins) {
        this.movieName = movieName;
        this.timeHr = timeHr;
        this.timeMin = timeMin;
        this.durationMins = durationMins;
    }

    public String getEndTime() {
        int timeHrBegin = this.timeHr;
        int timeMinBegin = this.timeMin;
        timeHrBegin += durationMins / 60;
        timeMinBegin += durationMins % 60;

        if (timeMinBegin >= 60) {
            timeMinBegin %= 60;
            timeHrBegin++;
        }

        if (timeMinBegin < 10) {
            return "" + timeHrBegin + ":0" + timeMinBegin;
        }

        return "" + timeHrBegin + ":" + timeMinBegin;
    }

    public String getStartTime() {
        if (timeMin < 10) {
            return "" + timeHr + ":0" + timeMin;
        }
        return "" + timeHr + ":" + timeMin;
    }

    public int getDurationMins() {
        return this.durationMins;
    }

    public void setDurationMins(int durationMins) {
        if (1 <= durationMins && durationMins <= 240) {
            this.durationMins = durationMins;
        }
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        if (!(movieName == null) && !movieName.equals("")) {
            this.movieName = movieName;
        }
    }

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket("Spider-man", 18, 30, 95);
        movieTicket.setMovieName("Spider-man 2");
        System.out.println(movieTicket.getMovieName());

        movieTicket.setDurationMins(125);
        movieTicket.setDurationMins(300);
        System.out.println(movieTicket.getDurationMins());
        System.out.println(movieTicket.getStartTime());
        System.out.println(movieTicket.getEndTime());

        movieTicket.setDurationMins(35);
        System.out.println(movieTicket.getEndTime());
    }
}
