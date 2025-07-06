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

        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        if(pages <= 0) {
            return -1 ;
        }
        int jobPages = (duplex) ? (pages % 2 == 0 ? pages/2 : pages/2 + 1) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
