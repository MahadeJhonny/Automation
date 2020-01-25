public class Statements {
    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelCompleated = 5;
        int bonus = 100;

        score = 10000;
        levelCompleated = 8;
        bonus = 200;


        int highScore =CalculateScore(true,800, 8, 500);
        System.out.println("The Highscore Is " + highScore);


    }

    public static int CalculateScore(boolean gameover, int score, int levelCompleated, int bonus) {

        if (score <= 800 || score > 500) {
            int total = levelCompleated * bonus;
            System.out.println("the total value here " + total);
            return score;
        }else {
            return 0;
        }


    }
}
