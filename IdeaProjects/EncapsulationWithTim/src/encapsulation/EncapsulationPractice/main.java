package encapsulation.EncapsulationPractice;

public class main {
    public static void main(String[] args) {
        printer newPrinter=new printer(50,true);

        System.out.println("Initial pages printed " +newPrinter.getNumberOfpagesPrinted());

        int PrintPages=newPrinter.numberOfPagesPrinted(10);
        System.out.println("Pages printed was " + PrintPages + " & The total pages printed " +newPrinter.getNumberOfpagesPrinted());


    }
}
