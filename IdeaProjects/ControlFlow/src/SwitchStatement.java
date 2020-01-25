public class SwitchStatement {

    public static void main(String[] args) {
        myCharCharectaricties();

        char day=6;

        switch (day) {

            case 1 :
                System.out.println("Go to Library");
                break;

            case 2 :
                System.out.println("Sleep more");
                break;

            case 3 :
                System.out.println("Going lunch");
                break;

            default:
                System.out.println("Chilling");

        }


    }
    public static char myCharCharectaricties () {

        char myChar='A';

        switch (myChar) {

            case 'A' :
                System.out.println("A");
                break;
            case 'B' :
                System.out.println("B");
                break;
            case 'C' :
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E' :
                System.out.println("E");
                break;

                default:
                    System.out.println("Invalid value");

        }
        return myChar;

    }
}
