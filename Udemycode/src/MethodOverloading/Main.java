package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("New score is :" + newScore);
        calculateScore(85);
        //calculateScores(85,100);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " +score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " +score + " points ");
        return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No Player, no scores");
        return;
    }
}
