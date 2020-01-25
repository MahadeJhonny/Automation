package MethodOvrloading;

public class JavaMethod {
    public static void main(String[] args) {
      int newScore=  calculateScore("Jhonny",5);
      calculateScore(10);
      calculateScore();
        System.out.println("NewScore " + newScore);

    }
    public static int calculateScore(String playerName,int Score) {
        System.out.println("PlayerName " +playerName + " Scored " + Score + " Point ");
        return Score*1000;

    }
    public static int calculateScore(int Score) {
        System.out.println("Unnamed Player Scored " + Score + " Point ");
        return Score*1000;

    }
    public static int calculateScore() {
        System.out.println("Unnamed Player not Scored");
        return 0;

    }



}
