package inheritence;

public class dog extends animal {

    private String coat;
    private int eye;
    private int legs;
    private int teeth;
    private int tail;




    public dog(String animalName, int brain, int body, int size, int weight, int eye, int
               legs) {
        super(animalName, 1, 1, size, weight);
        this.eye=eye;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void chew() {
        System.out.println("dog.chew()called");
    }

    public void walk() {
        System.out.println("dog.walk()called");

    }
    public void run() {
        System.out.println("dog.run()called");
    }

}
