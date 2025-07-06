public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public DishWasher() {
        this.hasWorkToDo = true;
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("doing Dishes...");
            hasWorkToDo = false;
        }
    }
}
