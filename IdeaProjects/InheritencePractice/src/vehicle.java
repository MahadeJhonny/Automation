public class vehicle {

    private String name;
    private String size;

    private  int currentVelocity;
    private  int currentSpeed;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity=0;
        this.currentSpeed=0;
    }
}
