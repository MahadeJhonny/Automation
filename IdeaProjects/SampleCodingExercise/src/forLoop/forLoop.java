package forLoop;

public class forLoop {
    public static void main(String[] args) {
        System.out.println("Amount 2000 interest is =" +calculateInterest(2000,2));

    }
    public static double calculateInterest(double amount,double interestRate) {
        return (amount * (interestRate/100)) ;
    }
}
