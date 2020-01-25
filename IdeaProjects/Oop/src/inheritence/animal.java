package inheritence;

public class animal extends dog {

   private String animalName;
   private int brain;
   private int body;
    private int size;
   private int weight;

   public void eat() {
       System.out.println("Animal.ea()called");

   }
   public void move(int move) {

       System.out.println("Dog can move " +move);

   }

    public String getAnimalName() {
        return animalName;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


    public animal(String animalName, int brain, int body, int size, int weight) {
        this.animalName = animalName;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;


    }
}
