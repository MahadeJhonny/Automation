package VideoPractice;

import java.util.Scanner;

public class scannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            System.out.println("Enter your name : ");
            String name = scanner.nextLine();

            System.out.println("Enter your DOB :  ");
            int dateofBirthYear = scanner.nextInt();
            int age = 2020 - dateofBirthYear;

            if (age > 0 && age <= 100) {
                System.out.println("Your name is " + name + "and you are " + age + "years old");
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("invalid");


            scanner.close();
        }
    }
}
