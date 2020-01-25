public class IfElseStatement {

    public static void ifElse () {
        int Day =4;

        if (Day>0 || Day<3) {
            System.out.println("Saturday,Sunday,Monday");
        } else if (Day==4) {
            System.out.println("Tuesday");
        }else if (Day>4 || Day<=7) {
            System.out.println("wednesday,Thursday,Friday");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
