public class Player {
    private int id;
    private String name;
    private String team;
    private int rating;

    public Player(int id, String name, String team, int rating) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return id + " - " + name + " (" + team + "), Rating: " + rating;
    }
}