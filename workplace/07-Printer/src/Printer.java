public class Printer {

    private int tonerLevel ;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {

        this.pagesPrinted = 0;

        if(tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount < 0|| tonerAmount > 100)
            return -1;

        int tempAmount = tonerLevel + tonerAmount;
        if(tempAmount > 100 ){
            return -1;
        }

        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int numberOfPages){

        if(numberOfPages < 0)
            return -1;

        int pagesToPrint = duplex ? numberOfPages/2 + (numberOfPages % 2) : numberOfPages;
        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}