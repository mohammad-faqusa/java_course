public class Printer {

    private int tonerLevel ;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {

        this.pagesPrinted = 0;

        if(tonerLevel < 0 )
            this.tonerLevel = 0;
        else if(tonerLevel > 100)
            this.tonerLevel = 100;
        else
            this.tonerLevel = tonerLevel;

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount < 0)
            return -1;

        int tempAmount = tonerLevel + tonerAmount;
        if(tempAmount > 100 || tempAmount < 0){
            return -1;
        }

        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int numberOfPages){

        if(numberOfPages < 0)
            return -1;

        int numberOfSheets = duplex ? numberOfPages/2 + (numberOfPages % 2) : numberOfPages;
        pagesPrinted += numberOfSheets;

        return numberOfSheets;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}