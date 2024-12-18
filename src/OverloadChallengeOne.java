public class OverloadChallengeOne {
    public static void main(String[] args) {
        double calculateHeight = convertToCentimeters(130);
        System.out.println(calculateHeight);
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return (heightInInches + heightInFeet * 12 ) * 2.54;
    }
    public static double convertToCentimeters(int heightInInches) {
        return convertToCentimeters(0, heightInInches);
    }
}
