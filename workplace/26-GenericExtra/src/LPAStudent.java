public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = (int)(Math.random() * 100);
    }

    @Override
    public String toString() {
        return super.toString() + " Percent Complete : " + percentComplete;
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}

//5. in main method
//   * create a list of LPA students
//   * print list