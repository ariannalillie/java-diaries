package RockPaperScissors;

import java.util.Scanner;

public class Game {
 Player player;
 Player computer;
 int rounds;
 int playerScore;
 int computerScore;

    public Game() {
    }

    public void startGame() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter your name: ");
     String playerName = scanner.nextLine();
     player = new Player(playerName, false);
     computer = new Player("computer", true);

     System.out.println("Enter number of rounds: ");
     rounds = Integer.parseInt(scanner.nextLine());
     playerScore = 0;
     computerScore = 0;
     while (rounds > 0) {
         playRound();
         System.out.println(rounds + " rounds left!");
     }
 }
 public void playRound() {
        String playerChoice = player.makeChoice();
        String computerChoice = computer.makeChoice();
        System.out.println("Computer chose :" + computerChoice);
        rounds--;
        determineWin(playerChoice, computerChoice);
 }
 public void determineWin(String playerChoice, String computerChoice) {
     // Check for tie
     if (playerChoice.equals(computerChoice)) {
         System.out.println("It's a tie!");
         System.out.println("Computer: "+ computerScore + " " + player.name + ": " + playerScore);
     }
     // Check for player win
     else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
             (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
             (playerChoice.equals("Paper") && computerChoice.equals("Rock"))) {
         playerScore++;
         System.out.println("Player wins!");
         System.out.println("Computer: "+ computerScore + " " + player.name + ": " + playerScore);
     }
     // Otherwise, computer wins
     else {
         computerScore++;
         System.out.println("Computer wins!");
         System.out.println("Computer: "+ computerScore + " " + player.name + ": " + playerScore);
     }
 }
}
