public class car {

    private String model;
    private int release_year;
    private int milage;
    private String color;

    public String getModel() {
        String validModel=model.toLowerCase();
        return model;
    }

    public void setModel(String model) {
        String validCar=model.toLowerCase();

        if(validCar.equals("Missile") || validCar.equals("SubUrban")) {
            this.model =model;
        }else {
            this.model="invalid";
        }


    }
}


