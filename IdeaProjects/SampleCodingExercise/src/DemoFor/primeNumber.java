package DemoFor;

public class primeNumber {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i < 49; i++) {
            if (findPrimeNumber(i)) {
                count++;
                System.out.println("The prime number is " + findPrimeNumber(i));
                if (count == 3) {
                    System.out.println("exit from loop");
                    break;
                }
            }
        }

    }

    public static boolean findPrimeNumber(int n) {

        if (n==1) {
            return false;
        }
        for (int i=2;i<=n/2;i++) {
            if(n%2==0);
            return false;
        }
        return true;
    }

}
