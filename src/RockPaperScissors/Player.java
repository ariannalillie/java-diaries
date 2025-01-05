package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Player {
    String name;
    boolean isComputer;
    int score;

    public Player(String name, boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
        this.score = 0;
    }

    public String makeChoice() {
        if (isComputer) {
            Random random = new Random();
            int randomNumber = random.nextInt(3);
            return switch (randomNumber) {
                case 0 -> "rock";
                case 1 -> "paper";
                case 2 -> "scissors";
                default -> "Game Error";
            };
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose, either 'rock', 'paper' or 'scissors': ");
            return scanner.nextLine();
        }
    }
}
