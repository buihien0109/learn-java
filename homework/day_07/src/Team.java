import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Team {
    private ArrayList<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player newPlayer) {
        for (Player player : players) {
            if (player.equals(newPlayer)) {
                System.out.println("Cầu thủ đã có trong đội");
                return;
            }
            if (player.getNumber() == newPlayer.getNumber()) {
                System.out.println("Cầu thủ không được trùng số áo");
                return;
            }
        }
        players.add(newPlayer);
        System.out.println("Cầu thủ : " + newPlayer.getFullName()
                + " - Số áo : " + newPlayer.getNumber()
                + " - Vị trí : " + newPlayer.getPosition() + " đã được thêm vào đội");
    }

    public void getTeam(int numbersGK, int numbersDF, int numbersMF, int numbersFW) {
        ArrayList<Player> selectedTeam = new ArrayList<>();
        selectedTeam.addAll(getPlayers(Position.GK, numbersGK));
        selectedTeam.addAll(getPlayers(Position.DF, numbersDF));
        selectedTeam.addAll(getPlayers(Position.MF, numbersMF));
        selectedTeam.addAll(getPlayers(Position.FW, numbersFW));

        showTeam(selectedTeam);
    }

    public void showTeam(ArrayList<Player> allPlayers) {
        for (Player player : allPlayers) {
            System.out.println(player);
        }
    }

    public ArrayList<Player> getPlayers(Position position, int totalPlayer) {
        ArrayList<Player> selectedPlayers = new ArrayList<>();
        Random random = new Random();
        int count = 0;

        while (count < totalPlayer) {
            int rdPlayer = random.nextInt(players.size());

            if (players.get(rdPlayer).getPosition().equals(position)
                    && !selectedPlayers.contains(players.get(rdPlayer))
            ) {
                selectedPlayers.add(players.get(rdPlayer));
                count++;
            }
        }

        return selectedPlayers;
    }
}
