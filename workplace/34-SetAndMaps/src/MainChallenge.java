import java.util.Set;

public class MainChallenge {

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("anns");

        for(Task task : tasks) {
            System.out.println(task);
        }
    }
}
