package doWhileLoop;

public class While {

    public static void main(String[] args) {

        int count = 0;
        while (count != 10) {
            count++;
            System.out.println(count);
        }

        count = 1;
        while (true) {
            if (count == 10) {
                count++;
                System.out.println(count);
                break;
            }
        }
    }
}