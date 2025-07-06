public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        this(100, false);
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0) ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount < 0) {
            return -1 ;
        }
        int tempAmount = tonerAmount +  tonerLevel;
        if(tempAmount < 0 || tempAmount > 100) {
            return -1 ;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        if(pages <= 0) {
            return -1 ;
        }
        int jobPages = (duplex) ? (pages/2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
