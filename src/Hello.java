public class Hello {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Arianna", highScorePosition);
    }
    public static void displayHighScorePosition (String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on this high score list.");
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
