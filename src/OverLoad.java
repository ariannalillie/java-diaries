// Method overloading - when multiple methods in the same class
// have the same name but different parameters (number or type).
// It allows a method to perform different tasks based on input.

public class OverLoad {
    // Function signature - the function name and its params
    public static void main(String[] args) {
    int newScore = calculateScore("Arianna", 500);
    System.out.println("New score is "+newScore);
    calculateScore(75);
    calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score);
        return score * 1000;
    }
    // overload methods do not need to have the same return type
    // however the return type alone cannot differentiate overloaded methods
    public static void calculateScore(int score) {
        // Java's equivalent to having a default value for a param
        calculateScore("Anonymous ", score);
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
