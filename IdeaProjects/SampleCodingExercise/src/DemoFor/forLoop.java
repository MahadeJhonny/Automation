package DemoFor;

public class forLoop {
    public static void main(String[] args) {

//        for (int i=2;i<9;i++) {
           // System.out.println("Interest " + i + "%" + " totalInterest is "+ findInterestRate(1000,i));

        for (int i=8;i>=2;i--){
            System.out.println("Interest " + i + "%" + " totalInterest is "+ findInterestRate(1000,i));


        }

    }

    public static double findInterestRate(double amount,double interestRate) {
        return ( (amount) * (interestRate/100) ) ;

    }
}
