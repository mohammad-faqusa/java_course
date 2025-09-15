import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private static String tasks = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, Employee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low
            Data Access, Set Up Users, Low
            Data Access, Set Up Access Policy, Low
            """;

    private static String annsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy,Medium, In Progress
            Research, Cloud solutions, Medium, In Progress
            Data Design, Encryption Policy, High
            Data Design, Project Table, Medium
            Data Access, Write Views, Low, In Progress
            """;

    private static String bobsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low, In Progress
            """;

    private static String carolsTasks = """
            Infrastructure, Logging, High, In Progress
            Infrastructure, DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low
            """;

    public static Set<Task> getTasks(String owner) {

        Set<Task> result = new HashSet<>();

        String ownerName = "anns,bob,carlos".contains(owner) ? owner : "";

        String ownerTasks = switch(ownerName) {
            case "anns" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carlos" -> carolsTasks;
            default -> tasks;
        };

        for(String line : ownerTasks.split("\n")) {

            // split the line
            String[] data = line.split(",");
            Arrays.asList(data).replaceAll(String::trim);

            // assign words to suitable lines

            if(data.length <= 3) {
                result.add(new Task(data[0], data[1], ownerName,  Priority.valueOf(data[2].replaceAll(" ", "_").toUpperCase())));

            } else {
                result.add(new Task(data[0], data[1], ownerName, Priority.valueOf(data[2].replaceAll(" ", "_").toUpperCase()), Status.valueOf(data[3].replaceAll(" ", "_").toUpperCase())));
            }

            // add the task
        }

        return result;

    }
}
