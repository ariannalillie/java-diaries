package RockPaperScissors;

public class Main {
    public static void main (String[] args) {
        Player ari = new Player("Ari", false);
        System.out.println(ari.makeChoice());
        Player computer = new Player("Computer", true);
        System.out.println(computer.makeChoice());
    }
}
