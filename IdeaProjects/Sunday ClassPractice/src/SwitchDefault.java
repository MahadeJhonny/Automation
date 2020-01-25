public class SwitchDefault {

    public static void main(String[] args) {

        int favouriteFood=3;
        String foodName;

        switch (favouriteFood) {
            case 1 :
                foodName = "Pizza";
            break;

            case 2 :foodName = "Burger";
            break;

            case 3 : foodName = "Gayro";
            break;

            case 4 : foodName = "Egg";
            break;

            case 5 :foodName = "Peanut";
            break;

            default:
                System.out.println("My favourite food is AluVorta");


        }

    }
}
