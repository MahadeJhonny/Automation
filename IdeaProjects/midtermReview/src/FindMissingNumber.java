public class FindMissingNumber {



    public static void main(String[] args) {

            int[] numbers = {1,2,3,5};

            int N = 5;
            int idealSum = (N * (N + 1)) / 2;
            int sum = calculateSum(numbers);

            int missingNumber = idealSum - sum;
            System.out.println(missingNumber);
        }

        private static int calculateSum(int[] numbers) {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return sum;
        }
    }

