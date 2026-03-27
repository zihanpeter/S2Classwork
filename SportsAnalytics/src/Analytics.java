/*
This class maintains an ArrayList of Player objects
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analytics {
    private ArrayList<Player> players;

    public Analytics() throws FileNotFoundException {
        players = new ArrayList<>();
        populatePlayers();
    }

    /*
    populate players with Player objects using the data in PlayerData.txt
    The data is structured as ATHLETEID_TEAMNAME_PLAYERNAME_RATING
     */
    private void populatePlayers() throws FileNotFoundException {
        File file = new File("PlayerData.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] player = scanner.nextLine().split("_");
            players.add(new Player(
                    Integer.parseInt(player[0].substring(1)),
                    player[2],
                    player[1],
                    Integer.parseInt(player[3])
            ));
        }
    }

    /*
    return the ID of the player with the given name, or null if not found
     */
    public String getIdByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return "A" + player.getId();
            }
        }
        return null;
    }

    /*
    print the names of all athletes on a given team
     */
    public void showAllPlayers(String team) {
        for (Player player : players) {
            if (player.getTeam().equals(team)) {
                System.out.println(player.getName());
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // add test data
        Analytics analytics = new Analytics();
        System.out.println("Names of players in team Iron Vipers");
        analytics.showAllPlayers("Iron Vipers");
        System.out.println("Names of players in team Thunder Knights");
        analytics.showAllPlayers("Thunder Knights");

        System.out.println("Id of the player Charley James: " +  analytics.getIdByName("Charley James"));
        System.out.println("Id of the player Chana Ellison: " +  analytics.getIdByName("Chana Ellison"));
        System.out.println("Id of the player A (not in the list): " +  analytics.getIdByName("A"));
    }
}
