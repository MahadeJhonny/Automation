package polymorphism;

    class movie {
    String movieName;

    public movie(String movieName) {
        this.movieName = movieName;
    }

    public String plot () {
        return "no plot here";
    }

    public String getMovieName() {
        return movieName;
    }
}
    class Jaws extends movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A Shark is destroying everything" ;
    }
    }
    class IndependentDay extends movie {

       public IndependentDay() {
           super("IndependentDay");
       }

       @Override
       public String plot() {
           return "Aliens attempt to take over the planet";
       }
   }

   class MazeRunner extends movie{
       public MazeRunner() {
           super("MazeRunner");

       }

       @Override
       public String plot() {
           return "Boys trying to escape";

       }
   }

   class Forgetable extends movie {
       public Forgetable() {
           super("Forgetable");
       }
   }

public class msin {

    public static void main(String[] args) {
        for (int i=1;i<11;i++) {
            movie Movie=randomMovie();
            System.out.println("Mpvie # " + i + Movie.getMovieName() +"\n"
            + " plot " +Movie.plot() + "\n");
        }

    }

    public static movie randomMovie() {
        int randomNumber=(int) (Math.random() *5+1);
        System.out.println("Random number generated was " +randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependentDay();
            case 3:
                return new MazeRunner();

            case 4:
                return new Forgetable();



        }
        return null;


    }



}
