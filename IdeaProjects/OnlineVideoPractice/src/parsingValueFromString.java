public class parsingValueFromString {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString =" + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number =" + number);

        number +=1;
        numberAsString +=1;

        System.out.println(number);
        System.out.println(numberAsString);




    }
}