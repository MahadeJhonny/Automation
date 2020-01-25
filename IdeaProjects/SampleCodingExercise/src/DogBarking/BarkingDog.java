package DogBarking;

public class BarkingDog {

    public static boolean shouldWakeUp() {

        boolean isBarking;
        int hourOfDay= 7;

        if (hourOfDay<8 && hourOfDay<22) {
            System.out.println("Dog Is Barking");
            return true;
        }
        else if(hourOfDay<=0 && hourOfDay>23 ) {
            System.out.println("Dog is not Barking");
            return false;
        }

        else {
            System.out.println("Not a valid input");
        }return false;
    }
}
