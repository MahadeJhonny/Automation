package encapsulation.EncapsulationPractice;

public class printer {
    private int tonerLevel;
    private int numberOfpagesPrinted;
    private boolean isduplexPrinter;

    public printer(int tonerLevel, boolean isduplexPrinter) {
        if (tonerLevel > -1 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isduplexPrinter = isduplexPrinter;
        this.numberOfpagesPrinted = 0;
    }

    public int tonnerLevel(int addtoner) {
        if (tonerLevel > -1 && tonerLevel < 100) {
            if (this.tonerLevel + addtoner > 100) {
                return -1;
            }
            this.tonerLevel += addtoner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int numberOfPagesPrinted(int pages) {
        int pagesPrinted = pages;
        if (this.isduplexPrinter) {
            pagesPrinted = (pages / 2) + (pages % 2);
            System.out.println("Print on duplex printer");
        }
        this.numberOfpagesPrinted +=numberOfpagesPrinted;
        return this.numberOfpagesPrinted;
    }

        public int getNumberOfpagesPrinted() {
        return numberOfpagesPrinted;
    }
}