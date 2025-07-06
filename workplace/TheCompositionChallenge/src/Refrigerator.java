public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Refrigerator() {
        this.hasWorkToDo = true;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering food...");
            hasWorkToDo = false;
        }
    }
}
