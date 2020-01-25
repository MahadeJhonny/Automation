public class StaticNonStatic01 {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        StaticNonStatic01 myDuck=new StaticNonStatic01() ;
        myDuck.setSize(5);


        System.out.println("The size of Duck is " +myDuck.getSize());
    }


}