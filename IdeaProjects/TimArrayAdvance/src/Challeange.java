public class Challeange {
    public static void main(String[] args) {
        displayHighScorePosition();
        CalculateHighScore();

    }

    private static void CalculateHighScore() {

        int playerScore;
        playerScore=600;
        System.out.println(playerScore);
    }

    public static void  displayHighScorePosition() {
        String playerName="Jhony";
        int Position=3;

        System.out.println(playerName +" Managed to Get into position " + Position +" Position on the table");



    }

    public static int CalculateHighScore(int playerScore) {



        if(playerScore>=1000) {
            playerScore=1;
        }else if (playerScore>=500) {
            playerScore=2;
        }else if (playerScore>=100) {
            playerScore=3;
        }
        return playerScore;


    }







}
