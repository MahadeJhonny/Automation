public class ConvertFeetToInches {

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet <= 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid");
            return -1;
        }
        double centiMeters = (feet * 30.48) + (inches * 2.54);
        System.out.println(feet + " Feet " + inches + "Inches = " + centiMeters + "Cm");
        return centiMeters;
    }

    public static void main(String[] args) {
        calFeetAndInchesToCentimeters(6, -8);
        calFeetAndInches(67);
    }

    public static double calFeetAndInches(double inches) {

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(feet + " Feet " + remainingInches + " Inches");
        return inches;

    }


}

