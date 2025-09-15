import java.util.Objects;

enum Priority{
    HIGH, MEDIUM, LOW
}
enum Status{
    ASSIGNED, IN_QUEUE, IN_PROGRESS
}
public class Task implements Comparable<Task>{

    private String project;
    private String description;
    private String assignee;
    Priority priority;
    Status status;

    public Task(String project, String description, String assignee, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public Task(String project, String description, String assignee, Priority priority) {
        this(project, description, assignee, priority, assignee == null ? Status.IN_QUEUE : Status.ASSIGNED );
    }

    public Task(String project, String description, Priority priority) {
        this(project, description, null, priority,Status.IN_QUEUE);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "%-20s %-20s %-10s %-10s %-10s".formatted(project, description, assignee, String.valueOf(priority), String.valueOf(status));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }


    @Override
    public int compareTo(Task o) {
        int result =  this.project.compareTo(o.project);

        if(result == 0) {
            result = this.description.compareTo(o.description);
        }
        return result;
    }
}
