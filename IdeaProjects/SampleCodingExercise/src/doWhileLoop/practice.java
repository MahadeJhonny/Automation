package doWhileLoop;

public class practice {

    public static void main(String[] args) {
        int number=4;
        int FinalNumber=20;
        int evenNumberFound=0;

       while (number<=FinalNumber) {
           number++;
           if (!isEvenNumber(number)) {
               continue;
           }
           evenNumberFound++;
           if(evenNumberFound<=5)
           System.out.println(number);
       }

       // System.out.println(evenNumberFound);






    }

    public static boolean isEvenNumber(int number ) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}