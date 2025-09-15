import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainChallenge {

    public static void main(String[] args) {

//        anns,bob,carlos

        Set<Task> anns = TaskData.getTasks("anns");
        Set<Task> bob = TaskData.getTasks("bob");
        Set<Task> carlos = TaskData.getTasks("carlos");

        Set<Task> annsBobIntersect = new HashSet<>(anns);
        annsBobIntersect.retainAll(bob);
        printTasks("Intersect", annsBobIntersect);


        Set<Task> annsBobUnion = new HashSet<>(anns);
        annsBobUnion.addAll(bob);
        printTasks("Union", annsBobUnion);

        Set<Task> difference = new HashSet<>(annsBobUnion);
        difference.removeAll(annsBobIntersect);
        printTasks("difference", difference);
    }

    public static void printTasks(String header , Collection<Task> tasks) {
        System.out.println("-".repeat(90));
        System.out.println(header);
        System.out.println("-".repeat(90));
        for(Task task : tasks) {
            System.out.println(task);
        }
    }
}
