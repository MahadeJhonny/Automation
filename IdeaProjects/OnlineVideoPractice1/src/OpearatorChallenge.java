public class OpearatorChallenge {

    public static void main(String[] args) {

        double myValue=20.00;
        double myValue1=80.00;

        double total=(myValue+myValue1) *100;
        System.out.println(total);

        double remainder=total%3;
        System.out.println(remainder);


        boolean remainder1=true;

        if (remainder==0) {

            System.out.println("True");
        }
        else {
            System.out.println("False");
        }



    }
}
