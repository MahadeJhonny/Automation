package TryCatch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//        Scanner Sc=new Scanner(System.in);
//        System.out.println("Enter Your age");
//        int age = Sc.nextInt();
//
//
//        if (age>=18) {
//            System.out.println("Can Enroll in pnT course");
//        }
//        else  {
//            System.out.println("Can't Enroll in PnT course");
//        }


        int num1=60;
        int num2=0;

        int[] Array=new int[3];




        try {
        //    System.out.println(num1/num2);
            Array[0]=4;
            Array[1]=10;
            Array[2]=15;
            Array [3] =20;

        }
        catch (ArithmeticException ex) {
            System.out.println("Can't divide by Zero");
            System.out.println(ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception Caught");

        }
        finally {
            System.out.println("PnT");
        }


//
    }
//
 }
